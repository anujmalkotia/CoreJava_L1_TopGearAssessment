package Topic_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment_3 {
	public static void main(String[] args) 
	{
		Empdb empDb = new Empdb();
		emp emp1 = new emp("Neeraj",100,"neeraj@gmail.com",20000);
		emp emp2 = new emp("vaibhav",200,"vaibhav@gmail.com",19000);
		emp emp3 = new emp("yajur",300,"yajur@gmail.com",21000);
		emp emp4 = new emp("chitrank",400,"chitrank@gmail.com",12000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (emp emp : empDb.listAll())
			System.out.println(emp.GetDetails());
		
		System.out.println("*************************");
		empDb.deleteEmployee(400);
		
		for (emp emp : empDb.listAll())
			System.out.println(emp.GetDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(100));
	}

}

class emp
{
   String name;
   int empno;
   String empemail;
   int salary;
   
   public emp() {}
   
   public emp(String name, int empno, String empemail, int salary) 
   {
	   super();
	   this.name = name;
	   this.empno = empno;
	   this.empemail = empemail;
	   this.salary = salary;
   }
      
   public String getName() 
   {
	   return name;
   }
   public void setName(String name) 
   {
	   this.name = name;
   }
   public int getEmpno() 
   {
	   return empno;
   }
   public void setEmpno(int empno) 
   {
	   this.empno = empno;
   }
   public String getEmpemail() 
   {
	   return empemail;
   }
   public void setEmpemail(String empemail) 
	{
		this.empemail = empemail;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	public String GetDetails() {
		return "Employee [EmpId=" + empno + ", EmpName=" + name + ", EmpEmail=" + empemail 
				+"EmpSalary=" + salary + "]";
	}
}


class Empdb
{
   List<emp> empdb = new ArrayList<>();
   public boolean addEmployee(emp e) 
   {
	   return empdb.add(e);
   }
	
	public boolean deleteEmployee(int empId) 
	{
		boolean isRemoved = false;
		Iterator<emp> it = empdb.iterator();
	
		while (it.hasNext()) 
		{
			emp emp = it.next();
			if (emp.getEmpno() == empId) 
			{
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) 
	{
		String paySlip = "Invalid employee no";
		
		for (emp e : empdb) 
		{
			if (e.getEmpno() == empId) 
			{
				paySlip = "Pay slip for employee no " + empId + " is " +
						e.getSalary();
			}
		}

		return paySlip;
	}
	
	public emp[] listAll() 
	{
		emp[] empArray = new emp[empdb.size()];
		for (int i = 0; i < empdb.size(); i++)
			empArray[i] = empdb.get(i);
		return empArray;
	}
}
