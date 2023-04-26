package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "numero_pedido", updatable = false, nullable = false, unique = true)
	private Long num_ped;
	@Column(name = "data_pedido")
	private LocalDate data_ped;
	
	public Long getNum_ped() {
		return num_ped;
	}
	public void setNum_ped(Long num_ped) {
		this.num_ped = num_ped;
	}
	public LocalDate getData_ped() {
		return data_ped;
	}
	public void setData_ped(LocalDate data_ped) {
		this.data_ped = data_ped;
	}
}
