package chapter12;

import java.io.BufferedReader; 
 import java.io.FileNotFoundException; 
 import java.io.FileReader; 
 import java.io.IOException; 
 
 
 public class StringReader { 
 
 
 	public static void main(String[] args) throws IOException { 
		 
 		BufferedReader in = new BufferedReader(new FileReader("String.txt")); 
		 
 		String str; 
 		 
		while(true) { 
 			str = in.readLine(); 
 			if(str==null) { 
				break; 
 			} 
 		} 
 		 
 		in.close(); 
 
 
 	} 
 
 
 } 
