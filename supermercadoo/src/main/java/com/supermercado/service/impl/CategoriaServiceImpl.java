package com.IsariSupermercado.service.impl;

import com.IsariSupermercado.dao.CategoriaDao;
import com.IsariSupermercado.domain.Categoria;
import com.IsariSupermercado.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if(activos){
            lista.removeIf(categoriaEletemento -> !categoriaEletemento.isActivo() );
        }
        return lista;        
    }
    
    @Override
    @Transactional(readOnly=true)//leer
    public Categoria getCategoria(Categoria categoria){
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Categoria categoria){//agrega algo
        categoriaDao.save(categoria);
    }
    
    @Override
    @Transactional
    public void delete(Categoria categoria){//alimina
        categoriaDao.delete(categoria);
    }
    
    
}
