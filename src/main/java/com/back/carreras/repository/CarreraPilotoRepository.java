/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.carreras.repository;

import com.back.carreras.model.CarreraPiloto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author priva
 */
public interface CarreraPilotoRepository extends JpaRepository<CarreraPiloto, Long>{
    
}
