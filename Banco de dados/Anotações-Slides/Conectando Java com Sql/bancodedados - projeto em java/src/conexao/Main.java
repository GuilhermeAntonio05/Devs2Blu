package conexao;

//importando a biblioteca de comandos sql
import java.sql.*;

public class Main {
	//URl = caminho para a conexão "jdbc:postgresql://localhost:5432/meu_banco_de_dados"
	private static final String URl = "jdbc:postgresql://localhost:5432/teste";
	//USER = usuario do banco de dados
	private static final String USER = "postgres";
	//PASSWORD senha do banco de dados
	private static final String PASSWORD = "@1@senac2021";

	public static void main(String[] args) {
		//Criando a variável de conexão
		Connection conn = null;

		try {
			//Gera a conexão com o banco
			conn = DriverManager.getConnection(URl, USER, PASSWORD);
			//Desabilita a função de auto commit
			conn.setAutoCommit(false);
			
			if (conn != null) {
				//escrevendo a query
				String sql = "insert into usuarios (nome,email) values('pedro','pedro@gmail.com')";
				//executa a query
				PreparedStatement stm = conn.prepareStatement(sql);
				stm.execute();
				conn.commit();
			}

		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
