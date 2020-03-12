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
@Table(name="TB_CUPOM_ITEM")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUPOM_ITEM")
    private Long id_cupom_item;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CUPOM")
    private Long id_cupom;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PRODUTO")
    private Long id_produto;

    @Column(name = "QT_PRODUTO")
    private Long qt_produto;

    @Column(name = "VL_PRODUTO")
    private BigDecimal vl_produto;


}
