/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesos;
//importar paquetes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
 
  
/**
 *
 * @author Jairo
 */
public class Procesos {
    //declaracion de variables
    String nombres ="Jairo Antonio";
    String apellido ="Contreras Mendieta";
    int edad= 26;
    String correo = "jacontreras@utpl.edu.ec";
    String materia ="ingenieria en procesos";
    
    //Creacion de archivo
    static String directorio ="C:\\Users\\Jairo\\Desktop//DeberProcesos.txt";
    public static void main(String[] args) throws IOException {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : \n 1.Ingresar datos en un archivo \n 2.Leer el archivo \n  "));
    
   
        if(numero ==1 ){ 
              IngresarDatos();
        }else{
         if(numero ==2){
             LeerDatos();
         }
        }    
       
        // TODO code application logic here
    }
    //metodeo para ingresar datos
    public static void IngresarDatos() throws IOException{
          File documento = new File(directorio);
    if (!documento.exists()) {
              BufferedWriter datos = new BufferedWriter(new FileWriter(directorio));
             datos.write("************ DATOS PERSONALES DEL ESTUDIANTE  ************" + "\n" );
              datos.write("Nombres : Jairo Contreras " + "\n" );
              datos.write("Apellidos: Contreras Mendieta"+ "\n");
              datos.write("Carrera:   Sistemas Informaticos y Computacion"+ "\n");
              datos.write("Ciclo: 10mo Paralelo B " +  "\n" );
              datos.write("Materia: Ingenieria en Procesos " +  "\n" );
              datos.write("Correo Electronico : jacontreras@utpl.edu.ec " +  "\n" );

              datos.close();
               
             //mensaje de creacion del archivo
               System.out.println("datos ingresados correctamente...");
           }else{
             //mensaje en caso de error de creacion de archivo
               System.out.println("Ya existe el documento");
            
           }
      }
    //metodo de lectura del archivo creado
   public static void LeerDatos(){
         BufferedReader datos = null;
 		try {
 			String dato;
 			datos = new BufferedReader(new FileReader(directorio));//Permite leer texto del archivo creaado en directorio
 			while ((dato = datos.readLine()) != null) { //recorremos y presentamos el contenido del archivo de texto
                             System.out.println(dato); // imprimimos cada linea del archivo creado anteriormente
                            
                        } 
                        
 		} catch (IOException e) {
 			e.getMessage();//Se usa para obtener un mensaje de error asociado con una excepción
 		
 		}
     }
}
