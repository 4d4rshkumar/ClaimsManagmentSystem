package com.cts.claimsmanagementsystem.claim.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberPolicy {
	
	@Id
	private String memberId;
	
	@Column(name="policyId")
	private String policyId;
	
	@Column(name="subscriptionDate")
	private String subscriptionDate;
	
	@Column(name="benefitId")
	private String benefitId;
	
	@Column(name="tenure")
	private int tenure;
	
	@Column(name="capitalAmount")
	private int capitalAmount;

}
