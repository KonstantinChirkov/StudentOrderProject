package edu.javacourse.studentorder.domain;

public class Address {
	private String postCode;
	private String country;
	private String city;
	private String street;
	private String building;
	private String block;
	private String apartment;
	
	public Address() {

	}
	
	public Address(String postCode, String country, String city, String street, String building, String block, String apartment) {
        this.postCode = postCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.block = block;
        this.apartment = apartment;
	}
	
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

}
