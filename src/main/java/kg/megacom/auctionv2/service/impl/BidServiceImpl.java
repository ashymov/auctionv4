package kg.megacom.auctionv2.service.impl;

import kg.megacom.auctionv2.dao.BidRepository;
import kg.megacom.auctionv2.entities.dto.BidDto;
import kg.megacom.auctionv2.entities.models.Bid;
import kg.megacom.auctionv2.mapper.ClassMapper;
import kg.megacom.auctionv2.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {
    @Autowired
    private BidRepository bidRepository;

    @Override
    public BidDto saveBid(BidDto bidDto) {
        Bid bid= ClassMapper.INSTANCE.BidDtoToBid(bidDto);
        bid=bidRepository.save(bid);
        return ClassMapper.INSTANCE.BidToBidDto(bid);
    }
}
