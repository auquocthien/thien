import java.util.Scanner;
public class cau5{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		gpt pt=new gpt();
		System.out.print("nhap a: ");
		double a=sc.nextDouble();
		System.out.print("nhap b: ");
		double b=sc.nextDouble();
		System.out.print("nhap c: ");
		double c=sc.nextDouble();
		pt.ptb1(a,b);
		System.out.println();
		gpt.ptb2(a,b,c);
	}
}