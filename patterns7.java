package Patterns;
import java.util.Scanner;
public class patterns7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();

	}
}
//output
//Enter the num: 4
//1 
//1 2 
//1 2 3 
//1 2 3 4 
