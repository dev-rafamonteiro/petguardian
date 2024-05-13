package br.com.petguardian.controller;

import br.com.petguardian.dto.PetShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetShopController {

    private List<PetShop> petShops = new ArrayList<>();

    public PetShopController() {
        // Mock data - Petshops nearby
        petShops.add(new PetShop("Pet Patão", "Avenida nossa senhora, 123", "12345-678", "https://lh3.googleusercontent.com/p/AF1QipN_dtOpEbOHVq70KK35BdNmhSt-8e_S6CvGJx6Q=s1360-w1360-h1020"));
        petShops.add(new PetShop("PetShop Cobasi Sabara", "Avenida nossa senhora, 635", "12345-678", "https://cobasi.vteximg.com.br/arquivos/Fachada_Alphaville.png"));
        petShops.add(new PetShop("PetShop Ravenilda", "Rua Socrates, 789", "12345-678", "https://r1web.com.br/univetus/wp-content/uploads/2022/11/dicas-ambiente-Vetus.jpg"));
    }

    @GetMapping("/petguardin/petshops")
    public List<PetShop> getPetShopsNearby() {
        String cep = "12345-678";
        // Simulate fetching nearby pet shops based on the provided cep
        List<PetShop> nearbyPetShops = new ArrayList<>();
        for (PetShop petShop : petShops) {
            if (petShop.getCep().equals(cep)) {
                nearbyPetShops.add(petShop);
            }
        }
        return nearbyPetShops;
    }
}
