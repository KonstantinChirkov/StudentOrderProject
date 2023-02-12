package edu.javacourse.studentorder.validator;
import java.util.Iterator;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {
	
	public String hostname;
	protected int port;
	private String login;
	String password;
	
	private CityRegisterChecker personChecker;
	
	
	
	public CityRegisterValidator() {
		personChecker = new FakeCityRegisterChecker();
	}
	
	public AnswerCityRegister checkCityRegister(StudentOrder so) {
		try {
			CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
			CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
			
			for(int i = 0; i < so.getChildren().size(); i++) {
				CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChildren().get(i));
			}
			
			for(Iterator<Child> it = so.getChildren().iterator(); it.hasNext(); ) {
				Child child = it.next();
				CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
			}
			
			
			for(Child child : so.getChildren()) {
				CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
			}
			
		} catch (CityRegisterException ex) {
			ex.printStackTrace(System.out);
		}
		
		AnswerCityRegister answer = new AnswerCityRegister();
		return answer;
		
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
