package com.api.estoque.services;

import com.api.estoque.dtos.ProductDto;
import com.api.estoque.models.ProductModel;
import com.api.estoque.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    final
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional
    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    public ProductModel alter(ProductModel productModel){
        return productRepository.save(productModel);
    }

    public String deletar(Long id){
        productRepository.deleteById(id);
        return "Produto deletado";
    }
}

