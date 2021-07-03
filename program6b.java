package LAB_program;
import java.util.Scanner;
public class program6b {
	 public static void main(String args[]) {
    	 float w[]= new float[10], p[]=new float[10];
    	 float ratio[]=new float[10];
    	 Scanner in  =  new Scanner(System.in);
    	 int i;
    	 
    	 System.out.println("-----Knapsack problem-------");
    	 System.out.println("Enter the total number of items");
    	 int n= in.nextInt();
    	 
    	 System.out.println("Enter the weight of each item");
    	 for(i=1;i<=n;i++) 
    		 w[i]=in.nextFloat();
    	 
    	 System.out.println("Enter the profit of each item");
    	 for(i=1;i<=n;i++)
    		 p[i]= in.nextFloat();
    	 
    	 System.out.println("Enter the knapsack capacity");
    	 int m=in.nextInt();
    	 
    	 for(i=1;i<=n;i++)
    		 ratio[i]=p[i]/w[i];
    	 
    	 System.out.println("Information abt knapsack problem are:");
    	 displayinfo(n,w,p,ratio);
    	 
    	 System.out.println("Capacity="+m);
    	 sortArray(n,ratio,w,p);
    	 
    	 System.out.println("\n Details after sorting items based on profit/weight ratio in decending order:");
    	 displayinfo(n,w,p,ratio);
    	 knapsack(m,n,w,p);
    	         System.out.println("--------------");
    	 
    	 
    	 
    		 
    	 
    	 
     }
static void sortArray(int n,float ratio[],float w[],float p[]) {
   int i,j;
   for(i=1;i<=n;i++) {
	   for(j=1;j<=n-i;j++) {
		   if(ratio[j]<ratio[j+1]) {
			   float temp = ratio[j];
			   ratio[j]=ratio[j+1];
			   ratio[j+1]=temp;
			   
			   temp=w[j];
			   w[j]=w[j+1];
			   w[j+1]=temp;
			   
			   temp=p[j];
			   p[j]=p[j+1];
			   p[j+1]=temp;
		   }
	   }
   }
}


static void displayinfo(int n,float w[],float p[],float ratio[]) {
   System.out.println("Item \t weight\t profit\t ratio(profit/weight)");
   for(int i=1;i<=n;i++) {
	   System.out.println(i+"\t"+w[i]+"\t"+p[i]+"\t"+ratio[i]);
   }
}
static void knapsack(int u,int n, float w[],float p[]) {
   float x[]=new float [10],tp=0;
   int i;
   for(i=1;i<=n;i++) {
	   if(w[i]>u)
		   break;
	   else
	   {
		   x[i]=1;
		   tp=tp+p[i];
		   u=(int)(u-w[i]);
	   }
   }
   if(i<n)
	   x[i]=u/w[i];
   tp=tp+x[i]*p[i];
    
   
   System.out.println("\n The result is=");
   for(i=1;i<=n;i++)
	   System.out.print("\t"+x[i]);
   
   System.out.println("\n Maximum profit is:"+tp);

}
}
