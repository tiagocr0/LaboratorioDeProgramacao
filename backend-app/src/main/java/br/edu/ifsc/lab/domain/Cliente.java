package br.edu.ifsc.lab.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Cliente extends Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//List<Venda> historicoVendas = new ArrayList<>();

	
	public Cliente() {
		super();
	}











	public Cliente(Integer id,String login, String senha, String nome, String cpf) {
		super(id, login, senha, nome, cpf);
		// TODO Auto-generated constructor stub
	}











	/*public List<Venda> getHistoricoVendas() {
		return historicoVendas;
	}

	public void setHistoricoVendas(List<Venda> historicoVendas) {
		this.historicoVendas = historicoVendas;
	}*/
	
	
}
