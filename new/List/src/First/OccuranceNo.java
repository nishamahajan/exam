package First;

import java.util.*;

public class OccuranceNo 
{
	 public static void countFrequencies(ArrayList<Integer> list) 
	 { 
	        Set<Integer> st = new HashSet<Integer>(list); 
	        System.out.println("The detials of occurances as follows:");
	        for (Integer i : st) 
	            System.out.println(i + ": " + Collections.frequency(list, i)); 
	 } 
	  
	 public static void main(String[] args) 
	 { 
	       ArrayList<Integer> list = new ArrayList<Integer>();
	       list.add(101);
	       list.add(102);
	       list.add(103);
	       list.add(101);
	       list.add(101);
	       list.add(101);
	       list.add(102);
	        OccuranceNo.countFrequencies(list); 
	    } 
}
