package rep;

public class Cliente {

private String nombre;
private String direccion;
private String telefono;

public Cliente(String nombre, String direccion, String telefono) {
this.nombre = nombre;
this.direccion = direccion;
this.telefono = telefono;
}

public void pedirComida() {
System.out.println("El cliente ha pedido comida");
}

public void imprimirComida() {
System.out.println("La comida que ha pedido el cliente es: ");
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getDireccion() {
return direccion;
}

public void setDireccion(String direccion) {
this.direccion = direccion;
}

public String getTelefono() {
return telefono;
}

public void setTelefono(String telefono) {
this.telefono = telefono;
}

}
