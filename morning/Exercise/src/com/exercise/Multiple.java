package com.exercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multiple {

		 public static void main(String[] args)
		 { 
		  
		  Map<String, List<String>> map = new HashMap<String, List<String>>();
		  
		               
		  List<String> ecm = new ArrayList<String>();
		  ecm.add("hima");
		  ecm.add("vaish");            
		  List<String> cse = new ArrayList<String>();
		  cse.add("aish");
		  cse.add("kanth");
		  
		               
		  List<String> me = new ArrayList<String>();
		  me.add("sai");
		  me.add("kumar");
		             
		  map.put("ecm", ecm);
		  map.put("cse", cse);
		  map.put("me", me);
		  
		  for (Map.Entry<String, List<String>> entry : map.entrySet())
		  {
		   String key = entry.getKey();
		   List<String> values = entry.getValue();
		   System.out.println("Key = " + key);
		   System.out.println("Values = " + values );
		  }
		 }
		
		}


