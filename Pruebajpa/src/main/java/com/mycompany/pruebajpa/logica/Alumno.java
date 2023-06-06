
package com.mycompany.pruebajpa.logica;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; 
    @Basic
    private String nombre; 
    private String apellido;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento; 

    public Alumno(int edad, String nombre, String apellido, Date fechaNacimiento) {
        this.id = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno() {
    }

    public int getEdad() {
        return id;
    }

    public void setEdad(int edad) {
        this.id = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
