package me.dio.spring_api.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import me.dio.spring_api.dto.PostProductDTO;
import me.dio.spring_api.models.Product;
import me.dio.spring_api.repositories.ProductsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {

    @NonNull
    private final ProductsRepository repository;

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto com ID " + id + " não encontrado"));
    }

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody PostProductDTO product) {
        Product newProduct = new Product();
        newProduct.setName(product.name());
        newProduct.setDescription(product.description());
        newProduct.setPrice(product.price());
        repository.save(newProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @PutMapping("/{id}")
    public ResponseEntity putProduct(@PathVariable Integer id, @RequestBody PostProductDTO productDTO) {
        Product existingProduct = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado"));
        existingProduct.setName(productDTO.name());
        existingProduct.setDescription(productDTO.description());
        existingProduct.setPrice(productDTO.price());
        repository.save(existingProduct);
        return ResponseEntity.ok(existingProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Integer id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontado"));
        repository.delete(product);
        return ResponseEntity.ok("Produto deletado com sucesso!");
    }
}
