package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;


public class AlienDictionary   {	
	
	List<Word> parole=new LinkedList<Word>();
	
	public void addWord(String alienWord,String translation) {
		
		int flag=0;
		
		for(Word w:parole) {
			if(w.equals(alienWord)) {
				w.setTranslation(translation);
				flag=1;
				return;
			}
		}
		
		if(flag==0) {
		
			Word p=new Word(alienWord,translation);
			parole.add(p);			
		}
				
		
	}
	
	public String translateWord(String alienWord) {
		
		for(Word w:parole) {
			if(w.equals(alienWord)) {
				return w.getTranslation();
			}
		}
		
		return null;
	}

}
