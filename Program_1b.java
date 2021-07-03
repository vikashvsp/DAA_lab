package LAB_program;
import java.util.Scanner;
public class Program_1b {
		int maxsize, top;
		int stack[];
		Program_1b(int s)
		{
			maxsize=s;
			stack=new int[maxsize];
			top=-1;
			
		}
		void push(int ele) {
			if(top==maxsize-1)
				
				System.out.println("Stack is full");
			else
				stack[++top]=ele;
		}
		void pop() {
			if(top==-1) 
				System.out.println("Stack is empty");
			else
				System.out.println("Element popped is "+stack[top--]);
}
		void display() {
			if(top==-1)
				System.out.println("Stack is empty");
			else
			{
				for(int i=top; i>=0; i--)
					System.out.println(stack[i]+"\t");
				System.out.println();
			}
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int ch;
		Program_1b s=new Program_1b(n);
		do
		{
			System.out.println("Stack operations\n");	
			System.out.println("1.Push\n");	
			System.out.println("2.Pop\n");	
			System.out.println("3.Display\n");	
			System.out.println("4.Exit\n");	
			System.out.println("Enter your choice\n");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter the elements to push");
			int ele=sc.nextInt();
			s.push(ele);
			break;
			case 2: s.pop();
			break;
			case 3: s.display();
			break;
			case 4: break;
			}
		}while(ch!=4);
sc.close();
	}

}
