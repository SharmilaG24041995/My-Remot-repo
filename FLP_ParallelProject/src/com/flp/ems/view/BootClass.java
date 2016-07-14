package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	  public static void main(String[] args) {
		BootClass bc= new BootClass();
		bc.menuSelection();
	}
	
	public void menuSelection() {
		
		UserInteraction obj = new UserInteraction();
		
		System.out.println("Enter 1 for AddEmployee: ");
		System.out.println("Enter 2 for ModifyEmployee: ");
		System.out.println("Enter 3 for RemoveEmployee: ");
		System.out.println("Enter 4 for SearchEmployee: ");
		System.out.println("Enter 5 for getAllEmployee: ");
		Scanner val = new Scanner(System.in);
		int num = val.nextInt();
		
		switch(num){
		case 1:
			obj.AddEmployee();
			break;
		case 2:
			obj.ModifyEmployee();
			break;
		case 3:
			obj.RemoveEmployee();
			break;
		case 4:
			obj.SearchEmployee();
			break;
		case 5:
			obj.getAllEmployee();
			break;
		}
	}
		
	}
