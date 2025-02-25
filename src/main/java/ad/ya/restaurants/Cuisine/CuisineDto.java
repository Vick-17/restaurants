package ad.ya.restaurants.Cuisine;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

import ad.ya.restaurants.Ustensile.UstensileDto;

@Data
@Accessors(chain = true)
public class CuisineDto {
    private Long id;
    private String type;
    private List<UstensileDto> ustensiles;
}
