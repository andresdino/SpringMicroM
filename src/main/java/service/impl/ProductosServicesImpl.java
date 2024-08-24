package service.impl;

import model.Producto;
import service.ProductoService;

import java.util.ArrayList;
import java.util.List;

public class ProductosServicesImpl implements ProductoService {

    //Creamos una lista inmutable osea no puede moficiar
    private static List<Producto> productos=new ArrayList<>(List.of(new Producto(100,"Azucar","Alimentación",1.10,20),
            new Producto(101,"Leche","Alimentación",1.20,15),
            new Producto(102,"Jabón","Limpieza",0.89,30),
            new Producto(103,"Mesa","Hogar",125,4),
            new Producto(104,"Televisión","Hogar",650,10),
            new Producto(105,"Huevos","Alimentación",2.20,30),
            new Producto(106,"Fregona","Limpieza",3.40,6),
            new Producto(107,"Detergente","Limpieza",8.7,12)));


    @Override
    public List<Producto> productoCategoria(String categoria) {
        return productos.stream()
                .filter(p->p.getCategoria().equals(categoria))
                .toList();
    }

    @Override
    public Producto productoCodigo(int cod) {
        return productos.stream()
                .filter(p->p.getCodProducto()==cod)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void crearProducto(Producto producto) {
        if(productoCodigo(producto.getCodProducto())==null){
            productos.add(producto);
        }
    }

    @Override
    public Producto eliminarProducto(int cod) {
        if(productoCodigo(cod)!=null){
            productos.remove(productoCodigo(cod));
        }
        return productoCodigo(cod);
    }

    @Override
    public Producto actualzarPrecio(int cod, double precio) {
        return null;
    }
}
