package student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double height;
		System.out.println("Enter the number of Person : ");
		int num = sc.nextInt();
		Person [] p = new Person[num];
		
		for(int i=0; i<p.length; i++) {
			
			name = null;
			height = 0;
			System.out.print("\nEnter your Name : ");
			name = sc.next();
				
			try {
				System.out.print("Enter your height : ");
				height = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("please enter only Integer");
				sc.nextLine();
						
			}
				
			p[i] = new Person(name, height);
		}
		
		for(int i=0; i<p.length; i++) {
			
			System.out.println("\n"+(i+1)+". person Details"+p[i]);
			
		}
		System.out.println();
	}
}
