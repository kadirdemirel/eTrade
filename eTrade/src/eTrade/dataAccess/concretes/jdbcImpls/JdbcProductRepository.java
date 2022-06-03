package eTrade.dataAccess.concretes.jdbcImpls;

import java.util.List;

import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class JdbcProductRepository implements ProductRepository{

	@Override
	public void add(Product product) {
		System.out.println("Product to added by Jdbc");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Product to deleted by Jdbc");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Product to updated by Jdbc");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
