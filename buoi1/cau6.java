import java.util.Scanner;
public class cau6{
	public static void ktsnt(int n){
		int tam=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				tam++;
			}
		}
		if(tam==0){
			System.out.println("n la so nguyen to");
		}
		else{
			System.out.println("n khong la so nguyen to");
		}
	}
	public static void np(int n){
		int a=n;
        int kq=0,i=1,chiadu;
        do{
            chiadu=n%2;
            kq=kq+(i*chiadu);
            n=n/2;
            i=i*10;
        }while(n>0);
        System.out.println("So nhi phan cua "+a+" la: "+kq);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so nguyen: ");
		int n = sc.nextInt();
		cau6.ktsnt(n);
		System.out.println("dang nhi phan cua so vua nhap");
		cau6.np(n);
	}
}