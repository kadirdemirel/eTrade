package eTrade.business.concretes;

import java.util.List;

import eTrade.business.abstracts.ProductService;
import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {

		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {
		if (!checkIfProductNameExits(product.getName()) && !checkProductUnitPrice(product)
				&& checkIfSameCategory(product.getCategoryId()) < 5) {
			productRepository.add(product);

		} else {
			System.out.println("Hata ! Girdiðiniz bilgileri tekrar kontrol ediniz. : ");
		}

	}

	@Override
	public void delete(Product product) {

		productRepository.delete(product);
	}

	@Override
	public void update(Product product) {
		
		productRepository.update(product);
	}

	@Override
	public List<Product> getAll() {

		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {

		return productRepository.getById(id);
	}

	private boolean checkIfProductNameExits(String productName) {
		boolean exits = false;
		for (Product product : productRepository.getAll()) {
			if (product.getName() == productName) {
				exits = true;
			}

		}
		return exits;
	}

	private boolean checkProductUnitPrice(Product product) {
		boolean isSmall = false;
		if (product.getUnitPrice() <= 0) {
			isSmall = true;
		}
		return isSmall;
	}

	private Integer checkIfSameCategory(int categoryId) {

		int count = 0;
		for (Product item : productRepository.getAll()) {
			if (item.getCategoryId() == categoryId) {
				count++;

			}
		}

		return count;
	}
}
