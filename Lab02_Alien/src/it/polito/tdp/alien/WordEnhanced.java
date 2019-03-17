package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {	

	private String alienWord;
	private String translation;
	private List<String> sinonimi;
	

	public WordEnhanced(String alienWord, String translation) {
		
		this.alienWord = alienWord;
		this.translation = translation;
		sinonimi=new LinkedList<String>();
	}
	
	public void addSinonimi(String s) {
		if(!sinonimi.contains(s)) {
			sinonimi.add(s);
		}
	}

	public List<String> getSinonimi() {
		return sinonimi;
	}

	public String getAlienWord() {
		return alienWord;
	}
		

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}	

	public boolean equals(String s) {			
		if(alienWord.compareTo(s)==0) {
			return true;
		}	
	     return false;
        }
	
	
	}
