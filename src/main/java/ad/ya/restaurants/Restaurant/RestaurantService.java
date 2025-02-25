package ad.ya.restaurants.Restaurant;

import java.util.Optional;

public interface RestaurantService {
    RestaurantDto saveOrUpdate(RestaurantDto restaurant);

    Optional<Object> findById(Long id);

    void deleteById(Long id);
    
}
