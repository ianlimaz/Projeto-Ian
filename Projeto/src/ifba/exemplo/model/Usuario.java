package ifba.exemplo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name= "usuario")

public class Usuario {
	@Id
	@Column(name="id_usuario")
	private int id_usuario;
	
	@Column(name="nm_usuario")
	private String nm_usuario;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="rg")
	private String rg;
	
	@Column(name="sexo")
	private char sexo;
	
	@Column(name="dtnascimento")
	private Date dtnascimento;
	
	@Column(name="email")
	private String email; 
	
	@Column(name="senha")
	private String senha; 
	
	@Column(name="telefone")
	private String telefone;

	@Column(name="funcao")
	private String funcao; 
	
	
	public Usuario () {}
	
	
	public Usuario(int id_usuario, String nm_usuario, String cpf, String rg, char sexo, Date dtnascimento, String email,
			String senha, String telefone, String funcao) {
		super();
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dtnascimento = dtnascimento;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.funcao = funcao;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNm_usuario() {
		return nm_usuario;
	}
	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getDtnascimento() {
		return dtnascimento;
	}
	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
