package classes;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-04
 * 
 */
public class Palavra { 
    private int temaSorteado = -1;
    private int tema;

    public String sortear() {
        final String temas[] = {"Abstrato", "Animal", "Comida",
                                "Local", "Mitologia", "Natureza", 
                                "Objeto", "Pessoa", "Veículo"};
        
        String abstrato[] = {"COTIDIANO", "NATUREZA", "INDEPENDENTE",
                             "PERALTA", "ILUMINADO", "EXPLODIR", "NIRVANA",
                             "GAGUEIRA", "FAMINTO", "SEGREDO", "IDEIA",
                             "GASOSO", "DIVERTIMENTO", "VAPORIZADO",
                             "ATMOSFERA", "INFINITO", "FUTURO", "ELETRICIDADE",
                             "DIVERTIDO", "EXTRAVAGANTE", "INDIFERENTE",
                             "ASSOMBRADO", "ESPANTADO", "SUREAL", "PENSAMENTO",
                             "SIMBOLICO"
        };
        String animal[] = {"PEIXE", "CACHORRO", "ELEFANTE", "LEOPARDO",
                           "ORANGOTANGO", "PASSARINHO", "LAGARTIXA", 
                           "TARTARUGA", "MINHOCA", "DINOSSAURO", "CARDUME",
                           "BACALHAU", "MARIPOSA", "RAPOZA", "GIRAFA",
                           "GALINHA", "RINOCERONTE", "AVESTRUZ", "CROCODILO",
                           "BORBOLETA", "SERPENTE", "ESCARAVELHO", "LAGARTIXA",
                           "TATURANA", "JAGUATIRICA", "SARDINHA", "RUMINANTE"
        }; 
        String comida[] = {"JABOTICABA", "BANANA", "FRAMBOESA", "CARAMELO",
                           "FARINHA", "GORGONZOLA", "SOBREMESA", "ESTROGONOFE",
                           "MACARRONADA", "ALMONDEGA", "PESSEGADA", "MORANGOS",
                           "FEIJOADA", "ESPAGUETE", "CANELONE", "EMPADAS",
                           "COXINHA", "GOIABADA", "ACHOCOLATADO", "TOMATE",
                           "BOLINHO", "PASTEL", "BANANADA", "CREMOSO",
                           "CROCANTE", "ALCATRA", "MARMITA", "ESPESSANTE",
                           "ALIMENTO", "ABACAXI", "KIWI", "TOMATEIRO",
                           "JAQUEIRA", "SARAPATEL", "FERMENTO", "CANJICA"
        };
        String local[] = {"CASTELO", "PLANETA", "LANCHONETE", "CASSINO",
                          "CATACUMBA", "SATURNO", "PERNAMBUCO", "HOSPITAL", 
                          "PISCINA", "VIADUTO", "GALINHEIRO", "APARTAMENTO",
                          "BIBLIOTECA", "NECROTERIO", "CINEMA", "GARANHUNS",
                          "ESCRITORIO", "HOTELZINHO", "FACULDADE", "GARAGEM",
                          "AMBULATORIO", "PASTELARIA", "ELEVADOR", "SEPULTURA",
                          "QUARTO", "RESERVATORIO", "GUARITA", "ANTESSALA",
                          "PASSARELA", "SIBERIA"
        };
        String mitologia[] = {"MINOTAURO", "CENTAURO", "MEDUZA", "HERCULES",
                              "CERBERO", "MINERVA", "SATURNO", "VELOCINO",
                              "CUPIDO", "AQUERONTE", "ELECTRA", "NINFAS",
                              "GALATEIA", "ORACULO", "QUIMERA", "HOMERO"
        };
        String natureza[] = {"HORIZONTE", "LARANJEIRA", "TEMPESTADE", "LUMIAR",
                             "EQUATORIAL", "CACHOEIRA", "MACIEIRA", "BORRASCA",
                             "GELEIRA", "MAREMOTO", "TERREMOTO", "URTIGA",
                             "RUPESTRE", "MONTANHA", "ALVORADA", "INUNDAR",
                             "SUBMERGIR", "RAMAGEM", "ARBUSTO", "PLANICIE",
                             "CICLONE", "CHUVISCAR"
        };
        String objeto[] = {"CANETA", "BIJOUTERIA", "TELEVISOR", "RELOGIO",
                           "ESCOVA", "GARRAFA", "BOLOTA", "CARRETILHA",
                           "CARROCEL", "VESTIDO", "PETECA", "BALDE",
                           "TELEFONE", "CHINELO", "PENEIRA", "MACHADO",
                           "ARMADILHA", "CUTELO", "LAMPADA", "BACAMARTE",
                           "CADERNETA", "SANDALHA", "CAMISETA", "ESPINGARDA",
                           "SAPATILHA", "RAQUETE", "VASSOURA", "DICIONARIO",
                           "VITROLA", "ZARABATANA", "MOEDOR", "CINZEIRO"
        };
        String pessoa[] = {"CONFEITEIRO", "MARINHEIRO", "ROTEIRISTA", "BANHISTA",
                           "REFUGIADO", "DEPUTADO", "PROGRAMADOR", "ALFAIATE",
                           "JOGADOR", "ESCRAVO", "PRESIDENTE", "HALTEROFILISTA",
                           "NADADORA", "VENDEDOR", "SURFISTA", "MAQUIADOR",
                           "PAULISTANO", "LOBISOMEM", "NARIGUDO", "MANICURE",
                           "ENTREGADOR", "PIZZAIOLO", "AVIADOR", "FAXINEIRO",
                           "HOMENS", "ADOLESCENTE", "PROFESSORA", "TAXISTA",
                           "SACERDOTE", "INDIVIDUO", "LAVADEIRA", "AFEMINADO",
                           "FEMINISTA", "FRANKENSTEIN"
        };
        String veiculo[] = {"HELICOPTERO", "MOTOCICLETA", "SUBMARINO",
                            "ELEVADOR", "FOGUETE", "FERRARI", "BICICLETA",
                            "PATINETE", "TRANSATLANTICO", "CARRUAGEM", 
                            "AMBULANCIA", "VOLANTE", "MOTORIZADO", "CARBURADOR", 
                            "RADIADOR", "ESTEPE", "PEDALEIRA", "TRAMBULADOR",
                            "AEROPLANO"
        };    
        
        // evita que o mesmo tema seja sorteado consecutivamente
        do {
            tema = SecureRNG.getInt(temas.length);
        } while (tema == temaSorteado);

        this.temaSorteado = tema;
        
        // sorteia a palavra do tema sorteado
        String palavra = "";
        
        switch (tema) {
            case 0: palavra = abstrato[SecureRNG.getInt(abstrato.length)]; break;
            case 1: palavra = animal[SecureRNG.getInt(animal.length)]; break;
            case 2: palavra = comida[SecureRNG.getInt(comida.length)]; break;
            case 3: palavra = local[SecureRNG.getInt(local.length)]; break;
            case 4: palavra = mitologia[SecureRNG.getInt(mitologia.length)]; break;
            case 5: palavra = natureza[SecureRNG.getInt(natureza.length)]; break;
            case 6: palavra = objeto[SecureRNG.getInt(objeto.length)]; break;
            case 7: palavra = pessoa[SecureRNG.getInt(pessoa.length)]; break;
            case 8: palavra = veiculo[SecureRNG.getInt(veiculo.length)]; break;
        }
        
        // retorno a palavra e o tema para depois fazer um split
        return palavra + ';' + temas[tema];
    }   
}
