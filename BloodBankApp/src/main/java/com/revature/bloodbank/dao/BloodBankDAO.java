package com.revature.bloodbank.dao;

import com.revature.bloodbank.model.BloodBankCenter;

public interface BloodBankDAO {
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void updBloodBankCenter(BloodBankCenter bloodBankCenter);
	public void dispBloodBankCenter(BloodBankCenter bloodBankCenter);
	//dataaccessobject
}