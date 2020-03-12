package br.com.rd.exerciciospring.Service;

import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("CupomItemService")
public class CupomService {

    @Autowired
    CupomRepository repository;
    public ResponseEntity listarCupom(Long id_cliente, String dt_venda){

        if(id_cliente == null)
            return ResponseEntity.badRequest().body(new Exception("Id Cliente não Encontrado"));
        if(dt_venda == "")
            return ResponseEntity.badRequest().body(new Exception("Data de venda não informada"));

        List<Cupom> listaDeCupons = new ArrayList<>();

        listaDeCupons = repository.findByIdClienteAndDtVenda(id_cliente,dt_venda);

        return ResponseEntity.ok().body(listaDeCupons);

    }

}
