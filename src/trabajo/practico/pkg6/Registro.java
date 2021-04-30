
package trabajo.practico.pkg6;

import java.util.*;

public class Registro {
   
    
    private TreeMap <Long,Contacto> agenda = new TreeMap<>();
    private Set <Long> clave = agenda.keySet();
    private ArrayList <Long> comiApe = new ArrayList <> ();
    private ArrayList <Contacto> comiCiud = new ArrayList <>();
    
    public Contacto agregarCliente(Long nro,Contacto contacto){
        if(agenda.put(nro, contacto) == null){
            return null;
        }
        return agenda.put(nro,contacto);       
    }
    
    public Contacto buscarCliente(long nro){
        for (Long it:clave){
            if (it == nro){     
                System.out.println("Se encontro el siguiente contacto del numero ingresado: " + agenda.get(it));
                return agenda.get(it);
            }
       }
        return null;
    }
    
    public List buscarTelefono(String ape){     
        for (Long it:clave){
            if (agenda.get(it).getApellido().startsWith(ape)){
               comiApe.add(it);
            }
        }   
        return comiApe;
    }
    
    public List buscarClientes (String ciud){      
        for (Long it:clave){
            if (agenda.get(it).getCiudad().startsWith(ciud)){
                comiCiud.add(agenda.get(it));
            }
        }
        return comiCiud;
    }
    
    public Long borrarCliente (String dni){
        Long i = null; 
        for (Long it:clave){
            if (agenda.get(it).getDni().startsWith(dni)){
                i = it;
                agenda.remove(it);
                return i;
            }
        } 
       
        return i;
    }

    public TreeMap<Long, Contacto> getAgenda() {
        return agenda;
    }

    
}
