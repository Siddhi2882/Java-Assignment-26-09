package Assignments2609;
import java.util.Scanner;
public class JobApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Person:");
		String name=sc.next();
		System.out.println("Enter Qualifications of person");
		String qualification=sc.next();
		System.out.println("Enter the experience of person");
		int exp=sc.nextInt();
		System.out.println("Enter yes if you clean criminal record");
		int criminal=sc.nextInt();
		
		//if((qualification=="BSc" ||qualification=="B.tech" ||qualification=="B.E" ||qualification=="BCA")&& (exp>1) && (criminal==0))
		if(qualification=="BSc" ||qualification=="B.tech" ||qualification=="B.E" ||qualification=="BCA"){
			if(exp>1 && criminal==0)
			System.out.println("you are eligible for job");
		}
		else
		{
			System.out.println("you are not eligible for job");
		}
	}

}
