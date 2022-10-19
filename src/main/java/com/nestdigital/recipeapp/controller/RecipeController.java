package com.nestdigital.recipeapp.controller;

import com.nestdigital.recipeapp.dao.RecipeDao;
import com.nestdigital.recipeapp.model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addrecipe",consumes = "application/json",produces = "application/json")
    private String addRecipe(@RequestBody RecipeModel recipe){
        System.out.println(recipe.toString());
        dao.save(recipe);
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewrecipe")
    public List<RecipeModel> viewRecipe(){
        return (List<RecipeModel>) dao.findAll();
    }
}
