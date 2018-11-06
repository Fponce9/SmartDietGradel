package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.TipoDeAlimento;

import java.util.List;

public interface TipoDeAlimentoServiceInterface {
    TipoDeAlimento createTipoDA (TipoDeAlimento TipoDA);
    void deleteTipoDA(TipoDeAlimento TipoDA);
    TipoDeAlimento actualizarTipoDeAlimento (TipoDeAlimento TipoDA);
    List<TipoDeAlimento> getAllTipoDeAlimentos();
    TipoDeAlimento getTipoDeAlimentoId(int ID);
}
