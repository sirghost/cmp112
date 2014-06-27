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
@Table(name = "Pessoa")
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pessoa", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="code", nullable = false, length = 10)
	private String code;
	
	@Column(name="nome", nullable = false, length = 200)
    private String name;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "PessoaAreaPesquisa", joinColumns = { 
			@JoinColumn(name = "id_pessoa", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "id_area", 
			nullable = false, updatable = false) })
	private Set<AreaPesquisa> areas = new HashSet<AreaPesquisa>(0);

	public Pessoa() {}

	public Pessoa(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set<AreaPesquisa> getAreas() {
		return areas;
	}
	public void setAreas(Set<AreaPesquisa> areas) {
		this.areas = areas;
	}	
}