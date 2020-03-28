package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.entities.dto.StatusDto;
import kg.megacom.auctionv2.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class LotController {
    @Autowired
    private LotService lotService;

    @PostMapping(value = "/lot/save")
    public ResponseEntity<?> saveLot(@RequestBody LotDto lotDto) {
        return ResponseEntity.ok(lotService.saveLot(lotDto));
    }
    @PostMapping(value = "status/save")
    public ResponseEntity<?> saveStatus(StatusDto statusDto){
        return ResponseEntity.ok(lotService.saveStatus(statusDto));
    }
}