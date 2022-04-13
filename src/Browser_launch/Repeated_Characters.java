package Browser_launch;

import java.util.Scanner;

public class Repeated_Characters {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word :");
		String str = s.nextLine();
		str = str.toLowerCase();
		int count;
		int n = str.length();
		String[] ch = str.split("");
		for (String i : ch) {
			System.out.println(i);}
			for (int i = 0; i < n; i++) {
				count = 1;
				for (int j = i+1; j < n; j++) {
					if (ch[i].equals(ch[j])) {
						count++;
						ch[j]="0";}}
					if (count >= 1 && ch[i]!="0") {
						System.out.println("Letter =" +ch[i] + "  Count =" +count);
					
					}
						
					}
					
					
				}
				
			}
			
			
		
	


