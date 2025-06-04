// finding out the smallest number among three in java using methods 

import java.util.Scanner;
class Smallest{
	public static String smallest(int n1,int n2,int n3){
		if((n1<n2)&&(n1<n3)){
			return("The smallest value is "+n1);
		}
		else if((n2<n1)&&(n2<n3)){
			return("The smallest value is "+n2);
		}
		else{
			return("The smallest value is "+n3);
		}
	}
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		System.out.println(smallest(n1, n2, n3));
	}
}
