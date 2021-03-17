import java.util.Scanner;
public class cau8{
	public void nhap(int a[],int n){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("nhap phan tu thu "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
	}
	public int dem(int x,int a[]){
		int tam=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				tam++;
			}
		}
		return tam;
	}
	public void sapxep(int a[] ){
		int tam;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					tam=a[i];
					a[i]=a[j];
					a[j]=tam;
				}
			}
		}
	}
	public void in(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args){
		cau8 t=new cau8();
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		t.nhap(a,n);
		System.out.println("mang sau khi nhap");
		t.in(a);
		System.out.println();
		System.out.print("nhap x: ");
		int x=sc.nextInt();
		System.out.println("so so x trong mang: "+t.dem(x,a));
		System.out.println("mang sau khi sap xep");
		t.sapxep(a);
		t.in(a);
	}
}
