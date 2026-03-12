import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Center of circle: ");
		int middleX = scanner.nextInt();
		int middleY = scanner.nextInt();
		
		System.out.print("Radius: ");
		double radius =  scanner.nextDouble();
		
		System.out.print("Point: ");
		int inputX = scanner.nextInt();
		int inputY = scanner.nextInt();
		
		double distance = Math.sqrt((inputX - middleX) * (inputX - middleX) + 
				(inputY - middleY) * (inputY - middleY));
		
		if (distance <= radius) {
			System.out.print("(" + inputX + ", " + inputY + "): inside the circle");
		} else {
			System.out.print("(" + inputX + ", " + inputY + "): not in the circle");
		}
		
		scanner.close();
	}

}