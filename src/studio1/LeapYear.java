package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n1 is a leap year");
		int n1 = in.nextInt();
		boolean b1 = n1%4==0 && n1%100!=0 && n1%400!=0;
		System.out.println(n1+" is a leap year "+b1);
				
				
				//n1%4==0
		//n1%100!=0 and n1%400==0
		
		
		
		
		
		
	}

}
