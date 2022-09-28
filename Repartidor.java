package rep;

public class Repartidor extends Banco {

private String nombre;
private String telefono;
private String vehiculo;

public Repartidor(String nombre, String telefono, String vehiculo, String nombreBanco, String direccionBanco) {
super(nombreBanco, direccionBanco);
this.nombre = nombre;
this.telefono = telefono;
this.vehiculo = vehiculo;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getTelefono() {
return telefono;
}

public void setTelefono(String telefono) {
this.telefono = telefono;
}

public String getVehiculo() {
return vehiculo;
}

public void setVehiculo(String vehiculo) {
this.vehiculo = vehiculo;
}

}
