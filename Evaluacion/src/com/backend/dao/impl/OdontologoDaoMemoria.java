package com.backend.dao.impl;

import com.backend.dao.IDao;
import com.backend.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);

    private List<Odontologo> odontologoRepository;

    public OdontologoDaoMemoria(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {

        int id = odontologoRepository.size() + 1;

        Odontologo odontologoRegistrado = new Odontologo(id, odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());

        odontologoRepository.add(odontologo);
        LOGGER.info("Odontologo guardado: " + odontologoRegistrado);

        return odontologoRegistrado;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return null;
    }

    @Override
    public Odontologo buscarPorId(int id) {
        return null;
    }
}
