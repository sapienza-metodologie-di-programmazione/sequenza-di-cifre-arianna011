package com.sequenza_di_cifre_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sequenza_di_cifre.SequenzaDiCifre;

import junit.framework.TestCase;

public class SequenzaDiCifreTest extends TestCase
{
    
	private static SequenzaDiCifre sq = new SequenzaDiCifre();
	
	//test per aggiungiCifre()
	private static final String s1 = "ciao1questa2èuna0prova123";
	private static final int n1 = 3;
	private static final char[] res1 = new char[] {'1','2','0'};
	
	private static final String s2 = "prova9con1meno8cifredeldovuto";
	private static final int n2 = 5;
	private static final char[] res2 = new char[] {'9','1','8'};
	
	private static final char[] res1_res2 = new char[] {'1','2','0','9','1','8'};
	
	private static final String s3 = "provasenzacifre";
	private static final int n3 = 4;
	private static final char[] res3 = new char[] {};
	
	
	private static final String s4 = "";
	
	private static final int n5 = -3;
	
	//test per toString()
	private static final String string1 = "[]";
	private static final String string2 = "[9,1,8]";
	

    @Test
    public void testAggiungiCifre1()
    {
    	//test standard da sequenza vuota
    	sq.aggiungiCifre(s1, n1);
    	assertArrayEquals(sq.getSequenza(), res1);
    }
    
    @Test
    public void testAggiungiCifre2()
    {
    	//test con stringa contenente meno di N cifre
    	
    	//da sequenza pre-esistente
    	sq.aggiungiCifre(s2, n2);
    	assertArrayEquals(sq.getSequenza(), res1_res2);
    	
    	//da sequenza vuota
    	SequenzaDiCifre sq2 = new SequenzaDiCifre();
    	sq2.aggiungiCifre(s2, n2);
    	assertArrayEquals(sq2.getSequenza(), res2);
    }
    
    @Test
    public void testAggiungiCifre3()
    {
    	//test con stringa priva di cifre
    	
    	//da sequenza pre-esistente
    	sq.aggiungiCifre(s3, n3);
    	assertArrayEquals(sq.getSequenza(), res1_res2);
    	
    	//da sequenza vuota
    	SequenzaDiCifre sq3 = new SequenzaDiCifre();
    	sq3.aggiungiCifre(s3, n3);
    	assertArrayEquals(sq3.getSequenza(), res3);
    }
    
    @Test
    public void testAggiungiCifre4()
    {
    	//test con stringa vuota
    	
    	//da sequenza pre-esistente
    	sq.aggiungiCifre(s4, n3);
    	assertArrayEquals(sq.getSequenza(), res1_res2);
    	
    	//da sequenza vuota
    	SequenzaDiCifre sq4 = new SequenzaDiCifre();
    	sq4.aggiungiCifre(s4, n3);
    	assertArrayEquals(sq4.getSequenza(), res3);
    }
    
    @Test
    public void testAggiungiCifre5()
    {
    	//test con intero negativo in input
    	try
    	{
    		sq.aggiungiCifre(s3, n5);
    	}
    	catch (IllegalArgumentException e) {
    		if (e.getMessage().equals(String.valueOf(n5)))
    			return;
    		else throw new AssertionError();
    	}
    	
    	throw new AssertionError();	
    }
    
    @Test
    public void testToString1()
    {
    	//test con sequenza vuota
    	SequenzaDiCifre sq2 = new SequenzaDiCifre();
    	sq2.aggiungiCifre(s3, n3);
    	assertEquals(sq2.toString(), string1);
    }
    
    @Test
    public void testToString2()
    {
    	//test con sequenza non vuota
    	SequenzaDiCifre sq2 = new SequenzaDiCifre();
    	sq2.aggiungiCifre(s2, n2);
    	assertEquals(sq2.toString(), string2);
    }
    
    
}
