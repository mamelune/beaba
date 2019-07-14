package io.chacha.beaba.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import io.chacha.beaba.repositories.PizzaRepository;
import io.chacha.beaba.tables.Pizza;
import io.chacha.beaba.tables.User;

@Controller
public class GerantController {
	
	@Autowired
	PizzaRepository pizzaRepository;
	 
     
	
	  @GetMapping("/signup-pizza") public String showSignUpFormPizza (Pizza pizza) { return
	  "gerant/pizzaform"; }
	 
    //remplissage de la table pizza avec les nouvelles recettes des pizzas du chef !!!
    
	
	  @PostMapping("/addpizza") public String addpizza(@Valid Pizza pizza,
	  BindingResult result, Model model) { if (result.hasErrors()) { return
	  "gerant/pizzaform"; }
	  
	  pizzaRepository.save(pizza); model.addAttribute("pizzas",
	  pizzaRepository.findAll()); return "index";
	 
        
    }
	
    @GetMapping("/editpizza/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Pizza pizza = pizzaRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("Invalid pizza Id:" + id));
         
        model.addAttribute("pizza", pizza);
        return "update-pizza";
        
    }
        
    @GetMapping("/deletepizza/{id}")
        public String deletePizza(@PathVariable("id") long id, Model model) {
            Pizza pizza = pizzaRepository.findById(id)
              .orElseThrow(() -> new IllegalArgumentException("Invalid pizza Id:" + id));
            pizzaRepository.delete(pizza);
            model.addAttribute("pizza", pizzaRepository.findAll());
            return "pizzaindex";
        }   
        

}
