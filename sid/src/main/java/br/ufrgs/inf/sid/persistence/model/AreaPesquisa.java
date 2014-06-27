package br.ufrgs.inf.sid.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "AreaPesquisa")
public class AreaPesquisa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_area", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome", nullable = false, length = 200)
	private String nome;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	@ForeignKey(name = "fk_grupo_area")
    private GrupoArea grupoArea;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "areas")
	private Set<Pessoa> pessoas = new HashSet<Pessoa>(0);
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "areas")
	private Set<Projeto> projetos = new HashSet<Projeto>(0);

	public AreaPesquisa() {	}

	public AreaPesquisa(Integer id, String nome, GrupoArea grupoArea) {
		this.id = id;
		this.nome = nome;
		this.grupoArea = grupoArea;
	}
	
	public AreaPesquisa(String nome, GrupoArea grupoArea) {
		this.nome = nome;
		this.grupoArea = grupoArea;
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

	public GrupoArea getGrupoArea() {
		return grupoArea;
	}
	public void setGrupoArea(GrupoArea grupoArea) {
		this.grupoArea = grupoArea;
	}

	public Set<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(Set<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Set<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}
}