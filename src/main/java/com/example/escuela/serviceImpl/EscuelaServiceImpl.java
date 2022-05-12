/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.escuela.serviceImpl;

import com.example.escuela.dao.EscuelaDao;
import com.example.escuela.model.Escuela;
import com.example.escuela.service.EscuelaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BRITNEY
 */
@Service //Para hacer referencia a que estamos trabajando con la BD
public class EscuelaServiceImpl implements EscuelaService {
    @Autowired //permite agregar un objeto o link
    private EscuelaDao escuelaDao;
    @Override
    
  //IMPLEMENTAR TODO LO DEMAS, PRIMERO EL OTRO  
    public int create(Escuela esc) {
        return escuelaDao.create(esc);
    }

    @Override
    public int update(Escuela esc) {
        return escuelaDao.update(esc);
    }

    @Override
    public int delete(int id) {
        return escuelaDao.delete(id);
    }

    @Override
    public Escuela read(int id) {
        return escuelaDao.read(id);
    }

    @Override
    public List<Escuela> readAll() {
        return escuelaDao.readAll();
    }
    
}
