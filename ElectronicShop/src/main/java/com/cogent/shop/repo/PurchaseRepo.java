/**
 * 
 */
package com.cogent.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.shop.entity.Purchase;

/**
 * @author dick
 *
 * 21 окт. 2022 г.
 */
public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

}
