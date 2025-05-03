import java.util.Scanner;
class Expression{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int exp = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
	int result = switch(exp){
		case 1 -> x+y;
		case 2 -> x-y;
		default ->{
			System.out.println("invalid operation");
			yield 0;
		}
	};
		System.out.println(result);
	}
}
