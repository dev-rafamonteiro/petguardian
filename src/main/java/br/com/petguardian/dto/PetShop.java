package br.com.petguardian.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetShop {
    private String name;
    private String address;
    private String cep;

    private String image;

    public PetShop(String name, String address, String cep, String image) {
        this.name = name;
        this.address = address;
        this.cep = cep;
        this.image = image;
    }


}
