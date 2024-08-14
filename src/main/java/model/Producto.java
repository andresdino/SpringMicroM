package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {

    private int codProducto;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stock;

}
