package LAB_program;
import java.util.Scanner;
import java.util.StringTokenizer;


public class program2b {
	String dd,mm,yyyy;
	
	public void read(String n, String d)
	{
		StringTokenizer st= new StringTokenizer(d,"/");
		dd=st.nextToken();
		mm=st.nextToken();
		yyyy=st.nextToken();
		System.out.println(n+","+dd+","+mm+","+yyyy);	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your DOB in dd/mm/yyyy format");
		String dob=sc.next();
	    program2b c =new program2b();
		c.read(name,dob);
		
	}
}


