package unah.hn.examen2.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuotas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoCuotas")
    private int codigoCuotas;

    @Column(name = "mes")
    private int mes;

    @ManyToOne
    @Column(name = "codigoPrestamo")
    private int codigoPrestamo;

    @Column(name = "interes")
    private float interes;

    @Column(name = "capital")
    private float capital;

    @Column(name = "decimal")
    private float decimal;

}
