package com.hak.mygarden.models;


import javax.persistence.*;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.join(",", id.toString(), common_name, scientific_name, quantity, birthday);
    }
}
