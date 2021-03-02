class Employee
{
	int Emp_no;
	String Emp_name,Designation;
	double Basic_Salary,Gs,Da,Hra,Pf,It;
	Employee(int eno,String ename,String des,double basic)
	{
		Emp_no=eno;
		Emp_name=ename;
		Designation=des;
		Basic_Salary=basic;
	}
	void Calculate()
	{
		Da=0.6*Basic_Salary;
		Hra=0.25*Basic_Salary;
		Gs=Da+Hra;
		Pf=0.12*Gs;
		It=0.10*Gs;
	}
	void showEmp()
	{
		System.out.println("Employee id: "+Emp_no);
		System.out.println("Employee name: "+Emp_name);
		System.out.println("Designation: "+Designation);
	}
	void showSalary()
	{
		System.out.println("Salary Details are (in Rs): ");
		System.out.println("Basic Salary is "+Basic_Salary);
		System.out.println("DA\tHRA\tGS\tPF\tIT");
		System.out.println(Da+"\t"+Hra+"\t"+Gs+"\t"+Pf+"\t"+It);
	}
}
class EmpInfo
{
	public static void main(String ar[])
	{
		Employee e1=new Employee(37,"Rohit Shimpi","Manager",75000);
		e1.Calculate();
		e1.showEmp();
		e1.showSalary();
	}
}

/*OUTPUT:-
Employee id: 37
Employee name: Rohit Shimpi
Designation: Manager
Salary Details are (in Rs):
Basic Salary is 75000.0
DA      HRA     GS      PF      IT
45000.0 18750.0 63750.0 7650.0  6375.0
Press any key to continue . . .
*/
