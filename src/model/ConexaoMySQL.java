package model;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;

public class ConexaoMySQL{

    private static Connection conexao;
    private String driver, caminho, user, password;
    
    public ConexaoMySQL() {
        // atributo para defini��o do servi�o do BD utilizado pela aplica��o
        this.driver = "com.mysql.jdbc.Driver";
        // atributo para defini��o da url de acesso ao banco
        this.caminho = "jdbc:mysql://localhost:3306/rede_social";
        // atributo para defini��o do login do usu�rio no banco
        this.user = "root";
        // atributo para defini��o da senha do usu�rio no banco
        this.password = "";
        // objeto respons�vel pelo estabelecimento da conex�o com o BD (ser� inicializado quando a conex�o
        // com o banco for iniciada)
        this.conexao = null;
    }
    
    public void conectar() {
        // seta o drive de conex�o como propriedade do sistema acess�vel pela aplica��o ao ser
        // executada sobre a inst�ncia da JVM (o driver do BD deve ser importado para o projeto no Java Build Path) 
        System.setProperty("jdbc.Drivers", driver);
        
        try {
            // inicializa��o da conex�o com o banco
            conexao = DriverManager.getConnection(caminho, user, password);
            System.out.println("Conex�o Efetuada com Sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void desconectar() {
        try {
            // finaliza��o da conex�o com o banco (deve sempre ser chamado ao encerrar um
            // acesso ao banco)
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public ResultSet executarSQL(String comando) {
        // toda consulta ao banco resulta em um objeto do tipo ResultSet
        ResultSet resultado = null;
        
        try {
            // objeto que permita e realiza a interface dos comandos SQL a serem enviados da
            // aplica��o Java para o BD
            PreparedStatement stm = conexao.prepareStatement(comando);
            stm.execute();
            resultado = stm.getResultSet();
            
            // outra forma de realizar consultas ao banco:
            // Statement stm = conexao.createStatement();
            // resultado = stm.executeQuery(comando);
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return resultado;
    }

    // para acessar a conex�o (que est� encapsulada)
    public Connection getConexao() {
        return conexao;
    }
    
}