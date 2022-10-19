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
	
	{
		// LOADING FROM config.properties FILE
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
			e.printStackTrace();
		}
	}

	@Override
	public void addProduct(ProductBean product) {

		Properties prop = new Properties();
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
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

		Properties prop = new Properties();
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
			e.printStackTrace();
		}
		// DELETE FROM products WHERE id = ?
		try {

			Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			PreparedStatement ps = conn.prepareStatement("DELETE FROM products WHERE id = ?");

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

		Properties prop = new Properties();
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
		Properties prop = new Properties();
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
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
		
		List<ProductBean> products = new ArrayList<>();
		// LOADING FROM config.properties FILE
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
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

		List<ProductBean> products = new ArrayList<>();
		// LOADING FROM config.properties FILE
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
			e.printStackTrace();
		}

		// SELECT * FROM products WHERE categ = '?'
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE categ = ?")) {

			ps.setString(1, cat);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// ADDING TO LIST
				products.add(new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"),
						rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

	@Override
	public void updateProduct(ProductBean product) {
		Properties prop = new Properties();
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
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

		List<ProductBean> products = new ArrayList<>();
		Properties prop = new Properties();
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// ESTABLISHING CONNECTION TO DATABASE
		try (InputStream input = new FileInputStream("config.properties");) {

			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException | IOException e) {
			System.out.println("\nNO CONNECTION AVAILABLE\n");
			e.printStackTrace();
		}

		// SELECT * FROM products WHERE exp < Current_Date()
		try (Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE exp < Current_Date()")) {

			ResultSet rs = ps.executeQuery();
			// ADDING TO LIST
			while (rs.next())

				products.add(new ProductBean(rs.getLong("ID"), rs.getString("name"), rs.getString("categ"),
						rs.getBigDecimal("price"), rs.getDate("made"), rs.getDate("exp")));

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

}
