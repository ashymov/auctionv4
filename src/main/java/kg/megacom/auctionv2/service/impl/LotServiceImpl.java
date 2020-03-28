package kg.megacom.auctionv2.service.impl;

import kg.megacom.auctionv2.dao.LotRepository;
import kg.megacom.auctionv2.dao.StatusRepository;
import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.entities.dto.StatusDto;
import kg.megacom.auctionv2.entities.models.Lot;
import kg.megacom.auctionv2.entities.models.Status;
import kg.megacom.auctionv2.mapper.ClassMapper;
import kg.megacom.auctionv2.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotServiceImpl implements LotService {
    @Autowired
    private LotRepository lotRepository;
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public LotDto saveLot(LotDto lotDto) {
        Lot lot= ClassMapper.INSTANCE.LotDtoToLot(lotDto);
        lot=lotRepository.save(lot);
        return ClassMapper.INSTANCE.LotToLotDto(lot);
    }

    @Override
    public StatusDto saveStatus(StatusDto statusDto) {
        Status status=ClassMapper.INSTANCE.StatusDtoToStatus(statusDto);
        status=statusRepository.save(status);
        return ClassMapper.INSTANCE.StatusToStatusDto(status);
    }

}