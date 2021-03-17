import java.util.Scanner;
public class cau4{
	public int nhap(){
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do{
			System.out.print("nhap vao mot so nguyen: ");
			s=sc.nextLine();
			try{
				n=Integer.parseInt(s);
			}
			catch(NumberFormatException ex){
				n=Integer.MAX_VALUE;	
				System.out.println("sai dinh dang");
			}
		}
		while(n==Integer.MAX_VALUE);{
			return n;
		}
	}
	public static void main(String[] args){
		cau4 t = new cau4();
		int a=t.nhap();
		int b=t.nhap();
		System.out.println("tong a va b la: "+(a+b));
	}
}