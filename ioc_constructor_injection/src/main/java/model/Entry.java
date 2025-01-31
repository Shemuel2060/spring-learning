package model;

public class Entry {
	
	private String word;
	private String meaning;
	
	private Synonym synonym; 
	
	public Entry(){
		System.out.println("Inside Entry default constructor");
	}
	
	public Entry(String word) {
		System.out.println("Inside Entry one-arg constructor");
		this.word = word;
	}
	
	public Entry(String word, String meaning) {
		System.out.println("Inside Entry 2-args constructor");
		this.word = word;
		this.meaning = meaning;
	}
	
	public Entry(String word, String meaning, Synonym syn) {
		
		System.out.println("Inside Entry 3-args constructor");
		this.word = word;
		this.meaning = meaning;
		this.synonym = syn;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public Synonym getSynonym() {
		return synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}


	

}
