package comjuanlobaton.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import comjuanlobaton.springboot.di.app.springboot_di.models.Product;
import comjuanlobaton.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    private ProductRepositoryImpl productRepository=new ProductRepositoryImpl();
    
    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.21d;
            Product newProduct= (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
