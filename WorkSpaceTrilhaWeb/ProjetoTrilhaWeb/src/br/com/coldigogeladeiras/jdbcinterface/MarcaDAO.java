package br.com.coldigogeladeiras.jdbcinterface;

import java.util.List;

import com.google.gson.JsonObject;

import br.com.coldigogeladeiras.modelo.Marca;

public interface MarcaDAO {
    
    public List<Marca> buscar();
    public boolean inserirMarca(Marca marca);
    public List<JsonObject> buscarNomeMarca(String nome);
    public boolean deletar(int id);
    public Marca buscarPorId(int id);
    public boolean alterar(Marca marca);

}
