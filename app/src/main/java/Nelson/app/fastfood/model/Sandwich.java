package Nelson.app.fastfood.model;

import java.io.Serializable;

@SuppressWarnings("Sandwich")
public class Sandwich implements Serializable {

    private Integer nombre;
    private Integer imagen;
    private Integer descripcion;
    private Integer precio;


    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public Integer getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Integer descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
