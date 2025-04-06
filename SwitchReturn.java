import java.util.Scanner;
class SwitchReturn{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int exp = sc.nextInt();
		int x = switch(exp){
			case 1->{
				yield 0;
			}
		    default ->{
		    	yield -1;
		    }
		};
		System.out.println("Returned value: " + x);
	}
}