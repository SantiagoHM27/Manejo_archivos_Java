import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class ManipulacionArchivos {

    public static void leerArchivo(String name){
        File archivo; // apunta a un archivo fisico del add
        FileReader reader; // llave con permiso de solo lectura
        BufferedReader bufer; // recuperar info. del archivo
        String linea;

        try{
            // crear un apuntador al archivo fisico
            archivo = new File("C:\\Users\\himej\\OneDrive\\Escritorio" + name + ".txt");
            // abrir el archivo para lectura
            reader = new FileReader(archivo);
            // configurar el bufer para leer datos del archivo
            bufer = new BufferedReader(reader);
            // lectura del contenido del archivo
            while ( (linea = bufer.readLine())!= null ){
                System.out.println("linea leida: " + linea);
                
            }
            reader.close();

        } catch( Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
            }

    public static void main(String[] args)  throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        System.out.println("Lectura de un archivo de Texto");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivo(fileName);
}
}