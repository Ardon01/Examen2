package unah.hn.examen2.Servicios;

import java.util.List;

import unah.hn.examen2.modelos.Cliente;

public interface ClienteServicio {
    
    public Cliente crearCliente(Cliente nvoCliente);
    
    public List<Cliente> listaClientes();
}
