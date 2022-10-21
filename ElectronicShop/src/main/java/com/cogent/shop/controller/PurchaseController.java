package com.cogent.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.shop.entity.Purchase;
import com.cogent.shop.repo.PurchaseRepo;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@PostMapping("/addpurchase")
	Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseRepo.save(purchase);
	}
	
}
