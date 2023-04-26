package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens_pedidos")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sequencia", updatable = true, nullable = false, unique = true)
	private Long seq_item;
	@Column(name = "quantidade")
	private BigDecimal quant_item;
	@Column(name = "valor_total")
	private BigDecimal valor_total_item;
	
	public Long getSeq_item() {
		return seq_item;
	}
	public void setSeq_item(Long seq_item) {
		this.seq_item = seq_item;
	}
	public BigDecimal getQuant_item() {
		return quant_item;
	}
	public void setQuant_item(BigDecimal quant_item) {
		this.quant_item = quant_item;
	}
	public BigDecimal getValor_total_item() {
		return valor_total_item;
	}
	public void setValor_total_item(BigDecimal valor_total_item) {
		this.valor_total_item = valor_total_item;
	}
}
