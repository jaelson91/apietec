package com.etec.app.apietec.dto;

import java.io.Serializable;
import java.sql.Date;

public class AlunoDto  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2502407606585802494L;
	private String nome;
	private String rg;
	private String cpf;
	private String email;
	private String id_curso;
	private Date data_nasc;
	
	public AlunoDto () {}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getId_curso() {
		return id_curso;
	}



	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	}



	public Date getData_nasc() {
		return data_nasc;
	}



	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "AlunoDto [nome=" + nome 
				+ ", rg=" 	+ rg 
				+ "cpf=" 	+ cpf
				+ "email=" 	+ email
				+ "id_curso=" + id_curso
				+ "data_nasc=" + data_nasc +
				"]";
	} 


}
