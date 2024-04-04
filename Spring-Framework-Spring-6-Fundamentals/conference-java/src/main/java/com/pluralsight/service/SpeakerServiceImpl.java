package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //  Dove metteremo la Business Logic

    // private SpeakerRepository repository = new StubSpeakerRepositoryImpl()

    //  Proviamo la inject tramite la Setter Injection.
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository repository) {   //  Constructor Injection!
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {   //  Setter Injection
        this.repository = repository;
    }

}
