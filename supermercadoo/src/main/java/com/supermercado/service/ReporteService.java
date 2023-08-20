/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.IsariSupermercado.service;

/**
 *
 * @author Usuario
 */
import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {

    public ResponseEntity<Resource>
            generaReporte(
                    String reporte, //El nombre del archivo llamado .jasper
                    Map<String, Object> parametros, //Los parámetros del reporte.. si tiene parámetros
                    String tipo
            ) throws IOException;

}
