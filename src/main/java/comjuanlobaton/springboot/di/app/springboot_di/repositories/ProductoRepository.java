package comjuanlobaton.springboot.di.app.springboot_di.repositories;

import java.util.List;

import comjuanlobaton.springboot.di.app.springboot_di.models.Product;

public interface ProductoRepository {
    List<Product> findAll();

    Product findById(Long id);

}
