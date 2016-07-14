package com.flp.ems.view;
import java.util.Scanner;
import java.util.HashMap;

public class UserInteraction {
	public void AddEmployee() {
		Scanner val = new Scanner(System.in);
		Department dep = new Department();
		
		
		System.out.print(" Enter EmployeeID : \n ");
		int num = val.nextInt();
		
		
		System.out.print( " Enter Name :\n "  );
		String name = val.next();
		
		
		System.out.print( "Enter Kin ID \n  " );
		int kid = val.nextInt();
		
		
		System.out.print( "Enter E-mail ID \n " );
		String email = val.next();
		
		
		System.out.print( " Enter phone num \n " );
		Long pn = val.nextLong();
		
		
		System.out.print( "Enter date of birth \n " );
		String dob = val.next();
		
		
		System.out.print( " Enter date of joining \n "  );
		String doj = val.next();
		
		
		System.out.print( "Enter address \n ");
		String a = val.next();
		
		
		dep.dept();
		
		
		/*System.out.print( " Enter Department ID \n" );
		int did = val.nextInt();
		
		
		System.out.print( "Enter Project ID \n "  );
		int pid = val.nextInt();
		
		
		System.out.print( "Enter Roles ID "  );
		int rid = val.nextInt();*/
		
		HashMap hama = new HashMap();
		hama.put( "Employeeid", num );
		hama.put( "Employeename", name);
		hama.put( "Kinid", kid );
		hama.put("E-mail", email);
		hama.put( "Phonenum ", pn);
		hama.put( "Dob", dob);
		hama.put( "Doj", doj);
		hama.put( "Address", a);
		/*hama.put( "Deptid",did );
		hama.put( "Projectid ", pid);
		hama.put( "Rolesid ", rid);*/
		
		
		
		
		
	}
	public void ModifyEmployee(){
		
	}
	public void RemoveEmployee(){
		
	}
	public void SearchEmployee(){
		
	}
	public void getAllEmployee(){
		
	}

}
