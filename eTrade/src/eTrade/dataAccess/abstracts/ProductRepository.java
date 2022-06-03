package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.Product;

public interface ProductRepository {

	void add(Product product);

	void delete(Product product);

	void update(Product product);

	List<Product> getAll();

	Product getById(int id);
}
