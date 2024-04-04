import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  L'annotazione ci permette di definire la classe di configurazione che sostituisce l'XML.
@Configuration
public class AppConfig {

    //  L'annotazione di metodo invece, ci permette di definire che il metodo ritorna un'istanza di un Bean.
    @Bean(name = "speakerService")  //  Diamo un nome che utilizzeremo per recuperare il Bean!!
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());   //  CONSTRUCTOR INJECTION!
        //speakerService.setRepository(getSpeakerRepository());   //  SETTER INJECTION!
        return speakerService;    //  Potremmo configurarlo come vogliamo qua.
    }

    /*
        Abbiamo creato il nostro primo Spring Bean. Sarà conservato nel registry di Spring Registry.
     */

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new StubSpeakerRepositoryImpl();
    }
}
