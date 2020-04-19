import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);


		System.out.print("Enter Score 1 here: ");
		int score1 = in.nextInt();
		System.out.print("Enter Score 2 here: ");
		int score2 = in.nextInt();


		int sum = score1 + score2;
		int difference = score1 - score2;
		int product = score1 * score2;
		double average = (score1 + score2) / 2.0;


		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(average);

		in.close();
	}

}