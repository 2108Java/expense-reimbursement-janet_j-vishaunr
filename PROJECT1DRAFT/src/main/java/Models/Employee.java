package Models;

public class Employee {
	private String first_Name;
	private String last_name;
	private String title;
	private int id;
	private String reimbursementType;
	private boolean requestReimbursement;
	private boolean approve;
	private String emailAddress;
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
	public boolean isRequestReimbursement() {
		return requestReimbursement;
	}
	public void setRequestReimbursement(boolean requestReimbursement) {
		this.requestReimbursement = requestReimbursement;
	}
	public boolean getApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	public Employee(String first_Name, String last_name, String title, int id, String reimbursementType,
			boolean requestReimbursement, boolean approve) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.title = title;
		this.id = id;
		this.reimbursementType = reimbursementType;
		this.requestReimbursement = requestReimbursement;
		this.approve = approve;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
