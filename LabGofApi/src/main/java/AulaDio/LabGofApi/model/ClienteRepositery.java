package AulaDio.LabGofApi.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepositery extends CrudRepository<Cliente,Long> {
}
