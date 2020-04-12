package kg.megacom.auctionv2.service;

import kg.megacom.auctionv2.entities.dto.BidDto;

public interface BidService {
    BidDto saveBid(BidDto bidDto);
}
