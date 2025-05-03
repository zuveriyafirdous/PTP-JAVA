import java.util.Scanner;
class CalculatorSwitch{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to calculator");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		System.out.println("what do u want to calculate");
		int val = sc.nextInt();
		System.out.println("enter 2 values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		switch(val){
		case 1:
			System.out.println("Addition is:"+ (x+y));
			break;
		case 2:
			System.out.println("Subtraction is:"+ (x-y));
			break;
		case 3:
			System.out.println("Multiplication is:"+ (x*y));
			break;
		case 4:
			System.out.println("Division is:"+ (x/y));
			break;
		default:
			System.out.println("thank you");
			break;
		}
	}
}
