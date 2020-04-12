package kg.megacom.auctionv2.service;

import kg.megacom.auctionv2.entities.dto.StatusDto;
import kg.megacom.auctionv2.entities.models.Status;

public interface StatusService {
    StatusDto saveStatus(StatusDto statusDto);
}
