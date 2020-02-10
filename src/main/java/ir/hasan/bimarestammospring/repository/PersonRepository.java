package ir.hasan.bimarestammospring.repository;

import ir.hasan.bimarestammospring.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<PersonEntity, String> {


    Optional<PersonEntity> findById(String id);
}
