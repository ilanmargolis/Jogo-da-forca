package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-04
 * 
 */
public class TelaPrincipal extends javax.swing.JDialog {
    // CONSTANTES
    final int EDT_LIMPA   = 0;
    final int EDT_MOSTRA  = 1;
    final int EDT_PROCURA = 2;
    
    final int ST_DERROTA = -1;
    final int ST_JOGANDO = 0;
    final int ST_VITORIA = 1;
    
    // VARIÁVEIS
    int contAcertos, contErros;
    
    /**
     * CRIAR novo formulário TelaPrincipal
     */
    public TelaPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
               
        limpaTela();
        
        configuraBotoes();
        
        criaEditsLetras();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlTeclado = new javax.swing.JLayeredPane();
        btnI = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        pnlPalavra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlForca.setVerifyInputWhenFocusTarget(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forca.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(68, 73));
        jLabel1.setMinimumSize(new java.awt.Dimension(68, 73));
        jLabel1.setPreferredSize(new java.awt.Dimension(68, 73));

        javax.swing.GroupLayout pnlForcaLayout = new javax.swing.GroupLayout(pnlForca);
        pnlForca.setLayout(pnlForcaLayout);
        pnlForcaLayout.setHorizontalGroup(
            pnlForcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlForcaLayout.setVerticalGroup(
            pnlForcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlForcaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTeclado.setPreferredSize(new java.awt.Dimension(366, 130));

        btnI.setText("I");

        btnE.setText("E");

        btnL.setText("L");

        btnR.setText("R");

        btnW.setText("W");

        btnO.setText("O");

        btnP.setText("P");

        btnA.setText("A");

        btnS.setText("S");

        btnD.setText("D");

        btnF.setText("F");

        btnG.setText("G");

        btnQ.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        btnQ.setText("Q");

        btnH.setText("H");

        btnJ.setText("J");

        btnK.setText("K");

        btnT.setText("T");

        btnY.setText("Y");

        btnU.setText("U");

        btnZ.setText("Z");

        btnB.setText("B");

        btnN.setText("N");

        btnM.setText("M");

        btnX.setText("X");

        btnC.setText("C");

        btnV.setText("V");

        pnlTeclado.setLayer(btnI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnW, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnQ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnJ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnK, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnY, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnU, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnZ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnV, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlTecladoLayout = new javax.swing.GroupLayout(pnlTeclado);
        pnlTeclado.setLayout(pnlTecladoLayout);
        pnlTecladoLayout.setHorizontalGroup(
            pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecladoLayout.createSequentialGroup()
                .addComponent(btnQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTecladoLayout.createSequentialGroup()
                        .addComponent(btnW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP))
                    .addGroup(pnlTecladoLayout.createSequentialGroup()
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addComponent(btnS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL))
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addComponent(btnX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnM)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTecladoLayout.setVerticalGroup(
            pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnE)
                    .addComponent(btnR)
                    .addComponent(btnT)
                    .addComponent(btnY)
                    .addComponent(btnU)
                    .addComponent(btnI)
                    .addComponent(btnO)
                    .addComponent(btnP)
                    .addComponent(btnW)
                    .addComponent(btnQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL)
                    .addComponent(btnA)
                    .addComponent(btnS)
                    .addComponent(btnD)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH)
                    .addComponent(btnJ)
                    .addComponent(btnK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZ)
                    .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnX)
                        .addComponent(btnC)
                        .addComponent(btnV)
                        .addComponent(btnB)
                        .addComponent(btnN)
                        .addComponent(btnM)))
                .addGap(99, 99, 99))
        );

        pnlPalavra.setEnabled(false);

        javax.swing.GroupLayout pnlPalavraLayout = new javax.swing.GroupLayout(pnlPalavra);
        pnlPalavra.setLayout(pnlPalavraLayout);
        pnlPalavraLayout.setHorizontalGroup(
            pnlPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPalavraLayout.setVerticalGroup(
            pnlPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(pnlPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlForca, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal dialog = new TelaPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(null);
                dialog.setSize(430, 600);
                dialog.setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlForca;
    private javax.swing.JPanel pnlPalavra;
    private javax.swing.JLayeredPane pnlTeclado;
    // End of variables declaration//GEN-END:variables

    
    // FUNÇÕES AUXILIARES        
    private boolean componenteEdit(int op, String letra) {
        boolean flagUsouLetra = false;
        
        for (Component c : pnlPalavra.getComponents()) {
            if (c instanceof JTextField) {
                switch (op) {
                    case EDT_LIMPA:
                        // DESTROI Edits existentes
                        pnlPalavra.remove((JTextField) c);
                        break;
                    case EDT_MOSTRA:
                        // MOSTRA letras que faltavam
                        if (((JTextField) c).getForeground().equals(Color.white)) {
                            
                            ((JTextField) c).setForeground(Color.red);
                            ((JTextField) c).setBackground(Color.yellow);
                            
                        }   break;
                    case EDT_PROCURA:                        
                        if (((JTextField) c).getText().equals(letra)) {
                            if (((JTextField) c).getForeground().equals(Color.white)) {
                            
                                ((JTextField) c).setForeground(Color.black);
                            
                                contAcertos++;  
                                
                                pintaLetraTeclado(letra, Color.green);
                            }

                            flagUsouLetra = true;
                            
                        }   break;
                    default:
                        break;
                }
            }
        }
    
        return flagUsouLetra;
    }

    private void configuraBotoes() {
        // VERIFICA se a letra já foi utilizada
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String letra = e.getActionCommand();
                int status = ST_JOGANDO;
                
                if (pnlPalavra.getComponents().length > 0) {
                    if (!isLetraUsada(letra)) {
                        boolean flagAcertouLetra = false;

                        flagAcertouLetra = componenteEdit(EDT_PROCURA, letra); 

                        if (!flagAcertouLetra) {
                            pintaLetraTeclado(letra, Color.red);
                            
                            contErros++;

                            // carrega a imagem do enforcamento    
                            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().
                                            getResource("/imagens/forca" + contErros + ".png")));
                        }
                    }

                    // VITÓRIA / DERROTA
                    if (contAcertos == pnlPalavra.getComponents().length) { // vitória
                        status = ST_VITORIA;
                    } else if (contErros == 8) { // derrota
                        componenteEdit(EDT_MOSTRA, null); 

                        status = ST_DERROTA;
                    }
                }
                
                if (status != ST_JOGANDO) {
                    /*  if (status == ST_VITORIA) {
                            JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ VENCEU!");
                        } else {
                            JOptionPane.showMessageDialog(null, "VOCÊ PERDEU!");                        
                        }
                    */
                
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?",
                                            "Selecione uma opção", JOptionPane.YES_NO_OPTION);
                    
                    limpaTela();
                    
                    if (opcao == JOptionPane.YES_OPTION) { // joga novamente
                       criaEditsLetras(); 
                    } else { // sai do programa 
                       System.exit(0);
                    }
                }
            }
        };
        
        // ADICIONA ActionListener para todos os botões do teclado
        for (Component c : pnlTeclado.getComponents()) {
            if (c instanceof JButton) {
                ((JButton) c).addActionListener(al);
            }
        }
    }       
    
    private void criaEditsLetras() {
        Palavra palavra = new Palavra();
        String secreta = palavra.sortear();
        
        // CRIA os edits das letras da palavra secreta
        for (int i = 0; i < secreta.length(); i++) {
            String nome = "Letra" + Integer.toString(i);
            JTextField letra = new JTextField(nome);
            letra.setText(secreta.substring(i, i + 1));
            letra.setBounds(35 * i + 5, 5, 35, 40);
            letra.setFont(new Font("dialog", Font.PLAIN, 16));
            letra.setHorizontalAlignment(letra.CENTER);
            letra.setForeground(Color.white); // esconde a letra
            
            pnlPalavra.add(letra);

            letra.setVisible(true);
        }
    }

    private boolean isLetraUsada(String letra) {
        boolean retorno = false;
        
        for (Component b : pnlTeclado.getComponents()) {
            if (b instanceof JButton) {
                if (((JButton) b).getText().equals(letra)) {
                    retorno = !((JButton) b).getBackground().equals(Color.LIGHT_GRAY);
                    
                    break;
                }
            }
        }
        
        return retorno;
    }
 
    private void limpaTela() {
        contAcertos = contErros = 0;
         
        componenteEdit(EDT_LIMPA, null); 
       
        pnlPalavra.repaint();
                   
        pintaLetraTeclado("", Color.LIGHT_GRAY);
    }

    private void pintaLetraTeclado(String letra, Color cor) {
        for (Component b : pnlTeclado.getComponents()) {
            if (b instanceof JButton) {
                if ((letra.equals("")) || (((JButton) b).getText().equals(letra))) {
                   ((JButton) b).setBackground(cor);
                   
                   ((JButton) b).setOpaque(letra.equals(""));
                }
            }
        }
    }
    
}