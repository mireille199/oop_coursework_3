import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] args) {
		 String StdId,regNo;
		 int year;
		 int sum;
		 Scanner scan = new Scanner(System.in);
		
//		
			
//		
//		System.out.println("STUDENT NAME :"+sd1.getName());
//		
//		System.out.println("STUDENT YEAR OF BIRTH :"+sd1.getYOB());		
//		
//		System.out.println("STUDENT REGISTRATION NUMBER :"+sd1.getRegNO());	
		
		System.out.println("Enter Student's Name: ");
		 StdId = scan.nextLine();
		System.out.println("Enter Student's Registration N0.: ");
		regNo = scan.nextLine();
		System.out.println("Enter Student's Date Of Birth: ");
		while(true) {
			int yr = scan.nextInt();
			if(yr>1975 && yr<2005) {
				year = yr;
				break;
			}else
				System.out.println("Years Not Applicable");
		}	
		
		Student sd1 = new Student(regNo,StdId,year);
		
		
		sd1.getCourseWork();
		
	
	}
}

