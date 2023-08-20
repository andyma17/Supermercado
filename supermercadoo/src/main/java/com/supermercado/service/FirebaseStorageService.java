
package com.IsariSupermercado.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author Usuario
 */
@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //BucketName es el <id del proyecto> +.appspot.com
    final String BucketName = "tienda-d5f41.appspot.com";//se ve en la pagina de Firebase

    final String rutaSuperiorStorage = "IsariSupermercado";//nombre del proyecto

    final String rutaJsonFile = "firebase";//folder donde esat el archivo json

    final String archivoJsonFile = "isarisupermercado-firebase-adminsdk-1pr0n-1cdcac99e5";//cambia de persona a persona

}
