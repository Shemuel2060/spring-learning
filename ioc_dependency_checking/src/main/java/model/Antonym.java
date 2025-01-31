package model;

import org.springframework.util.Assert;

public class Antonym {
	
	
	private String antonym;
	
	public Antonym(String word) {
		System.out.println("Inside Antonym constructor");
		Assert.notNull(word, "Antonym cannot be null"); // enforce that it has a value
		this.setAntonym(word);
	}
	

	public String getAntonym() {
		return antonym;
	}

	public void setAntonym(String antonym) {
		this.antonym = antonym;
	}
	
	

}
