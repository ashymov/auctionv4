package kg.megacom.auctionv2.controller;

import kg.megacom.auctionv2.entities.dto.UserDto;
import kg.megacom.auctionv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveUser(UserDto userDto){
        return ResponseEntity.ok(userService.saveUser(userDto));
    }
}
