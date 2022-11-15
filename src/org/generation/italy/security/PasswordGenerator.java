package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name:");
		String userName = sc.nextLine();
		
		System.out.print("Surname:");
		String userSurname = sc.nextLine();
		
		System.out.print("Favorite Color:");
		String favColor = sc.nextLine();
		
		System.out.print("Insert birth day:");
		int birthDay = sc.nextInt();
		
		System.out.print("Insert birth month:");
		int birthMonth = sc.nextInt();
		
		System.out.print("Insert birth year:");
		int birthYear = sc.nextInt();
		
		int sumNumber = birthDay + birthMonth + birthYear;
		
		System.out.println(userName + userSurname +favColor + sumNumber);
				
	}

}
