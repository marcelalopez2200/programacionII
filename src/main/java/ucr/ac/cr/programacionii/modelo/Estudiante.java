/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.programacionii.modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String carnet;
    private String nombre;

    public Estudiante() {
        this.carnet="000000";
        this.nombre="none";//aca les esta asignando por defecto estos datos si la persona no ingresa los datos.Tambien se puede inicializar si nada.
    }

    public Estudiante(String carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
