package kg.megacom.auctionv2.dao;


import kg.megacom.auctionv2.entities.models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid,Long> {
}