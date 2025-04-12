package comjuanlobaton.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import comjuanlobaton.springboot.di.app.springboot_di.models.Product;

@Primary
@RequestScope
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {

    List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 1000L),
                new Product(2L, "Teclado Razer Mini", 500L),
                new Product(3L, "Mouse Logitech", 300L),
                new Product(4L, "Monitor Samsung", 2000L),
                new Product(5L, "Placa de video MSI", 5000L),
                new Product(6L, "Placa madre ASUS", 1500L),
                new Product(7L, "CPU Intel i7", 3000L));
    }

    @Override
    public List<Product> findAll() {
        return this.data;
    }

    /**
     * Este método busca un producto por su id en la lista de productos.
     * 
     * @param id El id del producto a buscar.
     * @return El producto encontrado o null si no se encuentra.
     */
    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);

    }
}
