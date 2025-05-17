package AulaDio.LabGofApi.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositery extends CrudRepository<Endereco,String> {
}
