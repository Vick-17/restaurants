package ad.ya.restaurants;


import ad.ya.restaurants.users.UserController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;


@SpringBootApplication
// Active la lecture du fichier properties pour la création d'objet basés sur ce dernier
@ConfigurationPropertiesScan("ad.ya.restaurants.conf")
//@Profile("dev") : Utilisable mais pau maintenable
@RequiredArgsConstructor
public class RestaurantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantsApplication.class, args);
    }

    private final UserController controller;

    @EventListener
    public void postStart(ApplicationStartedEvent event) {
        System.out.println("User controller :");
        System.out.println("controller = \u001B[31m" + controller + "\u001B[0m");
    }
}
