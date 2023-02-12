package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person 
{
	private String certificateNumber;
	private LocalDate issueDate;
	String issueDepartment;

	public Child(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
		super(firstName, lastName, patronymic, dateOfBirth);
		// TODO Auto-generated constructor stub
	}
	
	public String getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueDepartment() {
		return issueDepartment;
	}
	public void setIssueDepartment(String issueDepartment) {
		this.issueDepartment = issueDepartment;
	}
}
	
