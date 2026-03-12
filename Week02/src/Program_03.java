import java.util.Scanner;

public class Program_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		final int dot1 = 100;
		final int dot2 = 200;

		System.out.print("Coordinates of a point (x, y): ");
		
		int inputX = scanner.nextInt();
		int inputY = scanner.nextInt();
		
		if (inputX >= dot1 && inputX <= dot2 && inputY >= dot1 && inputY <= dot2) {
			System.out.println("(" + inputX + ", " + inputY + "): inside the rectangle");
		} else {
			System.out.println("(" + inputX + ", " + inputY + "): not in the rectangle");
		}
		
		scanner.close();
	}

}
