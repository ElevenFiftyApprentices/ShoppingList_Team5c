package org.elevenfifty.shoppingapplication.repository;

import org.elevenfifty.shoppingapplication.beans.Lists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends CrudRepository<Lists, Integer>{

}
