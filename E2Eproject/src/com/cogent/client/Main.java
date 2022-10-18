package com.cogent.client;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

import com.cogent.bean.ProductBean;
import com.cogent.repo.ProductRepo;
import com.cogent.repo.ProductRepoImpl;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ProductRepo productRepo = new ProductRepoImpl();
		
		long id = 0;
		String name = null;
		String categ = null;
		
		BigDecimal price = null;
		Date made = null;
		Date exp = null;
		// SEARCHING FOR PRODUCT
		//System.out.print("\nENTER CATEGORY FOR SEARCH\t");
		//categ = scan.next();
		//productRepo.findProductsByCat(categ);
		// DELETING PRODUCT
		System.out.print("\nENTER ID FOR DELETION\t");
		productRepo.deleteById(scan.nextLong());
		/*ADDING PRODUCT
		System.out.print("\nENTER PRODUCT NAME\t");
		name = scan.next();
		
		System.out.print("\nENTER PRODUCT CATEGORY\t");
		categ = scan.next();
		
		System.out.print("\nENTER PRODUCT PRICE\t");
		price = new BigDecimal(scan.next());
		
		System.out.print("\nENTER PRODUCTION DATE\t");
		made = Date.valueOf(scan.next());
		
		System.out.print("\nENTER EXPIRATION DATE\t");
		exp = Date.valueOf(scan.next());
		
		ProductBean product = new ProductBean(id, name, categ, price, made, exp);
		productRepo.addProduct(product);
		*/
		productRepo.findExpiredProducts().forEach(System.out::println);;
		scan.close();

	}

}
