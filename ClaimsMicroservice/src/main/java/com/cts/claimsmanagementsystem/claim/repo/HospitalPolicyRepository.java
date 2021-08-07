package com.cts.claimsmanagementsystem.claim.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.Hospitals;

@Repository
public interface HospitalPolicyRepository extends JpaRepository<Hospitals, String> {

	@Query(value = "select hospital_id from hospital_policy where policy_id=?1", nativeQuery = true)
	List<String> PId(String policyId);

}
