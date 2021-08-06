package com.cts.claimsmanagementsystem.claim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.claimsmanagementsystem.claim.entity.Benefit;
import com.cts.claimsmanagementsystem.claim.entity.ClaimDetails;
import com.cts.claimsmanagementsystem.claim.entity.Hospital;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClaimConditionsImpl implements ClaimConditions {

	public static boolean contradictions() {
		// code goes here

		return false;
	}
	/*
	 * will write the actual code to check for the conditions reuired and fetch it
	 * to give a appropriate results for now the results are hard coded
	 */

	// -1 for empty, 0 for flase, 1 for true
	List<Benefit> benifits = List.of(new Benefit("123", "attack"), new Benefit("221", "stroke"));
	List<ClaimDetails> claim = List.of(new ClaimDetails("C123","","the Claim","remarks",1234,"H123","123","P123","M123"));
	List<Hospital> hospital=List.of(new Hospital("H123","Hostpital1","loc1"));

	@Override
	public String status() {
		log.debug("Inside compute status");
		int amount = -1;
		int applicableAmt = 100; // To be fetched from the database
		int benifits = -1;
		int permissableProvider = -1;
		String res;
		if (amount <= applicableAmt && benifits == 1 && permissableProvider == 1) {
			res = "Pending Action";
		} else if (amount == -1 || benifits == -1 || permissableProvider == -1) {
			res = "Insufficient Claim Details";
			if (contradictions()) {
				res = "Under Dispute";
			}
		} else {
			res = "Claim Rejected";
		}
		return res;
	}
}
