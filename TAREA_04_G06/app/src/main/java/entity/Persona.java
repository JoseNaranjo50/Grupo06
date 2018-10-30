package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Persona implements Serializable {
    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String genero;
    private String fecha;
    private Boolean beca;
    private List<String> asignaturas;

    public Persona(){

    }

    public Persona(String usuario, String clave, String nombre, String apellido, String email, String celular, String genero, String fecha, Boolean beca, List<String> asignaturas) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.genero = genero;
        this.fecha = fecha;
        this.beca = beca;
        this.asignaturas = asignaturas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getBeca() {
        return beca;
    }

    public void setBeca(Boolean beca) {
        this.beca = beca;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Usuario=" + usuario +
                ", Nombre=" + nombre +
                ", Apellido=" + apellido +
                ", Email=" + email +
                ", Celular=" + celular +
                ", Genero=" + genero +
                ", Fecha=" + fecha +
                ", Beca=" + beca ;
    }
}
