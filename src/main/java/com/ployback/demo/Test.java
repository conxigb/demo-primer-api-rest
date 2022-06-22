package com.ployback.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	
	public static void main(String[] args) {
		
		//constructSequence(10, 3, 2);
		getMin("((");
		
	}
	
	public static List<Integer> constructSequence(int n, int lo, int hi) {
		
      
		List<Integer> winner =  new ArrayList<>();
		
		int value = hi;
		

		for (int i = 0; i < n; i++) {
			
			if (i == 0) {
			   winner.add(value-1);
			   
			} else {
				winner.add(value--);
				
			}
		}

		 System.out.println(winner);
		return winner;
		
		
	}
	
	
	public static int getMin(String s) {
	    int count = 0;
		
	    String left;
	    String rigth;
	    
	    StringBuilder cadena = new StringBuilder(s);
	    
	
	    int l = 0;

	    int r = 0;
	    
	    int size = s.length();
	    
	    if(s.length()%2 != 0) {
	    	size++;
	    	cadena.append(")");
	    	
	    	left = cadena.substring(0, size/2);
	    	rigth = cadena.substring(size/2, size);
	    	
	    	if (left.equals(rigth)) {
	    		return 1;
	    	}
	    } else {
	    	
	    	for (char character : s.toCharArray()) {
				if (')'== character) {
					r++;
				}else {
					l++;
				}
			}
	    	
	    	if (r == l) {
	    		return 0;
	    	}else {
	    		return r-l;
	    	}
	    }
	    
	    System.out.println("" + cadena);
	    
		
		
		
		return count;

	}

}
