package edu.mx.uttt.g1.vista;

import edu.mx.uttt.g1.conexion.Conexion;
import edu.mx.uttt.g1.entidad.Cliente;
import edu.mx.uttt.g1.modelo.ModeloCliente;

public class VistaCliente {

    public static void main(String[] args) {
        Cliente cli = new Cliente();

        cli.setCustomerID("CLIB1");
        cli.setCompanyName("pecsi");
        cli.setContactName("Soyla Vaca");
        cli.setContactTitle("Gerente ASI");
        cli.setCountry("Mexico");
        cli.setAddress("Conocido2");
        cli.setCity("Tepejiyork");
        cli.setRegion("Este");
        cli.setFax("234567789");
        cli.setPhone("3345435");
        cli.setPostalCode("42800");

        new ModeloCliente().insertar(cli);
    }
}
