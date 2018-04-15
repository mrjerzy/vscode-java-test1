package com.mrjerz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SucherTest {

    @Test(expected = IllegalArgumentException.class)
    public void testhinzufuegenException() {
        Sucher s = new Sucher();
        s.hinzufuegen(new String(""));
    }

    /** 
     * Teste ob 
     */
    @Test
    public void testHinzufuegenNoException() {
        Sucher s = new Sucher();
        s.hinzufuegen(new String("ABC"));
    }

    @Test
    public void testHinzufuegenElement() {
        Sucher s = new Sucher();
        assertTrue("Sucher Liste war nicht leer!", s.size() == 0); 
        s.hinzufuegen("Test");
        assertTrue("Sucher Lise ist nicht angewachsen",s.size() > 0); 
    }

    @Test
    public void testSucheFindetElement(){
        Sucher s = new Sucher();

        String[] elemente = new String[]{"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"}; 

        for(String element : elemente){
            s.hinzufuegen(element);
        }

        for(String element : elemente){
            assertTrue("Element: \"" + element + "\" nicht gefunden", s.suchen(element));
        }
    }
}