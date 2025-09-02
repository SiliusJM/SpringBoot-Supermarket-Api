package com.proyecto.firstApi.persistence;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyecto.firstApi.domian.Product;
import com.proyecto.firstApi.domian.repository.ProductRepository;
import com.proyecto.firstApi.persistence.crud.ProductoCrudRepository;
import com.proyecto.firstApi.persistence.entity.Producto;
import com.proyecto.firstApi.persistence.mapper.ProductMapper;


@Repository
public class ProductoRepository implements ProductRepository{
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public void delete(int productoId) {
        productoCrudRepository.deleteById(productoId);

    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
                       
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
       return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
        
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }
}
