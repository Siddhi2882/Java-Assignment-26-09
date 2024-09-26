package Assignments2609;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		System.out.println("Enter the country");
		String country=sc.next();
		
		String citizen="India";
		if(age>=18 && citizen.equals(country))
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}

}
