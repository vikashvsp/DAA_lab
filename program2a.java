package LAB_program;

class Staff{
	private int staffId;
	private String name;
	private long phone;
	private int salary;
	
	public Staff(int sid, String n, long p, int s ) {
		staffId = sid;
		name = n;
		phone = p;
		salary = s;
	}
	
	public void display() {
		System.out.print(staffId+"\t"+name+"\t"+phone+"\t"+salary);
	}
}

class Teaching extends Staff{
	String domain;
	int publications;
	public Teaching(int sid, String n, long p, int s, String d, int pub)
	{
		super(sid,n,p,s);
		domain=d;
		publications=pub;
	}
	public void display()
	{
		super.display();
		System.out.println("\t"+domain+"\t"+publications);
	}
}

class Technical extends Staff{
	String skills;
	public Technical(int sid, String n, long p, int s, String skills)
	{
		super(sid,n,p,s);
		this.skills=skills;
	}
	public void display()
	{
		super.display();
		System.out.println("\t"+skills);
	}
}
class Contract extends Staff{
	int period;
	public Contract(int sid, String n, long p, int s, int period)
	{
		super(sid,n,p,s);
		this.period=period;
	}
	public void display()
	{
		super.display();
		System.out.println("\t"+period);
	}
}

public class program2a {
	public static void main(String arg[])
	{
		Staff sobj[]=new Staff[9];
		sobj[0]= new Teaching(1, "Vikash", 7004387101L,30000," ML",3);
		sobj[1]= new Teaching(2, "Rahul", 7004387171L,30000," AI",4);
		sobj[2]= new Teaching(3, "Mohit", 7004387101L,30000," ML",7);
		sobj[3]= new Technical(4, "Rana", 8744568751L,4000, " java");
		sobj[4]= new Technical(5, "Rina", 8775697871L,4000, " python");
		sobj[5]= new Technical(6, "Mina", 8745654851L,4000, " js");
		sobj[6]= new Contract(7, "Raja", 7894487754L, 70000, 1);
		sobj[7]= new Contract(8, "Rani", 7894487854L, 70000, 2);
		sobj[8]= new Contract(9, "Ram", 7894487824L, 70000, 1);
		
		System.out.println("Teaching staff");
		for(int i=0;i<3;i++)
		{			
			sobj[i].display();
			System.out.println();
		}
		System.out.println("Technical staff");
		for(int i=3;i<6;i++)
		{				
			sobj[i].display();
			System.out.println();
		}
		System.out.println("Contract staff");
		for(int i=6;i<9;i++)
		{	
			sobj[i].display();
			System.out.println();
		}
	}
}
