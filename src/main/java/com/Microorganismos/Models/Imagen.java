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

@Entity(name = "imagenes")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ima_id_imagen")
    private int id;
    
    @Column(name = "ima_url")
    private String url;
    //Revisar la relacion de imagen - microorganismo
    
    @ManyToOne
    @JoinColumn(name = "mic_id_micro")
    private Microorganismo mic;

    public Imagen() {
        mic= new Microorganismo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Microorganismo getMic() {
        return mic;
    }

    public void setMic(Microorganismo mic) {
        this.mic = mic;
    }
}
