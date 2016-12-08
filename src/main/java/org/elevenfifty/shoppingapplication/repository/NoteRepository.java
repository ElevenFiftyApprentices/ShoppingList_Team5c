package org.elevenfifty.shoppingapplication.repository;

import org.elevenfifty.shoppingapplication.beans.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Notes, Integer>{

}

