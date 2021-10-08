package Models;

public class Manager {
	private String first_Name;
	private String last_name;
	private String title;
	private int id;
	private String emailAddress;
	private String reimbursementType;
	private String requestReimbursement;
	private boolean approve;
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public boolean isApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
	}
	public Manager(String first_Name, String last_name, String title, int id, String emailAddress,
			String reimbursementType, String requestReimbursement, boolean approve) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.title = title;
		this.id = id;
		this.emailAddress = emailAddress;
		this.reimbursementType = reimbursementType;
		this.requestReimbursement = requestReimbursement;
		this.approve = approve;
	}
	public Manager(String first_Name, String last_name, String title, int id,String email) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.title = title;
		this.id = id;
		this.emailAddress = email;
		
	}
	public Manager(String requestReimbursement,String reimbursementTyp, boolean approve , int id) {
		super();
	this.requestReimbursement =requestReimbursement;
	this.reimbursementType=reimbursementType;
	this.approve = approve;
		this.id = id;
		
		
	}
	@Override
	public String toString() {
		return "Manager [first_Name=" + first_Name + ", last_name=" + last_name + ", title=" + title + ", id=" + id
				+ ", emailAddress=" + emailAddress + ", reimbursementType=" + reimbursementType
				+ ", requestReimbursement=" + requestReimbursement + ", approve=" + approve + "]";
	}
	
	
}
