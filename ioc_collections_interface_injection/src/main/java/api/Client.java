package api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Entry;
import model.UserPreferences;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring_ioc.xml");
		
		Entry entry = (Entry) ap.getBean("entry");
		
		UserPreferences userPrefs = (UserPreferences) ap.getBean("user-prefs");
		
		System.out.println("\n"+entry.getWord());
		entry.getMeanings().forEach(meaning ->{
			System.out.println("    "+ meaning);
		});
		
		System.out.println("\nSynonyms");
		entry.getSynonyms().forEach(synonym ->{
			System.out.println(""+ synonym.getWord());
		});
		
		System.out.println("\nUser Preferences");
		System.out.println("Theme: "+ userPrefs.getPreference("color"));
		System.out.println("Font Size: "+ userPrefs.getPreference("fontSize"));
	}

}
