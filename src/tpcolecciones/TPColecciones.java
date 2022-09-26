package tpcolecciones;

public class TPColecciones {

    public static void main(String[] args) {
        //creamos el directorio
        DirectorioTelefonico direc = new DirectorioTelefonico();
        //creamos los clientes//
        Cliente cliente1 = new Cliente(1, "Nico", "Riquelme", "San Luis", "a");
        Cliente cliente2 = new Cliente(2, "Ivan", "Riquelme", "San Luis", "b");
        Cliente cliente3 = new Cliente(3, "Martin", "Lope", "La quiaca", "c");
        Cliente cliente4 = new Cliente(4, "Gustavo", "Carrizo", "Laferrere", "d");
        //Agendamos a los clientes
        direc.agregarCliente(cliente1,266483468);
        direc.agregarCliente(cliente1,266483468);
        direc.agregarCliente(cliente2,266483985);
        direc.agregarCliente(cliente3,263499388);
        direc.agregarCliente(cliente4, 821785471);
        //Buscamos al cliente en base a su numero de telefono
        System.out.println(direc.buscarCliente(266483468));
        //Buscamos al cliente en base a la ciudad
        System.out.println(direc.buscarClientes("San Luis"));
        //Buscamos a los clientes en base al apellido
        System.out.println(direc.buscarTelefono("Riquelme"));
        //Removemos a un cliente de la ciudad de San Luis
        direc.borrarCliente(266483468);
        //Volvemos a mostrar a los clientes de la ciudad de San Luis
        System.out.println(direc.buscarClientes("San Luis"));

    }

}
