package com.mul;

import java.util.ArrayList;
import java.util.List;

public class Namelength {
	public static void main(String[] args) {
		List<employee> list=new ArrayList<employee>();
		list.add(new employee(84,"vaish","vaishnavi"));
		list.add(new employee(74,"aishu","aishu87"));
		list.add(new employee(60,"navyaa","navya74"));
		
		for(employee c:list) {
			if(c.getName().length()>5)
				System.out.println(c.getName());
		}
	}}


