package kg.megacom.auctionv2.mapper;

import kg.megacom.auctionv2.entities.dto.*;
import kg.megacom.auctionv2.entities.models.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Lot LotDtoToLot(LotDto lotDto);
    @InheritInverseConfiguration
    LotDto LotToLotDto(Lot lot);

    User UserDtoToUser(UserDto userDto);
    @InheritInverseConfiguration
    UserDto UserToUserDto(User user);

    Bid BidDtoToBid(BidDto bidDto);
    @InheritInverseConfiguration
    BidDto BidToBidDto(Bid bid);

    Status StatusDtoToStatus(StatusDto statusDto);
    @InheritInverseConfiguration
    StatusDto StatusToStatusDto(Status status);

    Customer CustomerDtoToCustomer(CustomerDto customerDto);
    @InheritInverseConfiguration
    CustomerDto CustomerToCustomerDto(Customer customer);
}