package model;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
	public String nome;
	public String login;
	protected int idade;
	protected String senha;
	protected String sexo;

	public void fazerAmizade() {

	}

	public int verificar_Idade(int idade) {
		return 5;
	}

//	

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", idade=" + idade + ", senha=" + senha + 
			 ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}
	
	
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

	
	
	
	

	
	
	
	

	public String getSexo() {
		return sexo;
	}
	
	
	

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	

	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
	
	public void setSenha(String senha){
		this.senha=senha;
	}
	
	
	

	public void desfazerAmizade() {

	}
	
	
	
	

	public void configuraçãoPrivacidade() {

	}
	
	
	
	

	public String getNomeUsuario() {
		return this.nome;
	}
	
	
	
	

	public String getLogin() {
		return login;
	}
	
	
	
	

	public int getIdade() {
		return idade;
}
	
	
	
	
	public String getSenha(){
		return this.senha;
	}
	
	
	
	
}




