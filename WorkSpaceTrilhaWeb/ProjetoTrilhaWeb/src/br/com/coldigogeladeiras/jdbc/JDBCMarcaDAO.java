package br.com.coldigogeladeiras.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import br.com.coldigogeladeiras.jdbcinterface.MarcaDAO;
import br.com.coldigogeladeiras.modelo.Marca;

public class JDBCMarcaDAO implements MarcaDAO {

    private Connection conexao;

    public JDBCMarcaDAO(Connection conexao) {
            this.conexao = conexao;
    }

    public List<Marca> buscar() {
            
            //CriaÃ§Ã£o da instruÃ§Ã£o SQL para busca de todas as marcas 
            String comando = "SELECT * FROM marcas";
            
            //CriaÃ§Ã£o de uma lista para armazenar cada marca encontrada
            List<Marca> listMarcas = new ArrayList<Marca>();
            
            //CriaÃ§Ã£o do objeto marca com valor null (ou seja, sem instanciÃ¡-lo)
            Marca marca = null;
            
            //Abertura do try-catch
            try {
                    
                    //Uso da conexÃ£o do banco para preparÃ¡-lo para uma instruÃ§Ã£o SQL
                    Statement stmt = conexao.createStatement(); 
                    
                    //ExecuÃ§Ã£o da instruÃ§Ã£o criada previamente 
                    //e armazenamento do resultado no objeto rs 
                    ResultSet rs = stmt.executeQuery(comando);
                    
                    //Enquanto houver uma prÃ³xima linha no resultado
                    while (rs.next()) {
                            
                            //CriaÃ§Ã£o de instÃ¢ncia da classe Marca   
                            marca = new Marca();
                            
                            //Recebimento dos 2 dados retornados do BD para cada linha encontrada
                            int id = rs.getInt("id");
                            String nome = rs.getString("nome");
                            
                            //Setando no objeto marca os valores encontrados
                    marca.setId(id);
                    marca.setNome(nome);
                                                    
                    //AdiÃ§Ã£o da instÃ¢ncia contida no objeto Marca na lista de marcas
                            listMarcas.add(marca);
                    }
                    
            //Caso alguma Exception seja gerada no try, recebe-a no objeto "ex"        
            } catch (Exception ex) {
                    //Exibe a exceÃ§Ã£o na console
                    ex.printStackTrace();
            }                
            
            //Retorna para quem chamou o mÃ©todo a lista criada
            return listMarcas;
            
    } 
    
    public boolean inserirMarca(Marca marca) {
    	
    	String comando = "INSERT INTO marcas (id, nome) VALUES (?, ?)";
    	
    	PreparedStatement p;
    	
    	try {
    		p = this.conexao.prepareStatement(comando);
    		
    		p.setInt(1, marca.getId());
    		p.setString(2, marca.getNome());
    		
    		p.execute();
    		
    	}catch(SQLException e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    public List<JsonObject> buscarNomeMarca(String nome){
    	
    	String comando = "SELECT * FROM marcas";
    	
    	if(!nome.equals("")) {
    		comando += " WHERE nome LIKE '%" + nome + "%' ";
    	}
    	
    	comando += " ORDER BY nome ASC";
    	
    	List<JsonObject> listaDeMarcas = new ArrayList<JsonObject>();
        JsonObject marca = null;
        
        try {
        	Statement stmt = conexao.createStatement();
        	ResultSet rs = stmt.executeQuery(comando);
        	
        	while(rs.next()) {
        		
        		int id = rs.getInt("id");
        		String nomeMarca = rs.getString("nome");
        		
        		marca = new JsonObject();
        		marca.addProperty("id", id);
        		marca.addProperty("nome", nomeMarca);
        		
        		listaDeMarcas.add(marca);
        		
        	}
        	
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        return listaDeMarcas;
    } 
    
    public boolean deletar(int id) {
    	
    	String comando = "DELETE FROM marcas WHERE id = ?";
    	PreparedStatement p;
    	
    	try {
    		p = this.conexao.prepareStatement(comando);
    		p.setInt(1, id);
    		p.execute();
    	}catch(SQLException e) {
    		e.printStackTrace();
    		return false;
    	}
    	
    	return true;
    	
    }
    
    public Marca buscarPorId(int id) {
    	
    	String comando = "SELECT * FROM marcas WHERE marcas.id = ?";
    	Marca marca = new Marca();
    	try {
    		
    		PreparedStatement p = this.conexao.prepareStatement(comando);
    		p.setInt(1, id);
    		ResultSet rs = p.executeQuery();
    		while(rs.next()) {
    			
    			String nomeMarca = rs.getString("nome");
    			
    			marca.setId(id);
    			marca.setNome(nomeMarca);
    		}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return marca;
    }
    
    public boolean alterar(Marca marca) {
    	
    	String comando = "UPDATE marcas SET nome=? WHERE id=?";
    	PreparedStatement p;
    	
    	try {
    		p = this.conexao.prepareStatement(comando);
    		p.setString(1, marca.getNome());
    		p.setInt(2, marca.getId());
    		p.executeUpdate();
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
}
