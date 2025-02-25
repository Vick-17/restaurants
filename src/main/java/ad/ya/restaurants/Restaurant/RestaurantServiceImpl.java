package ad.ya.restaurants.Restaurant;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Service
@ToString
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;
    private final RestaurantMapper mapper;

    @Override
    public RestaurantDto saveOrUpdate(RestaurantDto restaurantDto) {
        Restaurant r = convert(restaurantDto);
        Restaurant savedRestaurant = repository.saveAndFlush(r);
        return new RestaurantDto().setId(savedRestaurant.getId());
    }

    private Restaurant convert(RestaurantDto dto) {
        return new Restaurant().setId(dto.getId());
    }

    @Override
    public Optional<Object> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}
