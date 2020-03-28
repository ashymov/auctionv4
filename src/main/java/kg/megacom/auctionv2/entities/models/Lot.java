package kg.megacom.auctionv2.entities.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lot_id")
    private Long id;
    private String name;
    private Date startDate;
    private Date ednDate;
    private double minPrice;
    private double maxPrice;
    private double step;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
