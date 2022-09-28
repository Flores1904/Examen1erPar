package rep;

public class Main {

public static void main(String[] args) {

EntregaComida entrega1 = new EntregaComida("Pizza","Juan","12345678","Moto","BBVA","Calle Falsa 123");
System.out.println("El cliente ha pedido su comida: " + entrega1.getComida());

System.out.println("Los datos del repartidor son:");
System.out.println("Nombre: " + entrega1.getNombre());
System.out.println("Telefono: " + entrega1.getTelefono());
System.out.println("Vehiculo: " + entrega1.getVehiculo());
System.out.println("Banco: " + entrega1.getNombreBanco());
System.out.println("Direccion banco: " + entrega1.getDireccion());

}

}