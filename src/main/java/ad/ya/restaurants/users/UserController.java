package ad.ya.restaurants.users;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ToString
@AllArgsConstructor
@RequestMapping("users")
public class UserController {
    private UserService service;

    @PostMapping
    public ResponseEntity<UserDto> saveOrUpdate(@RequestBody UserDto userDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.saveOrUpdate(userDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Object>> findById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.findById(id));
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }


}
