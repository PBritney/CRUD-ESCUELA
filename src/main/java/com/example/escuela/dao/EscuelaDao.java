package com.example.escuela.dao;

import com.example.escuela.model.Escuela;
import java.util.List;

/**
 *
 * @author BRITNEY
 */
public interface EscuelaDao {
    int create(Escuela esc);
    int update(Escuela esc);
    int delete(int id);
    Escuela read(int id);
    List<Escuela> readAll();
}
