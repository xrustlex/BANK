/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.ProductBean;

/**
 * @author dick
 *
 * 14 окт. 2022 г.
 */
public class ProductRepoImpl implements ProductRepo {
	
	public List<ProductBean> products = new ArrayList<>();

	@Override
	public void addProduct(ProductBean product) {
		products.add(product);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByCat(String cat) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductBean findProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean findCheapestInCat(String cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductBean> findProductsByCat(String cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(ProductBean product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ProductBean> findExpiredProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
