package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.DatoAlimento;

import java.util.List;

public interface DatoAlimentoServiceInterface {
    DatoAlimento createDatoAlimento (DatoAlimento alimento);
    void deleteDatoAlimento(int id);

    DatoAlimento getDatoAlimentobyId(int id);

    List<DatoAlimento> getDatoAlimentos();
}