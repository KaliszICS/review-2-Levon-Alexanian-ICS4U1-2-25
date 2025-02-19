import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        String name = scan.nextLine();
		System.out.println(name);
		
	}

	public static void q2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        int num1 = scan.nextInt();
		System.out.print("In: ");
        int num2 = scan.nextInt();
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}

	public static void q3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        String name = scan.nextLine();
		System.out.println(name+" was the text you wrote");
		
	}

	public static void q4() {
		// Get an integer from user input using "In: " as the prompt. Output the result of the integer times by 5.
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        int num1 = scan.nextInt();
		System.out.println(num1 * 5);
	}

	public static void q5() {
		//Get a boolean using "In: " as the prompt. Output the boolean followed by " is a boolean"
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        boolean bool = scan.nextBoolean();
		System.out.println(bool + " is a boolean");
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
        double num1 = scan.nextDouble();
		System.out.println(num1 - 3.2);
	}

}
