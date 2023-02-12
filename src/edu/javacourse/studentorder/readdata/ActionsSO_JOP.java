package edu.javacourse.studentorder.readdata;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ActionsSO_JOP {
	
	public static List<StudentOrder> addStudentOrder() {
		
		List<StudentOrder> soList = new ArrayList<>();
		String ans;
		
		do {
			 ans = JOptionPane.showInputDialog("Do you want to create new student order? \n(y/n)");
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
			JOptionPane.showMessageDialog(null, "Student Order #" + i + ":" + 
										"\nHusband: " + studentOrder.getHusband().getFirstName() + 
										" " + studentOrder.getHusband().getLastName() +  
										"\nWife: " + studentOrder.getWife().getFirstName() + 
										" " + studentOrder.getWife().getLastName());
			i++;
		}
	}
	
	
	public static StudentOrder saveStudentOrder() {
		StudentOrder so = new StudentOrder();
		Adult husband = new Adult();
		Adult wife = new Adult();

		husband.setFirstName(JOptionPane.showInputDialog("What is husband's first name?"));
		husband.setLastName(JOptionPane.showInputDialog("What is husband's last name?"));
		
		wife.setFirstName(JOptionPane.showInputDialog("What is wife's first name?"));
		wife.setLastName(JOptionPane.showInputDialog("What is wife's last name?"));
		
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
