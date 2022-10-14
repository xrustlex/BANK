/**
 * 
 */
package com.cogent.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cogent.bean.ProductBean;

/**
 * @author dick
 *
 *         14 окт. 2022 г.
 */
public class ProductRepoImpl implements ProductRepo {

	public List<ProductBean> products = new ArrayList<>();

	@Override
	public void addProduct(ProductBean product) {

		InputStream configFile = null;
		Properties prop = new Properties();

		try {
			
			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (
				Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("INSERT INTO PRODUCTS VALUES (?,?,?,?,?)");) {

			;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
