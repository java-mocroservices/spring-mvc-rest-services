package src.main.java.guru.springframework.msscbrewery.web.model;
import java.util.UUID;
import lombok.*;
@Data
//TODO create class BeerDto
public class BeerDto {
    private UUID id;
    private String bearName;
    private String beerStyle;
    private Long upc;
}
