package com.cg.mypaymentapp.repo;

import com.cg.mypaymentapp.beans.Customer;

public interface WalletRepo {
		
		public Customer showBalance (String mobileno);
		
		public void updateBalance(String mobNo, Double amount);
		
		public Customer createAccount(Customer customer);
		
		public Customer findOne(String mobNo);

}
