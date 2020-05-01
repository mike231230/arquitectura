package bean;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="delegacion")

@Data
public class embean {
    @Id
    @GeneratedValue
    private int iddelegacion;
    @Column(name="nombre")
    private String nombre;

    private int srNO;



    public int getIddelegacion() {
        return iddelegacion;
    }

    public void setIddelegacion(int iddelegacion) {
        this.iddelegacion = iddelegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSrNO() {
        return srNO;
    }

    public void setSrNO(int srNO) {
        this.srNO = srNO;
    }
}
