package com.brunobasques_jsp.second_challange.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant inicio;
    private Instant fim;
    
    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;
    
    public Bloco() {
    }
    
	public Bloco(Long id, Instant inicio, Instant fim) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}
    
	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fim, id, inicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloco other = (Bloco) obj;
		return Objects.equals(fim, other.fim) && Objects.equals(id, other.id) && Objects.equals(inicio, other.inicio);
	}
}
