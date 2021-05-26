package test;

import java.util.ArrayList;

public class ArrayListRemoveExample {
	public static void main(String args[]){
	      ArrayList<String> list=new ArrayList<String>(); 
	      list.add("Steve");
	      list.add("Tim");
	      list.add("Lucy");
	      list.add("Pat");
	      list.add("Angela");
	      list.add("Tom");

	      //displaying elements
	      System.out.println(list);

	      //Removing "Steve" and "Angela"
	      list.remove("Steve");
	      list.remove("Angela");
	      System.out.println(list);

	      //Removing 3rd element
	      list.remove(2);

	      //displaying elements
	      System.out.println(list);
	   }
	}

