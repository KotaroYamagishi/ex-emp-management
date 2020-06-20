package jp.co.sample.form;

import java.util.Date;

import javax.validation.constraints.Pattern;

public class UpdateEmployeeForm {

	private Integer id;
	private String name;
	private String image;
	private String gender;
	private Date hireDate;
	private String mailAddress;
	private String zipCode;
	private String address;
	private String telephone;
	private Integer salary;
	private String characteristics;
	@Pattern(regexp = "＼d+",message = "数値を入れてください")
	private String dependentsCount;
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}



	public String getMailAddress() {
		return mailAddress;
	}



	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public String getCharacteristics() {
		return characteristics;
	}



	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}



	



	public String getDependentsCount() {
		return dependentsCount;
	}



	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}



	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + "]";
	}
	
	
}
