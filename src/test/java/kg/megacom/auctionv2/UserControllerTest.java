package kg.megacom.auctionv2;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.auctionv2.controller.UserController;
import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.entities.dto.UserDto;
import kg.megacom.auctionv2.entities.models.User;
import kg.megacom.auctionv2.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @MockBean
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();
    private UserDto userDto = new UserDto() {
        {
            setId(3l);
            setName("aibek");
            setLogin("qwerty");
            setPassword("12345");
        }
    };

    @Before
    public void init() {
        Mockito.when(userService.saveUser(any(UserDto.class)))
                .thenReturn(userDto);
    }

    @Test
    public void testSaveUser() throws Exception {
        mockMvc.perform(post("/user/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(userDto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(userDto.getId()))
                .andExpect(jsonPath("$.name").value(userDto.getName()))
                .andExpect(jsonPath("$.login").value(userDto.getLogin()))
                .andExpect(jsonPath("$.password").value(userDto.getPassword()));

    }
}
