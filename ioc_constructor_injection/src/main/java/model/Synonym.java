package model;

public class Synonym {
	
	private String word;
	
	
	public Synonym(String word) {
		System.out.println("Inside Synonym one-arg constructor");
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	

}
