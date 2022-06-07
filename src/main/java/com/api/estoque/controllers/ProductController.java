package com.api.estoque.controllers;

import com.api.estoque.dtos.ProductDto;
import com.api.estoque.models.ProductModel;
import com.api.estoque.services.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/produto")
public class ProductController
{
    final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProduct(@RequestBody ProductDto productDto){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDto, productModel);
        productModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
    }

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProduto(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> alterProduto(@PathVariable("id") Long id, @RequestBody ProductDto productDto){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDto, productModel);
        productModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        productModel.setId(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productService.alter(productModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarProduto(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productService.deletar(id));
    }
}
