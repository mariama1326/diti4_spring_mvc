package diti.REST;

import diti.entity.TypeProduit;
import diti.service.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeproduit")
public class TypeProduitRestController {

    @Autowired
    private TypeProduitService typeProduitService;

    @GetMapping
    public List<TypeProduit> getList() {
        return typeProduitService.findAll();
    }

    @PostMapping
    public String save(@RequestBody TypeProduit typeProduit) {
        typeProduitService.save(typeProduit);
        return "type de produit ajoute avec succes";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        typeProduitService.delete(id);
        return "type de produit supprime avec succes";
    }
}