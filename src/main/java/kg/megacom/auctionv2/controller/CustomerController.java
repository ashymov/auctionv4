package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.CustomerDto;
import kg.megacom.auctionv2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok(customerService.saveCustomer(customerDto));
    }
}
