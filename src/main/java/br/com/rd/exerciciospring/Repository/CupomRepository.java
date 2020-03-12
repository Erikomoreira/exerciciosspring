package br.com.rd.exerciciospring.Repository;

import br.com.rd.exerciciospring.Model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CupomRepository extends JpaRepository<Cupom, Long> {

    public List<Cupom> findByIdClienteAndDtVenda(Long id_cliente, String dt_venda);
}
