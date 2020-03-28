package kg.megacom.auctionv2.dao;

import kg.megacom.auctionv2.entities.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {
}