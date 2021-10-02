package Repo;

import DAO.dataBaseDAO;
import Service.reimburseService;

public class reimburseServiceImpl implements  reimburseService {

dataBaseDAO data;
public  reimburseServiceImpl(dataBaseDAO data) {
	this.data= data;
}
	public boolean approveReimbursement( int id,  boolean approve) {
		return data.updateAccountAgain(id,approve);
	}
}
