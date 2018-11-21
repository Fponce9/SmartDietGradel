package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;

import java.util.Date;
import java.util.List;

public interface AlimentoServiceInterface {
    Alimento createAlimento(Alimento alimento);
    void deleteAlimento(int id);
    Alimento actualizarAlimento(Alimento alimento);
    List<Alimento> getAlimentos();
    List<Alimento> getAlimentosPorFecha(Date fecha);
}