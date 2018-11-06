package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;

import java.util.List;

public interface AlimentoServiceInterface {
    Alimento createAlimento (Alimento alimento);
    void deleteAlimento(int id);
    Alimento actualizarAlimento(Alimento alimento);
    Alimento getAlimentobyId(int id);
    List<Alimento> getByIdAlimento(int id);
    List<Alimento> getAlimentos();
}