package unah.hn.examen2.Servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.examen2.Servicios.ClienteServicio;
import unah.hn.examen2.modelos.Cliente;
import unah.hn.examen2.repositorios.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public Cliente crearCliente(Cliente nvoCliente) {
        return this.clienteRepositorio.save(nvoCliente);
    }

}
