package Assignments2609;
import java.util.Scanner;
public class ValidAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("enter the income of person");
		int income=sc.nextInt();

		if(age>18 && age<60 && income>25000)
		{
			System.out.println("Person is eligible for loan");
		}
		else
		{
			System.out.println("Not eligible for loan");
		}

}
}

