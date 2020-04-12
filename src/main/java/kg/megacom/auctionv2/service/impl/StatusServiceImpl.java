package kg.megacom.auctionv2.service.impl;

import kg.megacom.auctionv2.dao.StatusRepository;
import kg.megacom.auctionv2.entities.dto.StatusDto;
import kg.megacom.auctionv2.entities.models.Status;
import kg.megacom.auctionv2.mapper.ClassMapper;
import kg.megacom.auctionv2.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public StatusDto saveStatus(StatusDto statusDto) {
        Status status= ClassMapper.INSTANCE.StatusDtoToStatus(statusDto);
        status=statusRepository.save(status);
        return ClassMapper.INSTANCE.StatusToStatusDto(status);
    }
}
