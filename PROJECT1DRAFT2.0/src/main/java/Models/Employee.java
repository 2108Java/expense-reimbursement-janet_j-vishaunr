package Models;

import java.util.ArrayList;

public class Employee {
	private String first_Name;
	private String last_name;
	private String title;
	private int id;
	private String reimbursementType;
	private String requestReimbursement;
	private String emailAddress;
	private int amount;
	private String description;
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReimbursementType() {
		return reimbursementType;
	}
	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}
	public String isRequestReimbursement() {
		return requestReimbursement;
	}
	public void setRequestReimbursement(String requestReimbursement) {
		this.requestReimbursement = requestReimbursement;
	}


	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Employee(String first_Name, String last_name, String title, int id) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.title = title;
		this.id = id;
	

		
	}

	public Employee(String first_Name, String last_name) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
	

		
	}
	
	public Employee(String first_Name, String last_name, String title, int id, String reimbursementType,
			String requestReimbursement, String emailAddress) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.title = title;
		this.id = id;
		this.reimbursementType = reimbursementType;
		this.requestReimbursement = requestReimbursement;
		this.emailAddress = emailAddress;
	}
	public Employee( int id, String reimbursementType,
			String requestReimbursement, String emailAddress) {
		super();
		this.id=id;
		this.reimbursementType = reimbursementType;
		this.amount=amount;
		this.description=description;
	
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Employee [first_Name=" + first_Name + ", last_name=" + last_name + ", title=" + title + ", id=" + id
				+ ", reimbursementType=" + reimbursementType + ", requestReimbursement=" + requestReimbursement
				+ ", emailAddress=" + emailAddress + "]";
	}


}
