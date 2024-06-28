package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Product;
import pe.edu.idat.app_ventas_idat.model.bd.Supplier;

import java.util.List;

public interface IProductService {
    List<Product> listarProducto();

    Product guardarProducto(Product product);
    Product obtenerProducto(Integer idproducto);
}

