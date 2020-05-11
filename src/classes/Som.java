package classes;
        
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-07
 * 
 * @lib     http://www.javazoom.net/javalayer/sources.html
 * @efeitos https://www.soundjay.com  / https://toquesengracadosmp3.com / https://www.findsounds.com/
 */
public class Som extends Thread {
    private Player ply;   
    int tipo = -1;
    
    public void run() {
        try {
            String efeito = "";
            
            switch(tipo) {
                case Forca.SOM_INICIAR: efeito = "iniciar"; break;
                case Forca.SOM_ERRO:    efeito = "erro"; break;
                case Forca.SOM_ACERTO:  efeito = "acerto"; break;
                case Forca.SOM_DERROTA: efeito = "derrota"; break;
                case Forca.SOM_VITORIA: efeito = "vitoria"; break;   
                case Forca.SOM_TICTOC:     efeito = "tictoc"; break;
            }
           
            if (!efeito.equals("")) {
                InputStream input = this.getClass().getResourceAsStream(
                                                    "/sons/" + efeito + ".mp3");

                ply = new Player(input);
                ply.play();
            }
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
    
    // sobrescrevi o método para poder receber o parâmetro do efeito
    public void start(int tipo) {
        this.tipo = tipo;

        this.start();        
    }
}
