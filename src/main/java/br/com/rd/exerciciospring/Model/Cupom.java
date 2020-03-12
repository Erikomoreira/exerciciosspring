package br.com.rd.exerciciospring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TB_CUPOM")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUPOM")
    private Long id_cupom;

    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(name = "DT_VENDA")
    private String dt_venda;

    @Column(name = "VL_VENDA")
    private BigDecimal vl_venda;



}
