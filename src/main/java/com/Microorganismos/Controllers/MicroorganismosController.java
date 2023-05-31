/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Microorganismos.Controllers;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import com.Microorganismos.Models.Microorganismo;
import com.Microorganismos.repository.MicroorganismoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author fermin
 */
public class MicroorganismosController {
    @Autowired
    MicroorganismoRepository empRep;
    
    @GetMapping("/microorganismo")
    public List<Microorganismo> findAll(){
        List<Microorganismo> l_mics= new ArrayList<>();
        return l_mics;
    }
}
