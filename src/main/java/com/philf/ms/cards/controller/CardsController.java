package com.philf.ms.cards.controller;

import com.philf.ms.cards.Repository.CardsRepository;
import com.philf.ms.cards.model.Cards;
import com.philf.ms.cards.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());

        if(cards != null) {
            return cards;
        } else {
            return null;
        }

    }


}
