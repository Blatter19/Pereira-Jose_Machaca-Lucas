package com.backend.test;


import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class OdontologoServiceTest {

    private OdontologoService odontologoService;


    @Test
    void deberiaRegistrarUnOdontologoYRetornarUnIdEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Perez");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

        Assertions.assertTrue(odontologoRegistrado.getId() != 0);

    }


    @Test
    void deberiaMostrarLaListaDeTodosLosOdontologos(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        List<Odontologo> odontologos = odontologoService.listarOdontologo();


        assertFalse(odontologos.isEmpty(), "La lista de odontólogos está vacía");
    }

}