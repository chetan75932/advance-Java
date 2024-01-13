package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.Emp_addService;
import com.demo.service.Emp_addServiceImpl;

public class TestCrud {

	public static void main(String[] args)
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
		Emp_addService eds=new Emp_addServiceImpl();
		do {
			System.out.println("1. Add new USer\n2. Display all user\n3. display by id");
			System.out.println("4. delete by id\n5. update by id\n6. sort by id\n7. exit");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				eds.AddEmploee();
			break;
				
			case 2:
				List<Employee> elist=eds.displayAllEmp();
				elist.stream().forEach(System.out::println);
				break;
				
			case 3:
				System.out.println("Enter EmpID :");
				int eId=sc.nextInt();
				Employee e=eds.displayById(eId);
				if(e!=null) {
					System.out.println("Employee found"+e);
				}else {
					System.out.println("Employee not found");
				}
				break;
				
			case 4:
				break;
			case 5:
				break;
				
			case 6:
				break;
			case 7:
				break;
			default :
				System.out.println("Invalid Choice");
		   }
	
		}while(choice!=7);
		
	}
}
