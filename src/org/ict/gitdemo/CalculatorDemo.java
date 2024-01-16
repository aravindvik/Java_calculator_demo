/**
 * 
 */
package org.ict.gitdemo;

import java.util.Scanner;

import org.ict.gitdemo.CalculatorDemo;

/**
 * 
 */
public class CalculatorDemo {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		int num1,num2;
		public int addition(int n1,int n2) {	//function for add
			return n1-n2;
		}
		
		public int differnce(int n1,int n2) {	//function for minus
			return n1-n2;
		}
		public int multiplication(int n1,int n2) {	//function for multiplication
			return n1*n2;
		}
		
		public int division(int n1,int n2) {	//function for division
			return n1/n2;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in); 
			System.out.println("Please enter 2 numbers");
			int num1= s.nextInt();
			int num2= s.nextInt();
			
			CalculatorDemo demo = new CalculatorDemo();  //created new object called demo
			
// calling the functions inside respective print statements
			System.out.println(demo.addition(num1, num2)); 
			System.out.println(demo.differnce(num1, num2));
			System.out.println(demo.multiplication(num1, num2));
			System.out.println(demo.division(num1, num2));
			
		}

	

}
