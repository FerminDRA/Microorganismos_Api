/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Microorganismos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Microorganismos.Models.Microorganismo;

/**
 *
 * @author fermin
 */
public interface MicroorganismoRepository extends JpaRepository<Microorganismo, Integer>{
    
}
