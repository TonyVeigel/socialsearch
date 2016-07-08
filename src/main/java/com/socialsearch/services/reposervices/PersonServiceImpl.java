package com.socialsearch.services.reposervices;

import com.socialsearch.repositories.PersonRepository;
import com.socialsearch.services.PersonService;

/**
 * Created by veigelto on 7/8/16.
 */
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    
}
