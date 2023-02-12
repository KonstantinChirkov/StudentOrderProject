package edu.javacourse.studentorder;
import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.*;

public class StudentOrderValidator {
	
	private CityRegisterValidator cityRegisterVal;
	private MarriageValidator marriageVal;
	private ChildrenValidator childrenVal;
	private StudentValidator studentVal;
	private MailSender ms;
	
	public StudentOrderValidator() {
		cityRegisterVal = new CityRegisterValidator();
		marriageVal = new MarriageValidator();
		childrenVal = new ChildrenValidator();
		studentVal = new StudentValidator();
		ms = new MailSender();
	}
	
	
	public static void main(String[] args) {
		StudentOrderValidator sov = new StudentOrderValidator();
		sov.checkAll();
	}
	
	public void checkAll() {
		StudentOrder[] soArray = readStudentOrder();
		
		for(StudentOrder so : soArray) {
			checkOneSO(so);
		}
		
	}
	
	public StudentOrder[] readStudentOrder() {
		StudentOrder[] soArray = new StudentOrder[3];
		
		for (int i = 0; i < soArray.length; i++) {
			soArray[i] = SaveStudentOrder.buildStudentOrder(i);
		}
		
		return soArray;
	}
	
	public void checkOneSO(StudentOrder so) {
		AnswerCityRegister cityRegisterAnswer = checkCityRegister(so);
//		AnswerMarriage marriageAnswer = checkMarriage(so);
//		AnswerChildren childrenAnswer = checkChildren(so);
//		AnswerStudent studentAnswer = checkStudent(so);
		
		sendAnswer(so);
	}
	
	public AnswerCityRegister checkCityRegister(StudentOrder so) {
		
		cityRegisterVal.hostname = "host1";
		cityRegisterVal.setLogin("login1");
		cityRegisterVal.setPassword("password1");

		return cityRegisterVal.checkCityRegister(so);
		
	}
	
	public AnswerMarriage checkMarriage(StudentOrder so) {
		
		return marriageVal.checkMarriage(so);
		
	}
	
	public AnswerChildren checkChildren(StudentOrder so) {

		return childrenVal.checkChildren(so);
		
	}
	
	public AnswerStudent checkStudent(StudentOrder so) {
		
		return studentVal.checkStudent(so);
		
	}
	
	public void sendAnswer(StudentOrder so) {
		
		ms.sendAnswer(so);
		
	}

}
