package unah.hn.examen2.modelos;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamos {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPrestamo")
    private int codigoPrestamo;

    @Column(name = "fechaApertura")
    private Date fechaApertura;

    @Column(name = "monto")
    private float monto;

    @Column(name = "cuota")
    private float cuota;

    @Column(name = "plazo")
    private int plazo;

    @OneToMany
    @Column(name = "dni")
    private Cliente dni;

}
