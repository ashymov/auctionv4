package kg.megacom.auctionv2.dao;

import kg.megacom.auctionv2.entities.models.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRepository extends JpaRepository<Lot,Long> {
}