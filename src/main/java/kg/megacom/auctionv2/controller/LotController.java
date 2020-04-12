package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lot")
public class LotController {
    @Autowired
    private LotService lotService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveLot(@RequestBody LotDto lotDto) {
        return ResponseEntity.ok(lotService.saveLot(lotDto));
    }
    @GetMapping(value = "/get{id}")
    public ResponseEntity<?> findById(Long id){
        return ResponseEntity.ok(lotService.findById(id));
    }

}