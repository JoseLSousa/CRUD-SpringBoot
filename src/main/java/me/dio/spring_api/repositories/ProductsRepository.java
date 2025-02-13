package me.dio.spring_api.repositories;

import me.dio.spring_api.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
