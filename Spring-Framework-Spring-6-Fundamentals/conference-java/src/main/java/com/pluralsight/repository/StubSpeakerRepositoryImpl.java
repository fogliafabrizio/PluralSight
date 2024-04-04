package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    /*
        Non useremo Hibernate. Quindi faremo Codice implementato.
     */

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Fabrizio");
        speaker.setLastName("Foglia");

        speakers.add(speaker);

        return speakers;
    }

}
