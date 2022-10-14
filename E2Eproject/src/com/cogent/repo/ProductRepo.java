/**
 * 
 */
package com.cogent.repo;

import java.util.*;

import com.cogent.bean.ProductBean;

/**
 * @author dick
 *
 * 14 окт. 2022 г.
 */
public interface ProductRepo {

	/* 
	 * operation--›addProduct, deleteProductById, deleteProductByCat,
	 * operation--›findCheapestProductInCat, findProductByCat, findProductById 
	 * operation--›updateProduct, findExpiredProducts
	 */
	void addProduct(ProductBean product);
	void deleteById(long id);
	void deleteByCat(String cat);	
	
	ProductBean findCheapestInCat();
	List<ProductBean> findProductByCat(String cat);
	List<ProductBean> findProductById(long id);
	
	void updateProduct(ProductBean product);
	List<ProductBean> findExpiredProducts();
}
