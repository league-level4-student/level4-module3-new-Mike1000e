package _01_Spies_On_A_Train;

import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {
	boolean found = false;
    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    			int start = 0;
    			int cluesfound;
    			do {
    				if(start==0) {
    					Node<TrainCar> traincar = train.getHead();
    					String responce = traincar.getValue().questionPassenger();
    					 cluesfound = 0;
    					
    					for(int i = 0; i < clues.length; i++) {
    						if(responce.contains(clues[i])) {
    							cluesfound++;
    						}
    					}
    					if(cluesfound==clues.length) {
    						String croppedhalf = responce.substring(29, responce.length());
    						String fullCrpped = croppedhalf.substring(cluesfound);
    						found = true;
    						return traincar.toString();
    						
    					}else {
    						traincar = traincar.getNext();
    						
    					}
    					
    				}else {
    					Node<TrainCar> traincar = train.getHead();
    					traincar = traincar.getNext();
    					String responce = traincar.getValue().questionPassenger();
    					cluesfound = 0;
    					
    					for(int i = 0; i < clues.length; i++) {
    						if(responce.contains(clues[i])) {
    							cluesfound++;
    						}
    					
    					
    				}
    				
    				}
    				
    			} while(!found); {
    				
    				
    				
    			}
    	
        return "";

    }

}
