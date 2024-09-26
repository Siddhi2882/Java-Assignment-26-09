package Assignments2609;
import java.util.Scanner;
public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of sub1");
		int sub1=sc.nextInt();
		System.out.println("Enter the marks of sub2");
		int sub2=sc.nextInt();
		System.out.println("Enter the marks of sub3");
		int sub3=sc.nextInt();
		int sum=0;
		sum=sub1+sub2+sub3;
		int avg=0;
		avg=sum/3;
		if(avg>=60 && sub1>40 && sub2>40 &&sub3>40)
		{
			System.out.println("you are passsss....!");
		}
		else
		{
			System.out.println("you are fail....!");
		}
		
	}
}
