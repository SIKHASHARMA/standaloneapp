

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeId 
{
    
    String name;
    String desig; 
    
}
public class Main1{
	
	 static void a() {
		Scanner sc = new Scanner(System.in);
		
        EmployeeId emp[] = new EmployeeId[2];
        for (int i = 0; i < 1; i++) {
        	emp[i] = new EmployeeId();
            
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee designation(programmer/tester/manager) : ");
            emp[i].desig = sc.next();
            }
        System.out.println("\nEmployee Details:\n");
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < 1; i++) {
        	String psalary="20000.00";
        	String msalary="30000.00";
        	String tsalary="15000.00";
				if(emp[i].desig.equalsIgnoreCase("programmer")) {
					list.add(emp[i].name);
					list.add(emp[i].desig);
					list.add(psalary);
					//System.out.println("Name, Designation and Salary :" + emp[i].name + " " + emp[i].desig + " " +psalary);
				}
				if(emp[i].desig.equalsIgnoreCase("tester")) {
					list.add(emp[i].name);
					list.add(emp[i].desig);
					list.add(tsalary);
					//System.out.println("Name, Designation and Salary :"  + emp[i].name + " " + emp[i].desig + " " +tsalary);
				}
				if(emp[i].desig.equalsIgnoreCase("manager")) {
					list.add(emp[i].name);
					list.add(emp[i].desig);
					list.add(msalary);
					//System.out.println("Name, Designation and Salary :"  + emp[i].name + " " + emp[i].desig + " " +msalary);
				}
				
				}
        System.out.println(list);
         
        	
        
		
	}
	 
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***enter 1 to create employee***");
		String s = sc.next();
		
		if(s.equalsIgnoreCase("1")) {
			Main1.a();
		}
		
		
		
		while(true) {
			System.out.println("Do you want to continue(y/n) : ");
			Scanner sc1 = new Scanner(System.in);
			String opt = sc1.next();
			if (opt.equalsIgnoreCase("y")) {
				Main1.a();
			}
			else {
				break;
			}
		}
		
		
            }
       }