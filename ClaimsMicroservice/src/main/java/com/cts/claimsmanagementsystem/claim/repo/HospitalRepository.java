package com.cts.claimsmanagementsystem.claim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.Hospitals;


@Repository
public interface HospitalRepository extends JpaRepository<Hospitals, String> {

}
