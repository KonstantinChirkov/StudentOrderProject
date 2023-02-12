package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
	public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
