package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.StatusDto;
import kg.megacom.auctionv2.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/status")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @PostMapping(value = "/status/save")
    public ResponseEntity<?> saveStatus(StatusDto statusDto){
        return ResponseEntity.ok(statusService.saveStatus(statusDto));
    }
}
