package com.innoscripta.pizza.entity;

import com.innoscripta.pizza.model.InnoscriptaEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class OnlineOrder extends InnoscriptaEntity {

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "onlineOrder")
    private List<PizzaInOrder> orderPizzas;
}
