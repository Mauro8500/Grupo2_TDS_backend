package bo.ucb.edu.tallersoftware.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "type_user")
public class TypeUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_type_user")
    private int id;
    @Basic
    @Column(name = "name")
    private String tipo;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TypeUser)) {
            return false;
        }
        TypeUser typeUser = (TypeUser) o;
        return id == typeUser.id && Objects.equals(tipo, typeUser.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo);
    }



}
