package com.cts.claimsmanagementsystem.claim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.Benefits;

@Repository
public interface BenefitRepository extends JpaRepository<Benefits, String> {

	@Query(value = "select benefit_price from benefits where benefit_id=?1", nativeQuery = true)
	int findByBenefitId(String benefitId);

}
