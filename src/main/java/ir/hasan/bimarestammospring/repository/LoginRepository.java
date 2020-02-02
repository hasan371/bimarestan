package ir.hasan.bimarestammospring.repository;

import ir.hasan.bimarestammospring.model.LoginEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginRepository extends CrudRepository<LoginEntity,String> {
    List<LoginEntity> findByUser1(String user1);

}
