package com.pwrfit.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datos", catalog="pwrfit", schema="")
public class Datos {

    @Id
	@Column
	private Integer id;
	@Column
	private String documento;
	@Column
	private Integer edad;
    @Column
	private Integer peso;
    @Column
	private Double altura;
    @Column
	private String genero;
    @Column
	private Double imc;

    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
    
    
}
