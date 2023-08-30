package TestCrud;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

/**
 * 
 * @author Fernando
 * - Driver JDBC - Java Database Connectivity
 * - Executar instruções SQL (Qualquer banco de dados relacional)
 * - Pacote java.sql (biblioteca Java)
 * - Classe DriverManager
 * - Interfaces (Driver, Connection, Statement, PreparedStatement, ResultSet
 *
 */

public class GerenciadorClientes{
	
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	
	public GerenciadorClientes() throws Exception{
		OracleDataSource ods = new OracleDataSource();
		
		//configurando a URL
		ods.setURL(url);
		//configurando o usuário
		ods.setUser(Credenciais.user);
		//configurando a senha
		ods.setPassword(Credenciais.pwd);
		
		//obter uma conexão com o SGBD
		ods.getConnection();
	}
	
	
}