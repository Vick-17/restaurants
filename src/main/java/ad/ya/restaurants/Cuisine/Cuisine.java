package ad.ya.restaurants.Cuisine;

import java.util.List;

import org.springframework.stereotype.Component;

import ad.ya.restaurants.Ustensile.Ustensile;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
@Component
@Entity
/*
 * @Component indique à spring qu'il doit insérer dans son contexte une instance
 * de cette classe
 */
public class Cuisine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Ustensile> ustensiles;

}
