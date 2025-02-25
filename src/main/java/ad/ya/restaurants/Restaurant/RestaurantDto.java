package ad.ya.restaurants.Restaurant;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RestaurantDto {
    private Long id;

    private String name;
}
