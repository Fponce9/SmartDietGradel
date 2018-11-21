package edu.upc.oss.SmartDiet.Service;

import edu.upc.oss.SmartDiet.Entity.Ejercicio;

import java.util.List;

public interface EjercicioServiceInterface {
    List<Ejercicio> getEjercicios();
    Ejercicio crearEjercicio(Ejercicio ejercicio);
    void deleteEjercicio(int id);
    Ejercicio getEjercicioById(int id);
    Ejercicio actualizarEjercicio (Ejercicio ejercicio);
    List<Ejercicio> getEjerciciosporpuntaje(int puntaje);

}
