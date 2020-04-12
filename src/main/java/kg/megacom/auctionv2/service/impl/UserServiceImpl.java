package kg.megacom.auctionv2.service.impl;

import kg.megacom.auctionv2.dao.UserRepository;
import kg.megacom.auctionv2.entities.dto.UserDto;
import kg.megacom.auctionv2.entities.models.User;
import kg.megacom.auctionv2.mapper.ClassMapper;
import kg.megacom.auctionv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user= ClassMapper.INSTANCE.UserDtoToUser(userDto);
        user=userRepository.save(user);
        return ClassMapper.INSTANCE.UserToUserDto(user);
    }
}
