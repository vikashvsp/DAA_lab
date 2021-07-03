package LAB_program;
import java.util.Scanner;
public class Program_1a{
	String USN, name, branch;
	static long phone;
	Program_1a(String u, String n, String b, long p)
	{		USN=u;
		name=n;
		branch=b;
		phone=p;
	}
	void display()
	{		System.out.println("USN: "+ USN);
		System.out.println("Name: "+ name);
		System.out.println("Branch: "+ branch);
		System.out.println("Phone Number: "+ phone);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of student");
		int n= sc.nextInt();
		Program_1a s[]=new Program_1a[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter the details of student "+(i+1));
			System.out.println("Enter the USN:");
			String usn=sc.next();
			System.out.println("Enter the Name:");
			String na=sc.next();
			System.out.println("Enter the Branch:");
			String br=sc.next();
			System.out.println("Enter the Phone Number:");
			long ph=sc.nextLong();
			s[i]=new Program_1a(usn,na,br,ph);
		}
		System.out.println("Student details:");
		for (int i=0; i<n;i++) {
			System.out.println("The detail of Student "+(i+1)+ " is:");
			s[i].display();
		}
		sc.close();
	}}


