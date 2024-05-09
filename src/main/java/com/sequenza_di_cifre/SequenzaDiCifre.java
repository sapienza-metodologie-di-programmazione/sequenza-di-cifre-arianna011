package com.sequenza_di_cifre;
import java.util.ArrayList;

/**
 * Classe che implementa una sequenza di cifre (di tipo char)
 */
public class SequenzaDiCifre 
{
	private char[] sequenza = new char[]{};
	
	public char[] getSequenza() { return sequenza; }
	
	/**
	 * Metodo che, data in input una stringa e un intero N, 
	 * aggiunge alla sequenza le prime N cifre contenute nella stringa
	 * (se la stringa contiene meno di N cifre, aggiungere quelle presenti)
	 */
	public void aggiungiCifre(String s, int N) {
		
		//if (N < 0) throw new IllegalArgumentException(String.valueOf(N));
		
		ArrayList<Character> l = new ArrayList<Character>();
		
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) l.add(c);
		}
		
		if (l.size() == 0) return;
		
		char[] newSeq = new char[sequenza.length + Math.min(N, l.size())];
		
		for (int i = 0; i<newSeq.length; i++) {
			if (i<sequenza.length) newSeq[i] = sequenza[i];
			else newSeq[i] = l.get(i - sequenza.length);
		}
		
		sequenza = newSeq;
	}
	
	//sovrascrivere il metodo toString ereditato dalla classe Object
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i=0; i<sequenza.length; i++) {
			sb.append(sequenza[i]);
			if (i != sequenza.length-1) sb.append(",");
		}
		sb.append("]");
		return sb.toString();	
	}
	
	
}
