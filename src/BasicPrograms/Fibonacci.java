package BasicPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

        int count, n1=0,n2=1,n3;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		count=in.nextInt();
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<count; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}

	}

}
