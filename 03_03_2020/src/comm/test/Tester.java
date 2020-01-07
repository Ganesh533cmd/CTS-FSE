package comm.test;
import comm.example.*;

import java.util.Scanner;
//import static java.lang.System.*;

public class Tester {
	
	private static Scanner sc=new Scanner(System.in);


	static double amount;
	public static void main(String[] args) {													//Account.java
			int ch=-1;
			Account ac1;
			do {
				System.out.println("1. Create Account\n2. Display A/c Details\n0. Exit");
				System.out.println("choose (1,2,0) : ");
				ch=sc.nextInt();
				switch(ch) {
				case 1: 
					System.out.println("Enter Amount: ");
					amount=sc.nextDouble();
					ac1=Account.crtAc(AcType.SAVINGS, amount);
					System.out.println("A/c created..\n");
					break;
				case 2:
					ac1=Account.crtAc(AcType.SAVINGS, amount);
					ac1.displayAc();
					break;
				case 0:
					System.out.println("\bExit");
					break;
				}
			}while(ch!=0);
	
	}
}
