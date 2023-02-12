package edu.javacourse.studentorder;
import java.time.LocalDate;
import java.util.List;

import edu.javacourse.studentorder.domain.Address;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.readdata.*;

public class SaveStudentOrder 
{
	public static void main(String[] args) {
		startAll();
	}
	
	
	static void startAll() {
		
		List<StudentOrder> soList = addStudentOrder();
		
		if (soList == null) {
			return; 
		}
		 
		printStudentOrder(soList);
	}
	
	
	static List<StudentOrder> addStudentOrder() {
		
		List<StudentOrder> soList = ActionsSOScanner.addStudentOrder();
//		List<StudentOrder> soList = ActionsSO_JOP.addStudentOrder();
		
		return soList;
	}
	
	
	public static void printStudentOrder(List<StudentOrder> soList) {
		
		ActionsSOScanner.printStudentOrder(soList);
//		ActionsSO_JOP.printStudentOrder(soList);
		
	}
	
	public static StudentOrder buildStudentOrder(long id) {
		
		StudentOrder so = new StudentOrder();
		
		so.setStudentOrderId(id);
		so.setMarriageCertificateId("" + (123456000 + id));
		so.setMarriageDate(LocalDate.of(2020, 7, 4));
		so.setMarriageOffice("����� ����");
		
		Address address = new Address("195000","���������� ���������", "�����-���������", "��������� ��.", "12", "-", "142");
		
		//���
		Adult husband = new Adult("������", "������", "���������", LocalDate.of(2001, 8, 24));
		husband.setPassportSerial("" + (1000 + id));
		husband.setPassportNumber("" + (100000 + id));
		husband.setIssueDate(LocalDate.of(2021, 9, 15));
		husband.setIssueDepartment("����� ������� �" + id);
		husband.setStudentId("" + (100000 + id));
		husband.setAddress(address);
		
		//����
		Adult wife = new Adult("�������", "��������", "����������", LocalDate.of(2002, 3, 12));
		wife.setPassportSerial("" + (2000 + id));
		wife.setPassportNumber("" + (200000 + id));
		wife.setIssueDate(LocalDate.of(2022, 4, 5));
		wife.setIssueDepartment("����� ������� �" + (10 + id));
		wife.setStudentId("" + (200000 + id));
		wife.setAddress(address);
		
		//1�� ������
		Child child1 = new Child("�������", "�����", "����������", LocalDate.of(2022, 6, 29));
		child1.setCertificateNumber("" + (300000 + id));
		child1.setIssueDate(LocalDate.of(2022, 7, 19));
		child1.setIssueDepartment("����� ���� �" + id);
		child1.setAddress(address);
		
		//2�� ������
		Child child2 = new Child("������", "�������", "����������", LocalDate.of(2022, 6, 29));
		child2.setCertificateNumber("" + (400000 + id));
		child2.setIssueDate(LocalDate.of(2022, 7, 19));
		child2.setIssueDepartment("����� ���� �" + id);
		child2.setAddress(address);
		
		so.setHusband(husband);
		so.setWife(wife);
		so.addChild(child1);
		so.addChild(child2);
		
		return so;
		
	}
}
