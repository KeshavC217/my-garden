package com.hak.mygarden.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String common_name;
    private String scientific_name;
    private String quantity;
    private String birthday;

    public Plant(){}

    public Plant(Long id, String common_name, String scientific_name, String quantity, String birthday) {
        this.id = id;
        this.common_name = common_name;
        this.scientific_name = scientific_name;
        this.quantity = quantity;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.join(",", id.toString(), common_name, scientific_name, quantity, birthday);
    }
}
