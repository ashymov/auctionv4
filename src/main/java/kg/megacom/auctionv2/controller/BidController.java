package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.BidDto;
import kg.megacom.auctionv2.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bid")
public class BidController {
    @Autowired
    private BidService bidService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveBid(@RequestBody BidDto bidDto){
        return ResponseEntity.ok(bidService.saveBid(bidDto));
    }
}
