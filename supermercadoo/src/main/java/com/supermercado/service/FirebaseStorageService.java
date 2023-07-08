/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.supermercado.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Andy Madrigal
 */
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //BucketName es el <id del proyecto> +.appspot.com
    final String BucketName = "supermercado-f8107.appspot.com";//se ve en la pagina de Firebase

    final String rutaSuperiorStorage = "supermercado";//nombre del proyecto

    final String rutaJsonFile = "firebase";//folder donde esat el archivo json

    final String archivoJsonFile = "supermercado-f8107-firebase-adminsdk-a06oj-565795da6a";//cambia de persona a persona

}
