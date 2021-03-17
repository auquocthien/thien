public class gpt{
	public static void ptb1(double a,double b){
		double x;
		if(a==0){
			if(b==0){
				System.out.println("phuong trinh vo so nghiem");
			}
			else{
				System.out.println("phuong trinh vo nghiem");
			}
		}
		else{
			x=-b/a;
			System.out.println("nghiem phuong trinh la: "+x);
		}
	}
	public static void ptb2(double a,double b,double c){
		double x1,x2,x,d;
		if(a==0){
			if(b==0){
				System.out.println("phuong trinh vo nghiem");
			}
			else{
				gpt.ptb1(b,c);
			}
		}
		else{
			d=b*b-4*a*c;
			if(d>0){
				x1=((-b+Math.sqrt(d)))/(2*a);
				x2=((-b-Math.sqrt(d)))/(2*1);
				System.out.println("nghiem phuon trinh x1: "+x1+"x2: "+x2);
			}
			if(d==0){
				x=(-b/(2*a));
				System.out.println("nghiem phuong trinh x: "+x);
			}
			if(d<0){
				System.out.println("phuong trinh vo nghiem");
			}
		}
	}
}
