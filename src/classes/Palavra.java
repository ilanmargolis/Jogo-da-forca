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
        final String temas[] = {"Abstrato", "Animal", "Comida",
                                "Local", "Natureza", "Objeto",
                                "Pessoa"};
        
        String abstrato[] = {"COTIDIANO", "NATUREZA", "INDEPENDENTE",
                             "PERALTA", "ILUMINADO", "EXPLODIR", "MONSTRO",
                             "TESOURO", "GAGUEIRA", "FAMINTO", "SEGREDO",
                             "BISSETRIZ", "MOTORIZADO", "SUPERSONICO",
                             "GASOSO", "DIVERTIMENTO", "VAPORIZADO",
                             "ATMOSFERA", "INFINITO", "FUTURO", "ELETRICIDADE",
                             "DIVERTIDO", "EXTRAVAGANTE", "INDIFERENTE",
                             "ASSOMBRADO", "ESPANTADO"
        };
        String animal[] = {"PEIXE", "CACHORRO", "ELEFANTE", "LEOPARDO",
                           "ORANGOTANGO", "PASSARINHO", "LAGARTIXA", 
                           "TARTARUGA", "MINHOCA", "DINOSSAURO", "CARDUME",
                           "BACALHAU", "MARIPOSA", "RAPOZA", "GIRAFA",
                           "GALINHA", "RINOCERONTE", "AVESTRUZ", "CROCODILO",
                           "BORBOLETA", "SERPENTE", "ESCARAVELHO", "LAGARTIXA"
        }; 
        String comida[] = {"JABOTICABA", "BANANA", "FRAMBOESA", "CARAMELO",
                           "FARINHA", "GORGONZOLA", "SOBREMESA", "ESTROGONOFE",
                           "MACARRONADA", "ALMONDEGA", "PESSEGADA", "MORANGOS",
                           "FEIJOADA", "ESPAGUETE", "CANELONE", "EMPADAS",
                           "COXINHA", "GOIABADA", "ACHOCOLATADO", "TOMATE",
                           "BOLINHO"
        };
        String local[] = {"CASTELO", "PLANETA", "LANCHONETE", "CASSINO",
                          "CATACUMBA", "SATURNO", "PERNAMBUCO", "HOSPITAL", 
                          "PISCINA", "VIADUTO", "GALINHEIRO", "APARTAMENTO",
                          "BIBLIOTECA", "NECROTERIO", "CINEMA", "GARANHUNS",
                          "ESCRITORIO", "HOTELZINHO", "FACULDADE", "GARAGEM",
                          "AMBULATORIO", "PASTELARIA", "ELEVADOR", "SEPULTURA"
        };
        String natureza[] = {"HORIZONTE", "LARANJEIRA", "TEMPESTADE", "LUMIAR",
                             "EQUATORIAL", "CACHOEIRA", "RUMINANTE", "MACIEIRA",
                             "GELEIRA", "MAREMOTO", "TERREMOTO", "URTIGA",
                             "RUPESTRE", "MONTANHA", "ALVORADA", "INUNDAR",
                             "SUBMERGIR", "RAMAGEM"
        };
        String objeto[] = {"CANETA", "BIJOUTERIA", "TELEVISOR", "RELOGIO",
                           "ESCOVA", "GARRAFA", "BOLOTA", "CARRETILHA",
                           "CARROCEL", "VESTIDO", "PETECA", "PATINETE",
                           "TELEFONE", "CHINELO", "PENEIRA", "MOTOCICLETA",
                           "HELICOPTERO", "ARMADILHA", "AMBULANCIA", 
                           "CADERNETA", "SANDALHA", "CAMISETA", "ESPINGARDA",
                           "SAPATILHA", "RAQUETE", "VASSOURA", "DICIONARIO",
                           "VITROLA", "ZARABATANA", "MOEDOR"
        };
        String pessoa[] = {"CONFEITEIRO", "MARINHEIRO", "ROTEIRISTA", "BANHISTA",
                           "REFUGIADO", "DEPUTADO", "PROGRAMADOR", "ALFAIATE",
                           "JOGADOR", "ESCRAVO", "PRESIDENTE", "HALTEROFILISTA",
                           "NADADORA", "VENDEDOR", "SURFISTA", "MAQUIADOR",
                           "PAULISTANO", "LOBISOMEM", "NARIGUDO", "MANICURE",
                           "ENTREGADOR", "PIZZAIOLO", "AVIADOR", "FAXINEIRO"
        };
               
        Random rnd = new Random(); 
        
        // sorteia o tema
        rnd.setSeed(semente());

        int tema = rnd.nextInt(temas.length - 1);
        
        // sorteia a palavra do tema escolhido
        String palavra = "";
        
        switch (tema) {
            case 0: palavra = abstrato[rnd.nextInt(abstrato.length - 1)]; break;
            case 1: palavra = animal[rnd.nextInt(animal.length - 1)]; break;
            case 2: palavra = comida[rnd.nextInt(comida.length - 1)]; break;
            case 3: palavra = local[rnd.nextInt(local.length - 1)]; break;
            case 4: palavra = natureza[rnd.nextInt(natureza.length - 1)]; break;
            case 5: palavra = objeto[rnd.nextInt(objeto.length -1)]; break;
            case 6: palavra = pessoa[rnd.nextInt(pessoa.length -1)]; break;
        }
        
        return palavra + ';' + temas[tema];
    }   
    
    private int semente() {
        // quero garantir um semente realmente aleatória evitando mesma sequência inicial
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY); 
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);

        return hora+min+seg;
    }
}
