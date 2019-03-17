package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary dictionary=new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    
    
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String vect[]=txtWord.getText().split(" ");    	
    	
    	txtResult.clear();
    	String alienWord=vect[0].toLowerCase();
    	for(int i=0;i<alienWord.length();i++) {
    		int ch=alienWord.charAt(i);
    		if(ch<'a'||ch>'z') {
    			
    			txtResult.appendText("Formato errato");
    			txtWord.clear();
    			return;
    		}    		
    	}
    	
    	if(vect.length==2) {
    	   String translation=vect[1].toLowerCase();
    	// controllo lettere
    	for(int i=0;i<translation.length();i++) {
    		int ch=translation.charAt(i);
    		if(ch<'a'||ch>'z') {
    			
    			txtResult.appendText("Formato errato");
    			txtWord.clear();
    			return;
    		}    		
    	}    	
    	
    	dictionary.addWord(alienWord, translation);
    	}
    	else if(vect.length==1){    		
    		
    		if(dictionary.translateWord(alienWord)!=null)
    		txtResult.appendText(dictionary.translateWord(alienWord));
    		else {
    			txtResult.appendText("Parola non trovata");
    		}
    	}
    	
    	else {
    		txtResult.appendText("Numero di parole non corretto");
    	}
    	
    	txtWord.clear();
    	
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResult.clear();
    	
    }
    
}
