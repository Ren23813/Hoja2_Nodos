import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vista {
   
    private CustomStack<Integer> customStack;


    public Vista(){
        this.customStack  = new CustomStack<>();
    }

    public void leerDatosArchivo(String archivo){

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String line;
            line = br.readLine();

            while ( line != null ) {
                showResultado(line);
                
            }

        }
        catch (IOException e){
            e.printStackTrace();

        }

    }
}
