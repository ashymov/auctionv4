package kg.megacom.auctionv2;

import kg.megacom.auctionv2.dao.LotRepository;

import kg.megacom.auctionv2.entities.models.Lot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LotRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private LotRepository lotRepository;


    @Test
    public void testLotDao() {
        Lot lot = new Lot();
        lot.setName("bek");

        lot = testEntityManager.persist(lot);
        Lot found = lotRepository.findById(1l).orElse(null);
        assertEquals(lot.getName(), found.getName());
    }
}
