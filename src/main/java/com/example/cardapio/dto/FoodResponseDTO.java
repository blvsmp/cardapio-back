package com.example.cardapio.dto;

import com.example.cardapio.models.Food;

public record FoodResponseDTO(Long id, String title, Integer price, String image) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getPrice(), food.getImage());
    }
}
