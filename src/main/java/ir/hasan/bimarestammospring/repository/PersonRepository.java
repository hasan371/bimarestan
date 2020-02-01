package ir.hasan.bimarestammospring.repository;

import ir.hasan.bimarestammospring.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<PersonEntity, String> {
    List<PersonEntity> findByFirstName(String firstName);
}
