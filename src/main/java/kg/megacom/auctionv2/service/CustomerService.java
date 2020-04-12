package kg.megacom.auctionv2.service;

import kg.megacom.auctionv2.entities.dto.CustomerDto;

public interface CustomerService {
    CustomerDto saveCustomer(CustomerDto customerDto);
}
