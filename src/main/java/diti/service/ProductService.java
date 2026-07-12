package diti.service;



import diti.entity.Produit;

import java.util.List;

public interface ProductService {

    void save(Produit product);

    List<Produit> findAll();

    Produit findById(Long id);

    void delete(Long id);
}