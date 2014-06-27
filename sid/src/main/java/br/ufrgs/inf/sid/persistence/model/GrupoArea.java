package br.ufrgs.inf.sid.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GrupoArea")
public class GrupoArea implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_grupo", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome", nullable = false, length = 300)
	private String nome;

	public GrupoArea() {}

	public GrupoArea(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public GrupoArea(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}