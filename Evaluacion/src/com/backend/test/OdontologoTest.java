package com.backend.test;

import com.backend.dao.IDao;
import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*class OdontologoTest implements IDao<Odontologo>{
    private OdontologoTest odontologoTest;
    private OdontologoDaoH2 odontologoDaoH2;

    public OdontologoTest(OdontologoTest odontologoTest, OdontologoDaoH2 odontologoDaoH2) {
        this.odontologoTest = odontologoTest;
        this.odontologoDaoH2 = odontologoDaoH2;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        return odontologoDaoH2.registrar(odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return odontologoDaoH2.listarTodos();
    }

    @Override
    public Odontologo buscarPorid(int id) {
        return odontologoDaoH2.buscarPorid(id);
    }


    @Test
    void deberiaListarTodosLosOdontologos(){

        List<Odontologo> odontologos = listarTodos();

        assert !odontologos.isEmpty();
    }
}*/