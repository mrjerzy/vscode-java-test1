package com.mrjerz;

import java.util.ArrayList;
import java.util.List;

public class Sucher {

    private List<String> liste;

    public Sucher(){
        liste = new ArrayList<String>(); 
    }

    public Sucher(String s){
        liste = new ArrayList<String>(); 
    }

    public void hinzufuegen(String s) throws IllegalArgumentException{
        if (s.isEmpty()) {
            throw new IllegalArgumentException("String may not be empty!"); 
        }

        liste.add(s); 
    }    

    public Boolean suchen(String s){
        if(liste.contains(s)){
            return true;
        }
        return false; 
    }

    public int size(){
        return liste.size(); 
    }

    @Override
    public String toString(){
        String output = ""; 
        if (liste.size() > 0) {
            for(String element : liste){
                output = output.concat(element + "\n");
            }   
        }
        return output; 
    }
}