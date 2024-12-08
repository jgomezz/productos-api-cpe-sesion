package pe.edu.tecsup.productosapi.webs;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.tecsup.productosapi.entities.Producto;
import pe.edu.tecsup.productosapi.services.ProductoService;

@Slf4j
@RestController
public class ProductoController {

    @Value("${app.storage.path}")
    private String STORAGEPATH;

    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    /**
     *  READ --> GET
     * @return
     */
    @GetMapping("/productos")
    public List<Producto> productos() {

        List<Producto> productos = productoService.findAll();

        return productos;
    }



}


