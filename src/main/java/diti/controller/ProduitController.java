package diti.controller;


import diti.entity.Produit;
import diti.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produit")
public class ProduitController {


    @Autowired
    private ProductService productService;


    @GetMapping
    public String getList(Model model){
        List<Produit>  produits =  productService.findAll();
        model.addAttribute("produits",produits);
        return "produit";
    }
}

