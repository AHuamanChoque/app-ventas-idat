package pe.edu.idat.app_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.model.bd.Product;
import pe.edu.idat.app_ventas_idat.model.bd.Supplier;
import pe.edu.idat.app_ventas_idat.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements  IProductService{
    private ProductRepository productRepository;
    @Override
    public List<Product> listarProducto() {
        return productRepository.findAll();
    }

    @Override
    public Supplier guardarProducto(Product product) {
        return productRepository.save(product);
    }
}
