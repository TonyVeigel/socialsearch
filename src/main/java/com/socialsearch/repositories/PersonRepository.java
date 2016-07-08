package com.socialsearch.repositories;

import com.socialsearch.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by veigelto on 7/8/16.
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {


}
