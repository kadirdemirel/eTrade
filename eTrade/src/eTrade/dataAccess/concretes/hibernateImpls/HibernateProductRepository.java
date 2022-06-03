package eTrade.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository {
	List<Product> list = new ArrayList<Product>();

	@Override
	public void add(Product product) {
		list.add(product);
		System.out.println("Product to added by Hibernate");
	}

	@Override
	public void delete(Product product) {
		list.remove(product);
		System.out.println("Product to deleted by Hibernate");
	}

	@Override
	public void update(Product product) {

		Product productUpdate = getById(product.getId());
		productUpdate.setName(product.getName());
		productUpdate.setUnitPrice(product.getUnitPrice());
		productUpdate.setDescription(product.getDescription());
		productUpdate.setCategoryId(product.getCategoryId());
		System.out.println("Product to updated by Hibernate");
	}

	@Override
	public List<Product> getAll() {

		return list;
	}

	@Override
	public Product getById(int id) {

		Product productToFind = null;
		for (Product product : list) {
			if (product.getId() == id) {
				productToFind = product;
			}
		}

		return productToFind;
	}

}
