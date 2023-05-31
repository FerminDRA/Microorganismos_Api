/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Microorganismos.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fermin
 */
@Entity(name = "sin_mic")
public class Sin_Mic {
    
    /*Agregar las relacinoes de uno a muchos y ver como desde el front vamos a enviarle
    el id de el sintoma desde la lista a el back para que se guarde*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sin_id_sintomas")
    private int id_sintomas;
    
    @ManyToOne
    @JoinColumn(name = "mic_id_micro")
    private Microorganismo mic;

    public Sin_Mic() {
        mic= new Microorganismo();
    }
    
    public Microorganismo getMic() {
        return mic;
    }

    public void setMic(Microorganismo mic) {
        this.mic = mic;
    }

    public int getId_sintomas() {
        return id_sintomas;
    }

    public void setId_sintomas(int id_sintomas) {
        this.id_sintomas = id_sintomas;
    } 
    
}
