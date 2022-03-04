package cg.service;

import cg.model.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
