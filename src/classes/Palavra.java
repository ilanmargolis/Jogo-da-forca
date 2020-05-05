package classes;

import java.util.Random;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-04
 * 
 */
public class Palavra {
    
    public String sortear() {
        
        String palavras[] = {"CASTELO", "PEIXE", "MONSTRO", "CACHORRO", "PISCINA",
                             "AMBULANCIA", "DINOSSAURO", "JOGADOR", "TESOURO",
                             "ELEFANTE", "HOSPITAL", "PLANETA", "CANECA",
                             "ORANGOTANGO", "CONFEITEIRO", "RELOGIO", "ESCOVA",
                             "ARMADILHA", "REMEDIO", "CHINELO", "ALFAIATE",
                             "LARANJEIRA", "COTIDIANO", "TELEFONE", "EQUATORIAL",
                             "MOTOCICLETA", "BISSETRIZ", "HORIZONTE", "PENEIRA",
                             "LEOPARDO", "FARINHA", "MONTANHA", "ILUMINADO",
                             "BANHISTA", "BOMBORDO", "JABOTICABA", "RUMINANTE",
                             "CARDUME", "MARINHEIRO", "BANANA", "ROTEIRISTA",
                             "GARRAFA", "VIADUTO"};
               
        Random rnd = new Random(System.currentTimeMillis()); 
            
        return palavras[rnd.nextInt(palavras.length - 1)];
    }
    
}
