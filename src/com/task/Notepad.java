package com.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Notepad {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File text = new File("C:\\Users\\user\\Desktop\\Notepad reader.txt");
		Scanner s = new Scanner(text);
		
		s.delimiter();
		System.out.println(s.nextLine());
		System.out.println(s.nextLine());
		System.out.println(s.nextLine());
		System.out.println(s.nextLine());
		System.out.println(s.nextLine());
		System.out.println(s.nextLine());
		
	}

}
