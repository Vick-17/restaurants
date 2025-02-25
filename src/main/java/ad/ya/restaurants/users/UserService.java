package ad.ya.restaurants.users;

import java.util.Optional;

public interface UserService {
    UserDto saveOrUpdate(UserDto user);

    Optional<Object> findById(Long id);

    void deleteById(Long id);
}
