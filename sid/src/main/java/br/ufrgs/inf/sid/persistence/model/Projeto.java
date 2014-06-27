package br.ufrgs.inf.sid.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Projeto")
public class Projeto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_projeto", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome", nullable = false, length = 300)
	private String nome;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "ProjetoAreaPesquisa", joinColumns = { 
			@JoinColumn(name = "id_projeto", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "id_area", 
			nullable = false, updatable = false) })
	private Set<AreaPesquisa> areas = new HashSet<AreaPesquisa>(0);

	public Projeto() {}

	public Projeto(Integer id, String nome) {
		this.id = id;
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

	public Set<AreaPesquisa> getAreas() {
		return areas;
	}
	public void setAreas(Set<AreaPesquisa> areas) {
		this.areas = areas;
	}	
}