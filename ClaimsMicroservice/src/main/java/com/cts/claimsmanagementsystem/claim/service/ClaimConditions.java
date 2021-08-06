package com.cts.claimsmanagementsystem.claim.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClaimConditions {

	public static boolean contradictions() {
		// code goes here

		return false;
	}
	/*
	 * will write the actual code to check for the conditions reuired and fetch it
	 * to give a appropriate results for now the results are hard coded
	 */

	// -1 for empty, 0 for flase, 1 for true
	public static String status() {
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
