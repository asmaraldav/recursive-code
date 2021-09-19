import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		int input;
		if (args.length == 0) {
			Scanner read = new Scanner(System.in);

			System.out.print("Please type the numerical code you want to create: ");
			input = read.nextInt();

		} else {
			input = Integer.parseInt(args[0]);
		}

		Code code = new Code(input);

		System.out.println();
		System.out.println("The code " + code.toString() + " was created.");
	}
}
