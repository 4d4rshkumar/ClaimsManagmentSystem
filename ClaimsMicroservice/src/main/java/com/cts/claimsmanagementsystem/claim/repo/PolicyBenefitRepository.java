package com.cts.claimsmanagementsystem.claim.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.Policy;

@Repository
public interface PolicyBenefitRepository extends JpaRepository<Policy, String> {

	@Query(value = "select benefit_id from policy_benefit where policy_id=?1 ", nativeQuery = true)
	List<String> PId(String policyId);

}
