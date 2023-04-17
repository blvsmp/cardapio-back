package com.example.cardapio.models;

import com.example.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name= "food")
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer price;
    private String image;

    public Food(FoodRequestDTO food) {
        this.title = food.title();
        this.price = food.price();
        this.image = food.image();
    }
}
