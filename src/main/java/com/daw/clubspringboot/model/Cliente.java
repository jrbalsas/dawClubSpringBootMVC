package com.daw.clubspringboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
public class Cliente implements Serializable{

    @Id         //JPA annotations
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 4, max = 25, message = "La longitud ${validatedValue} debe estar entre {min} y {max} caracteres")
    private String nombre;
    
    @Pattern(regexp = "\\d{7,8}(-?[a-zA-Z])?", message = "{cliente.dni.formato}")
    private String dni;
    
    private boolean socio;
    private int medioPago;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    public Cliente () {
        id=0;
        nombre="Desconocido";
        socio=false;
        medioPago=0;
    }
    
    public Cliente(Integer id, String nombre, String dni, boolean socio) {
        this.id=id;
        this.nombre=nombre;
        this.dni=dni;
        this.socio=socio;
        this.medioPago=0;
        this.fechaNacimiento=null;
    }

    /**Copy constructor*/
    public Cliente(Cliente c) {
        this.id=c.id;
        this.nombre=c.nombre;
        this.dni=c.dni;
        this.socio=c.socio;
        this.medioPago=c.medioPago;
        this.fechaNacimiento=c.fechaNacimiento;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the socio
     */
    public boolean isSocio() {
        return socio;
    }

    /**
     * @param socio the socio to set
     */
    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public int getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(int medioPago) {
        this.medioPago = medioPago;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
