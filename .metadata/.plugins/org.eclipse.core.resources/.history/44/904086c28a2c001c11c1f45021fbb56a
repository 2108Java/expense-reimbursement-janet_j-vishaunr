package Service;

import Repository.dataBaseDAO;
import Repository.reimburseService;

public class reimburseServiceImpl implements  reimburseService {

dataBaseDAO data;
public  reimburseServiceImpl(dataBaseDAO data) {
	this.data= data;
}
	public boolean managerApproveReimbursement( int id,  boolean approve) {
		return data.managerApproveReimbursement(id,approve);
	}
	

}
