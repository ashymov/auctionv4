package kg.megacom.auctionv2.entities.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bid_id")
    private Long id;
    private Date addDate;
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}