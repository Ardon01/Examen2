package unah.hn.examen2.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.examen2.Servicios.impl.ClienteServicioImpl;
import unah.hn.examen2.modelos.Cliente;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/creditos")
public class ClienteControlador {

    @Autowired
    private ClienteServicioImpl clienteServicioImpl;

    @PostMapping("/crearcliente")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {
        return clienteServicioImpl.crearCliente(nvoCliente);
    }

}
