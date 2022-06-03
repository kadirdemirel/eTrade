package eTrade;

import eTrade.business.abstracts.ProductService;
import eTrade.business.concretes.ProductManager;
import eTrade.dataAccess.concretes.hibernateImpls.HibernateProductRepository;
import eTrade.dataAccess.concretes.jdbcImpls.JdbcProductRepository;
import eTrade.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Bardak", 15, "Cam", 1);
		Product product2 = new Product(2, "Þiþe", 15, "Plastik", 2);
		Product product3 = new Product(3, "Tabak", 15, "Porselen", 3);
		Product product4 = new Product(4, "Çanak", 15, "Cam", 1);
		Product product5 = new Product(5, "Eda", 15, "Cam", 1);
		Product product6 = new Product(6, "Kadir", 15, "Cam", 1);
		Product product7 = new Product(7, "Burcu", 15, "Cam", 1);
		Product product8 = new Product(8, "Ýnci", 15, "Cam", 1);

		ProductService productService = new ProductManager(new HibernateProductRepository());

		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		productService.add(product5);
		productService.add(product6);
		productService.add(product7);
		productService.add(product8);

		for (Product item : productService.getAll()) {
			System.out.println(item.getName());

		}
		System.out.println("-----------");
		Product product9 = new Product(7, "BurcuBayik", 15, "Cam", 1);
		productService.update(product9);
		for (Product item : productService.getAll()) {
			System.out.println(item.getName());

		}

	}

}
