package com.cts.claimsmanagementsystem.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClaimDetails {

	private String claimId;

	private String status;

	private String description;

	private String remarks;

	private double claimAmount;

	private String hospitalId;

	private String benefitId;

	private String policyId;

	private String memberId;

}
