
package br.com.biblioteca.DAO;

import br.com.biblioteca.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LivroDAO {
    Connection conn;
    PreparedStatement pstm; //Preparando a conexão para depois executar o sql.
    
    public void CadastrarLivro(LivroDTO livroDTO) throws ClassNotFoundException{
        String sql = "INSERT INTO livro(nome_livro) VALUES (?)";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,livroDTO.getLivro());
            pstm.execute();
            pstm.close(); //fecha a conexão.
        } catch(SQLException e){
            
        }
    }
}
