
package br.com.biblioteca.DAO;

import br.com.biblioteca.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LivroDAO {
    Connection conn;
    PreparedStatement pstm; //Preparando a conexão para depois executar o sql.
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();
    
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
    
    public ArrayList<LivroDTO> PesquisarLivro() throws ClassNotFoundException{
        String sql = "SELECT * FROM livro";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
           
            while(rs.next()){
                LivroDTO livroDTO = new LivroDTO();
                livroDTO.setLivroId(rs.getInt("id"));
                livroDTO.setLivro(rs.getString("nome_livro"));
               
               lista.add(livroDTO);
           }
         
            pstm.close(); //fecha a conexão.
        } catch(SQLException e){
            
        }
        
        return lista;
    }
}
