package ad.ya.restaurants.users;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDto saveOrUpdate(UserDto userDto) {
        User u = convert(userDto);
        User savedUsed = repository.saveAndFlush(u);
        return new UserDto().setId(savedUsed.getId());
    }


    private User convert(UserDto dto) {
        return new User().setId(dto.getId());
    }

    private UserDto toDto(User user) {
        return mapper.toDto(user);
    }

    private User toEntity(UserDto dto) {
        return mapper.toEntity(dto);
    }

    private List<UserDto> toDto(List<User> users){
        return users.stream().map(mapper::toDto).toList();
    }


    @Override
    public Optional findById(Long id) {
        return repository.findById(id).map(this::toDto);
    }

    @Override
     public void deleteById(Long id) {
        repository.deleteById(id);
     }
}
