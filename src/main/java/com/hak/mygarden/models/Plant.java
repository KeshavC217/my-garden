package com.hak.mygarden.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plant {
    private String common_name;
    private String scientific_name;
    private String quantity;
    private String birthday;

    public Plant(String common_name, String scientific_name, String quantity, String birthday) {
        this.common_name = common_name;
        this.scientific_name = scientific_name;
        this.quantity = quantity;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.join(",", common_name, scientific_name, quantity, birthday);
    }

    public String[] getElements() {
        String[] arr = {common_name, scientific_name, quantity, birthday};
        return arr;
    }


}
