package Assignments;

public class EmpGroups extends Employees{
	
	
	
	public static void main(String[] args) {
		
		Employees obj = new Employees();
		
		String [] Employess_Names =  {obj.EmployeeName_1, obj.EmployeeName_2, obj.EmployeeName_3 };
		short [] Employess_Ids =  {obj.EmployeeId_1, obj.EmployeeId_2, obj.EmployeeId_3 };

		System.out.println("Employee Name: "+ Employess_Names[0] +" , "+ "Employee ID: "+Employess_Ids[0]);
		System.out.println("Employee Name: "+ Employess_Names[1] +" , "+ "Employee ID: "+Employess_Ids[1]);
		System.out.println("Employee Name: "+ Employess_Names[2] +" , "+ "Employee ID: "+Employess_Ids[2]);
	}

}
