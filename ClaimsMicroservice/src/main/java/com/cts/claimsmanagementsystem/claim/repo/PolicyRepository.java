package com.cts.claimsmanagementsystem.claim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, String> {

	@Query(value = "select amount_insured from policy where policy_id=?1", nativeQuery = true)
	int findByPolicyId(String policyId);

}
