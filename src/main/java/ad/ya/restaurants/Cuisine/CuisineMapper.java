package ad.ya.restaurants.Cuisine;

import org.mapstruct.Mapper;

@Mapper
public interface CuisineMapper {

    Cuisine toDTO(Cuisine cuisine);

    Cuisine toEntity(Cuisine cuisineDTO);
    
}
