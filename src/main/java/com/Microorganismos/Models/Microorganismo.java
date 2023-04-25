/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Microorganismos.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fermin
 */
@Entity(name = "microorganismos")
public class Microorganismo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mic_id_micro")
    private int id;
    
    @Column(name = "mic_nombre_cmn")
    private String nombre_cmn;

    @Column(name = "mic_nombre_c_m")
    private String nombre_c_m;
    
    @Column(name = "mic_descripcion")
    private String descripcion;
    
    @Column(name = "mic_validacion")
    private boolean validacion;
    
    @Column(name = "mic_prevencion")
    private String prevencion;
    
    //Revisar que anotacion lleva @Column(name = "a que????")
    private List<Sintoma> sintomas;
    
    private List<Imagen> imagenes;
    
    @Column(name = "mic_usu_id_usuario")
    private int id_usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cmn() {
        return nombre_cmn;
    }

    public void setNombre_cmn(String nombre_cmn) {
        this.nombre_cmn = nombre_cmn;
    }

    public String getNombre_c_m() {
        return nombre_c_m;
    }

    public void setNombre_c_m(String nombre_c_m) {
        this.nombre_c_m = nombre_c_m;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public String getPrevencion() {
        return prevencion;
    }

    public void setPrevencion(String prevencion) {
        this.prevencion = prevencion;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    
    
}
