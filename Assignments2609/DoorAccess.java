package Assignments2609;
import java.util.Scanner;
public class DoorAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of person");
		int personid = sc.nextInt();
		System.out.println("Enter the access card number");
		int cardNo = sc.nextInt();
		System.out.println("Enter Admin Name");
		String name = sc.next();

		int id = 1237654;
		int card = 7665568;
		String admin = "Siddhi";

		if ((id == personid && card == cardNo) || (name.equals("admin"))) {
			System.out.println("Person is allowed to enter ");
		} else {
			System.out.println("Person is not allowed to enter");
		}
	}

}
