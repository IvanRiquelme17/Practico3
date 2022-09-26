package tpcolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class DirectorioTelefonico {
    
    HashMap<Long, Cliente> directorio = new HashMap();
    
    public DirectorioTelefonico() {
    }
    
    public void agregarCliente(Cliente cliente, long nroTel) {
        if (!directorio.containsKey(nroTel)) {
            directorio.put(nroTel, cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente existente");
        }
        directorio.put(nroTel, cliente);
    }
    
    public Cliente buscarCliente(long nroTel) {
        for (Long aux : directorio.keySet()) {
            if (aux.equals(nroTel)) {
                return directorio.get(aux);
            }
        }
        return null;
    }
    
    public ArrayList<Long> buscarTelefono(String apellido) {
        ArrayList<Long> listaTelefono = new ArrayList();
        for (Map.Entry<Long, Cliente> aux : directorio.entrySet()) {
            if (aux.getValue().getApellido().equals(apellido)) {
                listaTelefono.add(aux.getKey());
            }
        }
        return listaTelefono;
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> listaCliente = new ArrayList();
        for (Cliente aux : directorio.values()) {
            if (ciudad.equalsIgnoreCase(aux.getCiudad())) {
                listaCliente.add(aux);
            }
        }
        return listaCliente;
    }
    
    boolean borrarCliente(long num) {
        if (directorio.containsKey(num)) {
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            directorio.remove(num);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El numero no esta cargado en el directorio");
            return false;
        }
    }
    
}
