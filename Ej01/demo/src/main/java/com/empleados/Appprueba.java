package Ej01.demo.src.main.java.com.empleados;

public class Appprueba {
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.ArrayList;
    
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;
    import java.util.List;
    import com.google.gson.reflect.TypeToken;
    public class App {
        public static ArrayList<Empleado> LEmpleados = new ArrayList<>();
    
        public static void main (String[] args){
            Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
            Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5);
            Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
            LEmpleados.add(e1);
            LEmpleados.add(c1);
            LEmpleados.add(d1);
            // LEmpleados.add(new Director("003", "Maria", "maria@gamil.com", 5, 1));
            App.guardar();
            for (Empleado e: LEmpleados){
                e.setHorasExtra(10);
                System.out.println(e);
            }
            App.guardar();
    
        }
    
    
        public static void main1 (){
            Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
            System.out.println(e1);
            Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5);
            System.out.println(c1);
            c1.contabilizar();
            Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
            System.out.println(d1);
            d1.analizar();
        }
        public static void imprimirTodosLosEmpleado(){
            for (Empleado e: LEmpleados){
                System.out.println(e.toString());
            }
        }
        public static void guardar(){
            //Esta creando el archivo empleados.json con la libreria Gson
            //El writer es el manejador/apuntador de este fichero
            try (FileWriter writer = new FileWriter("empleados.json")){
                Gson gson = new GsonBuilder().setPrettyPrinting().create(); //hay que importar el create,como el Scanner
                gson.toJson(LEmpleados, writer);
            } 
            //captura la excepcion y muestra un mensaje en caso de que haya un error
            //en la creacion del fichero
            //Si existe ese archivo lo reescribirá
            catch (IOException e){
                System.out.println("No se ha podido escribir el archivo");
            }
        }
        public static void cargarEmpleados(){
            // Type type = new TypeToken<ArrayList<Empleado>>(){}.getType();
            // try (FileReader reader = new FileReader("empleados.json")){
            //     Gson gson = new Gson();
            //     ArrayList<Empleado>empleadosCargadps = gson.fromJson(reader, type);
            //     for (Empleado e: empleadosCargados){
            //         if(e instanceof Contable){
            //           LContables.add((Contable)e);
            //     }else if (e instanceof Director){
            //         LDirecotres.add((Director)e);
            //     }
                //LEmpleados.add(e);
            // } 
            // catch (IOException e){
            //     System.out.println("No se ha podido leer el archivo");
    
            // }
                System.out.println("Cargando empleados");
        
        
    }
     
}
