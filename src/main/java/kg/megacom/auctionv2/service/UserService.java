package kg.megacom.auctionv2.service;

import kg.megacom.auctionv2.entities.dto.UserDto;

public interface UserService {
    UserDto saveUser(UserDto userDto);
}
