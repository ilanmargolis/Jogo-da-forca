/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-12
 * 
 */
public class Pontuacao {
    private static ArrayList<String> top10 = new ArrayList<String>();
    private String arquivo = "";

    Pontuacao(String arquivo) throws IOException {
        this.arquivo = arquivo;
        
        this.ler();               
    }
 
    protected void gravar() throws IOException {
        File arq = new File(this.arquivo);
        
        if (arq.exists()) {
            arq.delete();
        }
        
        BufferedWriter gravarArq = new BufferedWriter(new FileWriter(this.arquivo));

        // só gravo até 10 itens do top10
        if (this.top10.size() > 0) {
            for (int i = 0; (i < 10) && (i < this.top10.size()); i++) {
                gravarArq.append(top10.get(i) + "\n");
            }
        }

        gravarArq.close();        
    }
    
    protected void ler() throws IOException {
        if ((new File(this.arquivo).exists())) {
            BufferedReader lerArq = new BufferedReader(new FileReader(this.arquivo));
            String linha = "";
            
            while (true) {
                linha = lerArq.readLine();

                if (linha == null) {
                    break;
                }
                
                this.top10.add(linha);
            }
                        
            lerArq.close(); 
        }
    }    
    
    protected int pontos(int contAcertos, int contErros, int contRegressivo) {
        // verifica erros e acertos
        int pontos = (contAcertos - contErros);
        
        // se não tiver nenhum erro dobro os pontos
        pontos *= (contErros == 0 ? 2 : 1);
        
        // quanto mais rápido, mais pontos desde que não perca a rodada
        pontos += (contErros < Forca.MAX_ERROS ? contRegressivo : 0);
        
        return pontos;
    }
    
    protected void verifica(int pontos) throws IOException {
        // verificar se tem pontos para ficar entre os 10 primeiros
        boolean flagRank = (this.top10.size() == 0);
        for(String i: this.top10) {
            String rank[] = i.split(",");
            
            if (pontos > Integer.parseInt(rank[0])) {
                flagRank = true;
                break;
            }
        }
        
        if (flagRank) {
            // adiciono os pontos e o jogador no ArrayList        
            String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
            
            if (!nome.equals("")) {
                String jogador = String.format("%03d", pontos) + "," + nome;

                this.top10.add(jogador);

                // coloco o ArrayList em ordem decrescente
                Collections.sort(top10);
                Collections.reverse(top10);

                this.gravar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não é top10");
        }
    }    
}
