package classes;

import java.util.Calendar;
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
                             "GARRAFA", "VIADUTO", "MOTORIZADO", "URUCA",
                             "QUIMERA", "SOBREMESA", "LANCHONETE", "CARAMELO",
                             "SEGREDO", "PROGRAMADOR", "FRAMBOESA", "INDEPENDENTE",
                             "GAGUEIRA", "SUPERSONICO", "PERNAMBUCO", "PETECA",
                             "CARROCEL", "ESCRAVO", "NATUREZA", "DEPUTADO",
                             "BIJOUTERIA", "TELEVISOR", "PASSARINHO",
                             "NADADORA", "GALINHEIRO"};
               
        Random rnd = new Random(); 
        
        // quero garantir um semente realmente aleatória evitando mesma sequência inicial
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY); 
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);
        
        rnd.setSeed(hora+min+seg);
            
        return palavras[rnd.nextInt(palavras.length - 1)];
    }   
}
