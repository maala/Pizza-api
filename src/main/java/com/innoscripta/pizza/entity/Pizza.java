package com.innoscripta.pizza.entity;

import com.innoscripta.pizza.model.InnoscriptaEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Pizza extends InnoscriptaEntity {
    public double price;
    public String description;
    public String image_url;
    public String name;

    @OneToMany(mappedBy = "pizza")
    public List<PizzaInOrder> pizzaInOrders;

    public Pizza() {
    }

    public Pizza(double price, String description, String image_url, String name) {
        this.price = price;
        this.description = description;
        this.image_url = image_url;
        this.name = name;
    }

    public Pizza(double price, String description) {
        this.price = price;
        this.description = description;
    }
}
