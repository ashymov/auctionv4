package kg.megacom.auctionv2.service;

import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.entities.dto.StatusDto;

public interface LotService {
    LotDto saveLot(LotDto lotDto);
    LotDto findById(Long id);

}