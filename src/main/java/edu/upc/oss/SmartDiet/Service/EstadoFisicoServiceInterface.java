package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.EstadoFisico;

import java.util.List;

public interface EstadoFisicoServiceInterface {
    EstadoFisico createEstadoFisico (EstadoFisico EstadoF);
    void deleteEstadoFisico(EstadoFisico EstadoF);
    EstadoFisico actualizarEstadoFisico (EstadoFisico EstadoF);
    List<EstadoFisico> getAllEstadoFisicos();
    EstadoFisico getEstadoFisicoId(int ID);
}
