
import java.util.Scanner;

public class coursework {
    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("name :");
		name=scan.nextLine();
		Double CSE1,CSE2,CSE3,CSE4,CSE5, SUM,AVG;
		System.out.println("calculus :");
		CSE1= scan.nextDouble();
		System.out.println("oop2 :");
		CSE2= scan.nextDouble();
		System.out.println("web design 2 :");
		CSE3= scan.nextDouble();
		System.out.println("research method :");
		CSE4= scan.nextDouble();
		System.out.println("operating system :");
		CSE5= scan.nextDouble();
		SUM=CSE1+CSE2+CSE3+CSE4+CSE5;
		System.out.println("SUM= "+SUM);
		AVG=SUM/5;
		System.out.println("AVERAGE= "+AVG);
		
		if(AVG>=85) {
			System.out.println("GRADE = A");
		}else {
			if(AVG>=75) {
				System.out.println("GRADE = B");
			}else {
				if(AVG>=65) {
					System.out.println("GRADE = C");
				}else {
					if(AVG>=50) {
						System.out.println("GRADE = D");
					}else {
						if(AVG<=49) {
							System.out.println("GRADE = F");
						}
					}
				}
			}
		}
	}
		
}


