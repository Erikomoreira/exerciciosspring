package br.com.rd.exerciciospring.Controller;

import br.com.rd.exerciciospring.Model.CupomItem;
import br.com.rd.exerciciospring.Service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CumpomController {


    @Autowired
    CupomService service;

    @GetMapping("/cupom")
    public List<CupomItem> buscarPorCodigoDescricao(@PathParam("id_cliente") Long id_cliente,
                                                    @PathParam("dt_venda") String dt_venda) {

        return  service.findByIdClienteAndDtVenda(id_cliente,dt_venda);

    }
}
