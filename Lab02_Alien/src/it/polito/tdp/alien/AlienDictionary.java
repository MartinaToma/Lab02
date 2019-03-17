package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;


public class AlienDictionary   {	
	
	List<WordEnhanced> parole=new LinkedList<WordEnhanced>();
	
	public void addWord(String alienWord,String translation) {
		
		int flag=0;
		
		for(WordEnhanced w:parole) {
			if(w.equals(alienWord)) {
				//w.setTranslation(translation);
				w.addSinonimi(translation);
				
				flag=1;
				return;
			}
		}
		
		if(flag==0) {
		
			WordEnhanced p=new WordEnhanced(alienWord,translation);
			parole.add(p);
			p.addSinonimi(translation);
		}
		
				
		
	}
	
	public String translateWord(String alienWord) {
		String s="";
		for(WordEnhanced w:parole) {
			if(w.equals(alienWord)) {
				for(String stringa: w.getSinonimi()) {
					s+=stringa+"\n";
				}
				
			}
		}
		if(s!="") {
			return s.trim();
		}
		
		return null;
	}

}
