import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        //  SpeakerService service = new SpeakerServiceImpl();
        /*
            abbiamo creato un nuovo SpeakerServiceImpl... proviamo a iniettarlo con Spring.
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);    //  Gli passiamo la classe di configurazione che abbiamo creato precedentemente.

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
