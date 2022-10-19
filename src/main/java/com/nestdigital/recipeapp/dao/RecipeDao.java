package com.nestdigital.recipeapp.dao;

import com.nestdigital.recipeapp.model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
