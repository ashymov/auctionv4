package kg.megacom.auctionv2.entities.dto;

import kg.megacom.auctionv2.entities.models.Status;
import lombok.Data;

import java.util.Date;

@Data
public class LotDto {
    private Long id;
    private String name;
    private Date startDate;
    private Date ednDate;
    private double minPrice;
    private double maxPrice;
    private double step;
    private Status status;
}