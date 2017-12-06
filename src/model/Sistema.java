package model;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	public ArrayList<Usuario> cadastrar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
		System.out.println("Digite os dados: " + "\nNome ");
		String nome = leitor.next();
		System.out.println("Login desejado ");
		String login = leitor.next();
		System.out.println("idade");
		int idade = leitor.nextInt();
		System.out.println("digite sua Senha de acesso");
		String senha = leitor.next();
		System.out.println("digite seu sexo");
		String sexo = leitor.next();
		
		Usuario usuario = new Usuario();
		
		
		usuario.setNome(nome);
		usuario.setLogin(login);
;		usuario.setIdade(idade);
		usuario.setSenha(senha);
		usuario.setSexo(sexo);
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		System.out.println(usuario.getNome() + "\n" + usuario.getLogin() + "\n" + usuario.getIdade());
		
		return usuarios;
	}

}
