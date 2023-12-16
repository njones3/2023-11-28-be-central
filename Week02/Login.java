package Week02;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean loggedIn = false;
		int attempts = 3;
		
		while (!loggedIn && attempts != 0) {
		System.out.print("Enter username: ");   
		String username = sc.nextLine();   
		System.out.print("Enter password: ");  
		String password = sc.nextLine();   
		if (username.equals("samy123") && password.equals("12345")) {
		System.out.println("Welcome back " + username);
		loggedIn = true;
		    } else { 
		System.out.println("Inaccurate credentials!");
		attempts--;
		} // end of else 
		} // end of while
		
		if (attempts == 0) {
			System.out.println("You have reached the limit!!");
	
			}
		}
	
	}

	


