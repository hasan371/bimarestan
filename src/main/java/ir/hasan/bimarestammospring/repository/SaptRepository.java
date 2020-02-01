package ir.hasan.bimarestammospring.repository;

import ir.hasan.bimarestammospring.model.Sapt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaptRepository extends CrudRepository<Sapt,String> {
    List<Sapt> findByMeli(String meli);
}
