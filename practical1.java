import java.util.Scanner;
class practical1{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Meter  to  feet");
		
		System.out.printf("Meter:");
		double d1=sc.nextDouble();
		
		double M_TO_F=3.28084;
		double feet=d1*M_TO_F;
		System.out.printf("feet:"+feet);
		
		}
	
	
	}