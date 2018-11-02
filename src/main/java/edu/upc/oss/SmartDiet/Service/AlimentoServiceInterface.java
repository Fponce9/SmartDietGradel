package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;

public interface AlimentoServiceInterface {
    Alimento createAlimento (Alimento alimento);
    void deleteAlimento(Alimento alimento);
    Alimento actualizarAlimento(Alimento alimento);
}