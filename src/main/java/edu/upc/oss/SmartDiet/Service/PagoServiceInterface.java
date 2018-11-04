package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Alimento;
import edu.upc.oss.SmartDiet.Entity.Pago;
import edu.upc.oss.SmartDiet.Entity.Usuario;

public interface PagoServiceInterface {
    Pago createPago (Pago pago);
    void deletePago(Pago pago);
    Pago actualizarPago(Pago pago);
    Pago getPago(int userID);
}
