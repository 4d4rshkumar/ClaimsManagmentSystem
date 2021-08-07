package com.cts.claimsmanagementsystem.claim.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.claimsmanagementsystem.claim.models.MemberPolicy;

@Repository
public interface MemberRepository extends JpaRepository<MemberPolicy, String> {

}
