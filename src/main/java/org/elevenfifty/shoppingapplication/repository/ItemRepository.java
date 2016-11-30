package org.elevenfifty.shoppingapplication.repository;

import org.elevenfifty.shoppingapplication.beans.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Items, Integer> {

}
