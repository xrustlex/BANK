/**
 * 
 */
package com.cogent.repo;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.cogent.bean.ProductBean;

/**
 * @author dick
 *
 *         14 окт. 2022 г.
 */
public class ProductRepoImpl implements ProductRepo {

	@Override
	public void addProduct(ProductBean product) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// INSERT INTO PRODUCTS (name,categ,price,made,exp) VALUES (?,?,?,?,?)
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn
						.prepareStatement("INSERT INTO PRODUCTS (name,categ,price,made,exp) VALUES (?,?,?,?,?)");) {

			ps.setString(1, product.getName());
			ps.setString(2, product.getCateg());
			ps.setBigDecimal(3, product.getPrice());

			ps.setDate(4, product.getMade());
			ps.setDate(5, product.getExp());
			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(long id) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DELETE FROM products WHERE id = ?
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("DELETE FROM products WHERE id = ?");) {

			ps.setLong(1, id);
			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteByCat(String cat) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DELETE FROM PRODUCTS WHERE categ = ?
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("DELETE FROM products WHERE categ = ?");) {

			ps.setString(1, cat);
			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ProductBean findProductById(long id) {

		ProductBean product = null;
		InputStream configFile = null;
		Properties prop = new Properties(null);
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// SELECT * FROM products WHERE id = ?
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE id = ?");) {

			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();

			product = new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"),
					rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp"));

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<ProductBean> findCheapestInCat(String cat) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		List<ProductBean> products = new ArrayList<>();
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// SELECT * FROM products WHERE price = (SELECT MIN(price) FROM products WHERE
		// categ = ?)
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement(
						"SELECT * FROM products WHERE price = (SELECT MIN(price) FROM products WHERE categ = ?");) {

			ps.setString(1, cat);
			ResultSet rs = ps.executeQuery();
			while (rs.next())

				products.add(new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"),
						rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp")));

			rs.close();
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<ProductBean> findProductsByCat(String cat) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		List<ProductBean> products = new ArrayList<>();
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// SELECT * FROM products WHERE categ = '?'
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE categ = '?'")) {

			ps.setString(1, cat);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// ADDING TO LIST
				products.add(new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"), rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

	@Override
	public void updateProduct(ProductBean product) {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// UPDATE products SET name = ?, categ = ?, price = ?, made = ?, exp = ? WHERE
		// ID = ?
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement(
						"UPDATE products SET name = ?, categ = ?, price = ?, made = ?, exp = ? WHERE ID = ?")) {

			ps.setString(1, product.getName());
			ps.setString(2, product.getCateg());
			ps.setBigDecimal(3, product.getPrice());

			ps.setDate(4, product.getMade());
			ps.setDate(5, product.getExp());
			ps.setLong(6, product.getId());

			ps.executeUpdate();
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<ProductBean> findExpiredProducts() {

		InputStream configFile = null;
		Properties prop = new Properties(null);
		List<ProductBean> products = new ArrayList<>();
		// LOADING FROM config.properties FILE
		try {

			configFile = new FileInputStream("config.properties");
			prop.load(configFile);
			Class.forName(prop.getProperty("driver"));

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// SELECT * FROM products WHERE exp < Current_Date()
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE exp < Current_Date()")) {

			ResultSet rs = ps.executeQuery();
			// ADDING TO LIST
			while (rs.next()) 
				
				products.add(new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"), rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp")));
			
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

}
