package kg.megacom.auctionv2.entities.dto;


import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String login;
    private String password;
}