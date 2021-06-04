package src.main.java.guru.springframework.msscbrewery.web.model;
import java.util.UUID;

@Data
@NoArcsConstructor
public class BeerDto {
    private UUID id;
    private String bearName;
    private String beerStyle;
    private Long upc;


}
