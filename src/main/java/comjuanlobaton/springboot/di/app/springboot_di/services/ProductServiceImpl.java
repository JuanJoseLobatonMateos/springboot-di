package comjuanlobaton.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import comjuanlobaton.springboot.di.app.springboot_di.models.Product;
import comjuanlobaton.springboot.di.app.springboot_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    @Qualifier("productList")
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.21d;
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            // p.setPrice(priceTax.longValue());
            // return p;
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
