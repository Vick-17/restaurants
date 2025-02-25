package ad.ya.restaurants.Restaurant;

import org.mapstruct.Mapper;

@Mapper
public interface RestaurantMapper {
    RestaurantDto toDto(Restaurant restaurant);
    Restaurant toEntity(RestaurantDto dto);
}
