package org.politecnicomalaga.model;

//atributos
public class Cliente {
    public String sNombre;
    public String sApellido1;
    private String sApellido2;
    private String sTelefono;
    private String sEmail;
    private String sDireccion;
    private String sFechaNacimiento;
    private int iEdad;
    private String sDni;

    //metodo
//constructor
    public Cliente(String sDni, String sNombre, String sApellido1, String sApellido2, String sTelefono, String sEmail, String sDireccion, String sFechaNacimiento, int iEdad) {
        this.sNombre = sNombre;
        this.sApellido1 = sApellido1;
        this.sApellido2 = sApellido2;
        this.sTelefono = sTelefono;
        this.sEmail = sEmail;
        this.sDireccion = sDireccion;
        this.sFechaNacimiento = sFechaNacimiento;
        this.iEdad = iEdad;
        this.sDni = sDni;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido1() {
        return sApellido1;
    }

    public void setsApellido1(String sApellido1) {
        this.sApellido1 = sApellido1;
    }

    public String getsApellido2() {
        return sApellido2;
    }

    public void setsApellido2(String sApellido2) {
        this.sApellido2 = sApellido2;
    }

    public String getsTelefono() {
        return sTelefono;
    }

    public void setsTelefono(String sTelefono) {
        this.sTelefono = sTelefono;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    public String getsFechaNacimiento() {
        return sFechaNacimiento;
    }

    public void setsFechaNacimiento(String sFechaNacimiento) {
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }
}