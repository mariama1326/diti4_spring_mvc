package diti.repository.impl;



import diti.entity.Produit;
import diti.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Produit product) {
        entityManager.merge(product);
    }

    @Override
    public List<Produit> findAll() {
        return entityManager
                .createQuery("FROM Produit", Produit.class)
                .getResultList();
    }

    @Override
    public Produit findById(Long id) {
        return entityManager.find(Produit.class, id);
    }

    @Override
    public void delete(Long id) {
        Produit product = findById(id);

        if(product != null) {
            entityManager.remove(product);
        }
    }
}