package ccc;
import java.util.Scanner;
public class ccc {

	public static void main(String[] args) {
		int num1 = (int)(System.currentTimeMillis()%10);
		int num2 = (int)(System.currentTimeMillis()/10%10);
		Scanner input = new Scanner(System.in);
		System.out.print(
				"What is " + num1 + " + " + num2 + " ?");
		int answer = input.nextInt();
		System.out.println(
				num1 + " + " + num2 + " = " + answer + " is " + (num1+num2 == answer));
	}

}
