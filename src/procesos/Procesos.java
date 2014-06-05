/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesos;

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

    String nombres ="Jairo Antonio";
    String apellido ="Contreras Mendieta";
    int edad= 26;
    String correo = "jacontreras@utpl.edu.ec";
    String materia ="ingenieria en procesos";
    /**
     * @param args the command line arguments
     */
    static String directorio ="C:\\Users\\Jairo\\Desktop//DeberProcesos.txt";
    public static void main(String[] args) throws IOException {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : \n 1.Ingresar datos en un archivo \n 2.Leer el archivo \n  "));
    
   
        if(numero ==1 ){ 
              IngresarDatos();
        }else{
         if(numero ==2){
             LeerArchivo();
         }
        }    
       
        // TODO code application logic here
    }
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
   public static void LeerArchivo(){
         BufferedReader br = null;
 		try {
 			String Linea;
 			br = new BufferedReader(new FileReader(directorio));
 			while ((Linea = br.readLine()) != null) { //recorremos y presentamos el contenido del archivo de texto
                             System.out.println(Linea); // imprimimos cada linea del archivo
 			}  
 		} catch (IOException e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				if (br != null)br.close();
 			} catch (IOException ex) {
 				ex.printStackTrace();
 			}
 		}
     }
}
