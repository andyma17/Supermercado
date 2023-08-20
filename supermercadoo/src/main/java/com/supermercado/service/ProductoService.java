/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.IsariSupermercado.service;

import com.IsariSupermercado.domain.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ProductoService {

    // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);

    //se obtiene una categoria a partir del id de una categoria
    public Producto getProducto(Producto producto);

    public void save(Producto producto);

    //se elimina el categoria que tiene el id pasado por parametro
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
