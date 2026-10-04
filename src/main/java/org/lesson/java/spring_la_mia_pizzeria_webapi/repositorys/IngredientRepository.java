package org.lesson.java.spring_la_mia_pizzeria_webapi.repositorys;

import org.lesson.java.spring_la_mia_pizzeria_webapi.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}