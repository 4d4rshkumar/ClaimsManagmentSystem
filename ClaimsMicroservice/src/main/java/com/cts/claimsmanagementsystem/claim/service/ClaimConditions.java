package com.cts.claimsmanagementsystem.claim.service;

public interface ClaimConditions {
	public String status();
	public boolean contradictions(int amount,int benifits,int provider);
}
