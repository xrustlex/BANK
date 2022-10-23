/**
 * 
 */
package com.cogent.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.shop.entity.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

}
