package kg.megacom.auctionv2.service.impl;

import kg.megacom.auctionv2.dao.CustomerRepository;
import kg.megacom.auctionv2.entities.dto.CustomerDto;
import kg.megacom.auctionv2.entities.models.Customer;
import kg.megacom.auctionv2.mapper.ClassMapper;
import kg.megacom.auctionv2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer customer= ClassMapper.INSTANCE.CustomerDtoToCustomer(customerDto);
        customer=customerRepository.save(customer);
        return ClassMapper.INSTANCE.CustomerToCustomerDto(customer);
    }
}
