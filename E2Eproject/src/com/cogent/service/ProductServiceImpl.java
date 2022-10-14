/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.ProductBean;
import com.cogent.repo.ProductRepo;
import com.cogent.repo.ProductRepoImpl;

/**
 * @author dick
 *
 * 14 окт. 2022 г.
 */
public class ProductServiceImpl implements ProductService {

	ProductRepo productrepo  = new ProductRepoImpl();
	@Override
	public void addProduct(ProductBean product) {
		// TODO Auto-generated method stub
		productrepo.addProduct(product);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		productrepo.deleteById(id);
	}

	@Override
	public void deleteByCat(String cat) {
		// TODO Auto-generated method stub
		productrepo.deleteByCat(cat);
	}

	@Override
	public ProductBean findProductById(long id) {
		// TODO Auto-generated method stub
		return productrepo.findProductById(id);
	}

	@Override
	public ProductBean findCheapestInCat(String cat) {
		// TODO Auto-generated method stub
		return productrepo.findCheapestInCat(cat);
	}

	@Override
	public List<ProductBean> findProductsByCat(String cat) {
		// TODO Auto-generated method stub
		return productrepo.findProductsByCat(cat);
	}

	@Override
	public void updateProduct(ProductBean product) {
		// TODO Auto-generated method stub
		productrepo.updateProduct(product);
	}

	@Override
	public List<ProductBean> findExpiredProducts() {
		// TODO Auto-generated method stub
		return productrepo.findExpiredProducts();
	}

}
