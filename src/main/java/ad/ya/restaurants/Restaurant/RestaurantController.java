package ad.ya.restaurants.Restaurant;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.ToString;

@RestController
@ToString
@AllArgsConstructor
@RequestMapping("restau")
public class RestaurantController {

    private final RestaurantService service;

    @PostMapping
    public RestaurantDto createRestau(@RequestBody RestaurantDto restaurantDto) {
        return service.saveOrUpdate(restaurantDto);
    }
    
}
