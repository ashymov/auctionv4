package kg.megacom.auctionv2;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.auctionv2.controller.LotController;
import kg.megacom.auctionv2.entities.dto.LotDto;
import kg.megacom.auctionv2.service.LotService;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(LotController.class)
public class LotControllerTest {
    @MockBean
    private LotService lotService;
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper=new ObjectMapper();

    private LotDto lotDto=new LotDto(){
        {
      setId(1l);
      setName("Lot");
      setMaxPrice(1000);
      setMinPrice(100);
        }
    };
    @Before
    public void init(){
        Mockito.when(lotService.saveLot(any(LotDto.class) ))
                .thenReturn(lotDto);
        Mockito.when(lotService.findById(any() ))
                .thenReturn(lotDto);
    }
    @Test
    public void testSaveLot() throws Exception {
        mockMvc.perform(post("/lot/save")
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(lotDto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(lotDto.getId()))
        .andExpect(jsonPath("$.name").value(lotDto.getName()));

    }
    public void testFindById() throws Exception {
        mockMvc.perform(get("lot/get/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id.1").value(lotDto.getId()));
    }
}
