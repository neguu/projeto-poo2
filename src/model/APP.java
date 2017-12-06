package model;
import java.util.ArrayList;

public class APP{
      public static void main(String []args){
    	
    	  ConexaoMySQL conexao = new ConexaoMySQL();
    	  conexao.conectar();
    	  

        Usuario user = new Usuario();
        Sistema sis = new Sistema();
        ArrayList<Usuario> users = sis.cadastrar();
        user = users.get(0);
        DAOPessoa daoPessoa = new DAOPessoa();
        daoPessoa.criarPessoa(user);
     }
}