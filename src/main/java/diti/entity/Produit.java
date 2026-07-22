package diti.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    private double prix;

    @ManyToOne
    @JoinColumn(name = "type_produit_id")
    private TypeProduit typeProduit;

    public Produit() {
    }

    public Produit(Long id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    // ... tous tes getters/setters existants (id, libelle, prix) ...

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }
}