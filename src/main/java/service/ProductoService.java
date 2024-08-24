package service;

import model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> catalogo();

    List<Producto> productoCategoria(String categoria);

    Producto productoCodigo(int cod);

    void crearProducto(Producto producto);

    Producto eliminarProducto(int cod);

    Producto actualzarPrecio(int cod, double precio);

}
