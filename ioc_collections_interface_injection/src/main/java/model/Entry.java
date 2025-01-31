package model;

import java.util.List;

public class Entry {
	
	private String word;
	
	private List<String> meanings;
	
	private List<Synonym> synonyms; 
	
	public Entry(){
		System.out.println("Inside Entry default constructor");
	}
	
	public Entry(String word) {
		System.out.println("Inside Entry one-arg constructor");
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<String> getMeanings() {
		return meanings;
	}

	public void setMeanings(List<String> meanings) {
		this.meanings = meanings;
	}

	public List<Synonym> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(List<Synonym> synonyms) {
		this.synonyms = synonyms;
	}

	

}
