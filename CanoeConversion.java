import java.util.Scanner;
public class CanoeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i=1;i<100;i++) {
		System.out.println("Enter distance in rods");
		double rods = input.nextDouble();
		System.out.println("Meters:" + rods*5.0292);
		System.out.println("Furlongs:" + rods/40);
		System.out.println("Miles:" + rods*5.0292/1609.34);
		System.out.println("Feet:" + rods*5.0292/0.3048);
		System.out.println("Hours (Average Walking Speed):" + rods*5.0292/1609.34/3.1);
		}
	}

}
