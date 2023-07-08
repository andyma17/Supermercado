package com.supermercado.service.impl;

import com.supermercado.dao.ProductoDao;
import com.supermercado.domain.Producto;
import com.supermercado.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoDao productoDao;

    @Autowired
    public ProductoServiceImpl(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> getProductos(boolean activos) {
        return productoDao.findAll();
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
}

