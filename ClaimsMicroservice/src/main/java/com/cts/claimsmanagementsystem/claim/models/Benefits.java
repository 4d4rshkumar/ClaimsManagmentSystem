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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Benefits")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Benefits {
	
	@Id
	private String benefitId;
	
    @Column(name="benefitName")
	private String benefitName;
    
    @Column(name="benefitPrice")
	private int benefitPrice;
    
	@ManyToMany(fetch= FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "benefits")
	private Set<Policy> policy;

}
