package rep;

public class EntregaComida extends Repartidor {

private String comida;

public EntregaComida(String comida, String nombre, String telefono, String vehiculo, String nombreBanco, String direccionBanco) {
super(nombre, telefono, vehiculo, nombreBanco, direccionBanco);
this.comida = comida;
}

public String getComida() {
return comida;
}

public void setComida(String comida) {
this.comida = comida;
}

}