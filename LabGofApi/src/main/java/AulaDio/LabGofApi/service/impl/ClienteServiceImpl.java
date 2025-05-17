package AulaDio.LabGofApi.service.impl;

import AulaDio.LabGofApi.model.Cliente;
import AulaDio.LabGofApi.model.ClienteRepositery;
import AulaDio.LabGofApi.model.Endereco;
import AulaDio.LabGofApi.model.EnderecoRepositery;
import AulaDio.LabGofApi.service.ClienteService;
import AulaDio.LabGofApi.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepositery clienteRepositery;
    @Autowired
    private EnderecoRepositery enderecoRepositery;
    @Autowired
    private  ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepositery.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepositery.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComcep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepositery.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComcep(cliente);

        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepositery.deleteById(id);

    }

    private  void salvarClienteComcep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepositery.findById(cep).orElseGet(() ->{
            Endereco novoEndereso = viaCepService.consultarCep(cep);
            enderecoRepositery.save(novoEndereso);
            return novoEndereso;
        });
        cliente.setEndereco(endereco);
        clienteRepositery.save(cliente);
    }
}
