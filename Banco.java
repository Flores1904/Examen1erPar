package rep;

public class Banco {

private String nombreBanco;
private String direccion;

public Banco(String nombre, String direccion) {
this.nombreBanco = nombre;
this.direccion = direccion;
}

public String getNombreBanco() {
return nombreBanco;
}

public void setNombre(String nombre) {
this.nombreBanco = nombre;
}

public String getDireccion() {
return direccion;
}

public void setDireccion(String direccion) {
this.direccion = direccion;
}

}