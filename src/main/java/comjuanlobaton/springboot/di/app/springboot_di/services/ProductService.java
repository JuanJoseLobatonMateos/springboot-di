package comjuanlobaton.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import comjuanlobaton.springboot.di.app.springboot_di.models.Product;
import comjuanlobaton.springboot.di.app.springboot_di.repositories.ProductRepository;

public class ProductService {

    private ProductRepository productRepository=new ProductRepository();
    
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 0.210;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
