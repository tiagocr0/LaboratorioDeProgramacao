package br.edu.ifsc.lab.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("usuarioVendedor")
public class UsuarioVendedor extends Usuario {
	private static final long serialVersionUID = 1L;

	private Float salario;

	@JsonIgnore
	@OneToMany(mappedBy = "usuarioVendedor")
	private List<Venda> historicoVenda = new ArrayList<>();

	public UsuarioVendedor() {

	}

	public UsuarioVendedor(Integer id, String email, String senha, String nome, String cpf, Float salario) {
		super(id, email, senha, nome, cpf);
		this.salario = salario;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public List<Venda> getHistoricoVenda() {
		return historicoVenda;
	}

	public void setHistoricoVenda(List<Venda> historicoVenda) {
		this.historicoVenda = historicoVenda;
	}

}
