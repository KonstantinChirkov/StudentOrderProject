package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker {
	
	public CityRegisterCheckerResponse checkPerson(Person person) 
			throws CityRegisterException {
		return new CityRegisterCheckerResponse();
	}

}
