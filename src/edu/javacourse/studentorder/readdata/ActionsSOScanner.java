package edu.javacourse.studentorder.readdata;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ActionsSOScanner {
	
	public static List<StudentOrder> addStudentOrder() {
		List<StudentOrder> soList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);;
		String ans;

		do {
			System.out.println("Do you want to create new student order? \n(y/n)");
			ans = scanner.nextLine();
			 if  (lowerCase(ans).equals("y") || lowerCase(ans).equals("yes")) {
				 soList.add(saveStudentOrder());
			 } 
		} while (!(lowerCase(ans).equals("n") || lowerCase(ans).equals("no")));
		
		if (soList.isEmpty()) {
			return null;
		}
		return soList;
	}
	
	public static void printStudentOrder(List<StudentOrder> soList) {
		int i = 1;
		for(StudentOrder studentOrder: soList) {
			System.out.println("Student Order #" + i + ":");
			System.out.println("Husband: " + studentOrder.getHusband().getFirstName() + " " + studentOrder.getHusband().getLastName());
			System.out.println("Wife: " + studentOrder.getWife().getFirstName() + " " + studentOrder.getWife().getLastName());
			System.out.println("");
			i++;
		}
	}
	
	
	
	public static StudentOrder saveStudentOrder() {
		StudentOrder so = new StudentOrder();
		Adult husband = new Adult();
		Adult wife = new Adult();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is husband's first name?");
		husband.setFirstName(scanner.nextLine());
		
		System.out.println("What is husband's last name?");
		husband.setLastName(scanner.nextLine());
		
		System.out.println("What is wife's first name?");
		wife.setFirstName(scanner.nextLine());
		
		System.out.println("What is wife's last name?");
		wife.setLastName(scanner.nextLine());
		
		so.setHusband(husband);
		so.setWife(wife);
		
		return so;
	}
	
	
	
	public static String lowerCase(String text)
	{
	    char[] chars = text.toCharArray();
	    
	    for (int i = 0; i < chars.length; i++)
	    {
	        char c = chars[i];
	        chars[i] = Character.toLowerCase(c);
	    }
	    
	    return new String(chars);
	}
}

