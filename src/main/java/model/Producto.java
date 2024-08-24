package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Producto {

    private int codProducto;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stock;

    public int getCodProducto() {
        return codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }
}
