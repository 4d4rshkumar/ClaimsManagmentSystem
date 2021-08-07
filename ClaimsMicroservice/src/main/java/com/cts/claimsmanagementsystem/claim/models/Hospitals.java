package com.cts.claimsmanagementsystem.claim.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Hospitals")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hospitals {
	
	@Id
	private String hospitalId;
	
	@Column(name="hospitalName")
	private String hospitalName;
	
	@Column(name="hospitalLocation")
	private String hospitalLocation;
	
	@ManyToMany
	@JoinTable(
	  name = "HospitalPolicy", 
	  joinColumns = @JoinColumn(name = "hospital_id"), 
	  inverseJoinColumns = @JoinColumn(name = "policy_id"))
	private Set<Policy> policies;
	

}
