package ejemplos.mis.formulariocontactocoursera;

/**
 * Created by nicopro on 8/5/16.
 */
public class Contacto {

    public String nombre,fechaDeNacimiento, telefono, email, descripcion;

    public Contacto(String nombre_,String fechaDeNacimiento_, String telefono_, String email_, String descripcion_)
    {
        this.nombre = nombre_;
        this.fechaDeNacimiento = fechaDeNacimiento_;
        this.telefono = telefono_;
        this.email = email_;
        this.descripcion = descripcion_;
    }
}
