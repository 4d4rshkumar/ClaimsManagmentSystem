package com.cts.claimsmanagementsystem.claim.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.cts.claimsmanagementsystem.claim.models.Benefits;
import com.cts.claimsmanagementsystem.claim.models.Hospitals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Policy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
	
	@Id
	private String policyId;
	
	@ManyToMany
	@JoinTable(
	  name = "PolicyBenefit", 
	  joinColumns = @JoinColumn(name = "policy_id"), 
	  inverseJoinColumns = @JoinColumn(name = "benefit_id"))
	private Set<Benefits> benefits;
	
	@Column(name="premium")
	private double premium;
	
	@Column(name="tenure")
	private int tenure;
	
	@ManyToMany(fetch= FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "policies")
	private Set<Hospitals> hospitals;
	
	@Column(name="amountInsured")
	private int amountInsured;
	
	
	

}
