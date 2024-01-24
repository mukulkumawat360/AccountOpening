package com.mkbk.AccountOpening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mkbk.AccountOpening.Repository.AccountRepository;
import com.mkbk.AccountOpening.model.PersonalLoanDetails;
import com.mkbk.AccountOpening.model.UserInfo;
import com.mkbk.AccountOpening.services.CheckCibilScore;

@RestController
@RequestMapping(value="services/personalLoan/")
public class PersonalLoan {

	
	@Autowired 
	CheckCibilScore cibi;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping(value="cibilFetch")
	public ResponseEntity<String> getCustomerSimah(@RequestBody PersonalLoanDetails pd) {
		String cibilStatus=cibi.cibilRequest(pd);
		return ResponseEntity.status(HttpStatus.OK).body(cibilStatus);
	}
	
	
	@RequestMapping(value="getLoanOffer",
			method=RequestMethod.GET)
	public void createCustm(@RequestBody UserInfo uerinfo ) {
		System.out.println("Returning Loan Offer");
	 }

}
