package Patterns;

import java.util.Scanner;

public class StarPattern {
	
	public static void main(String args[]) {
		System.out.println("Enter the Pattern Height");
		Scanner sc= new Scanner(System.in); 
		//int value= sc.nextInt();
		int value=6;
		
		
		//Pattern - 1
		for(int i=0;i<value;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
