package Models;

public class Reimburse {

	private int id;
	private String emailAddress;
	private String reimbursementType;
	private boolean requestReimbursement;
	private boolean approve;
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
	public boolean isRequestReimbursement() {
		return requestReimbursement;
	}
	public void setRequestReimbursement(boolean requestReimbursement) {
		this.requestReimbursement = requestReimbursement;
	}
	public boolean isApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
	}
	public Reimburse(int id, String emailAddress, String reimbursementType, boolean requestReimbursement,
			boolean approve) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.reimbursementType = reimbursementType;
		this.requestReimbursement = requestReimbursement;
		this.approve = approve;
	}
	@Override
	public String toString() {
		return "Reimburse [id=" + id + ", emailAddress=" + emailAddress + ", reimbursementType=" + reimbursementType
				+ ", requestReimbursement=" + requestReimbursement + ", approve=" + approve + "]";
	}
	
}
