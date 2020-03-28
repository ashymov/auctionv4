package kg.megacom.auctionv2.entities.dto;

import kg.megacom.auctionv2.entities.models.Customer;
import kg.megacom.auctionv2.entities.models.Lot;
import lombok.Data;

import java.util.Date;

@Data
public class BidDto {
    private Long id;
    private Date addDate;
    private boolean isActive;
    private Lot lot;
    private Customer customer;
}