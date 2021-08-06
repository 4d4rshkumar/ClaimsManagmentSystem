package com.cts.claimsmanagementsystem.claim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claimModule")
public class Controller {
	@GetMapping("/getClaimStatus")
	public String getClaimStatus() {
		return "Claim Status";
	}
	@PostMapping("/submitClaim")
	public String submitClaim() {
		return "Claim Submitted";
	}

}
