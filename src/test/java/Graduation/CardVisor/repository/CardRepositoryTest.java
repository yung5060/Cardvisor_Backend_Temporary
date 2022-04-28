package Graduation.CardVisor.repository;

import Graduation.CardVisor.domain.Card;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CardRepositoryTest {

    @Autowired
    private CardRepository cardRepository;

    @Test
    public void test(){
        Card card = new Card();
        cardRepository.save(card);
    }
}