package com.socialsearch.services;

import java.util.List;

/**
 * Created by TonyVeigel on 7/9/16.
 */
public interface CRUDService<T> {

    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);

}
