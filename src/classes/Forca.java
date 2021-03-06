package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Ilan Margolis
 * @date   2020-05-04
 * 
 */
public class Forca extends javax.swing.JDialog {
    // CONSTANTES
    private static final String ARQUIVO_DADOS = "forca.dat";
    
    private static final int EDT_LIMPA   = 0;
    private static final int EDT_MOSTRA  = 1;
    private static final int EDT_PROCURA = 2;
    
    private static final int ST_DERROTA = -1;
    private static final int ST_JOGANDO = 0;
    private static final int ST_VITORIA = 1;
    
    private static final int TELA_INICIO    = 0;
    private static final int TELA_ENFORCADO = 8;
    private static final int TELA_LIVRE     = 9;
    
    protected static final int MAX_ERROS    = 8;
    private static final int MAX_REGRESSIVO = 30;
    private static final int MAX_RODADA     = 3;
    
    public static final int SOM_INICIAR = 0;
    public static final int SOM_ERRO    = 1;
    public static final int SOM_ACERTO  = 2;
    public static final int SOM_DERROTA = 3;
    public static final int SOM_VITORIA = 4;
    public static final int SOM_TICTOC  = 5;
    
    // VARIÁVEIS
    private int contAcertos, contErros;
    private int contRegressivo, contRodada, totalPontos;    
    private Timer tempo;
    
    // OBJETOS
    private final Pontuacao pontosJogo;  
    private final Palavra palavra;
   
    /**
     * CRIAR novo formulário TelaPrincipal
     * @param parent
     * @param modal
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public Forca(java.awt.Frame parent, boolean modal) throws InterruptedException, IOException {
        super(parent, modal);
        this.pontosJogo = new Pontuacao(ARQUIVO_DADOS);
        this.palavra = new Palavra();
        
        this.contRegressivo = 0;
        this.contRodada = 0;
        this.totalPontos = 0;

        initComponents();
               
        configurarJogo();   
                
        pnlScore.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlForca = new javax.swing.JPanel();
        imgForca = new javax.swing.JLabel();
        pnlScore = new javax.swing.JPanel();
        lblRodada = new javax.swing.JLabel();
        lblRodadaCont = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        lblPontosCont = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblTempoCont = new javax.swing.JLabel();
        pnlPalavra = new javax.swing.JPanel();
        lblDica = new javax.swing.JLabel();
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
        btnQ = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        chkSom = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo da Forca - Versão 0.91 - By Ilan Margolis ©2020");
        setResizable(false);

        pnlForca.setRequestFocusEnabled(false);
        pnlForca.setVerifyInputWhenFocusTarget(false);
        pnlForca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgForca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forca0.png"))); // NOI18N
        imgForca.setMaximumSize(new java.awt.Dimension(68, 73));
        imgForca.setMinimumSize(new java.awt.Dimension(68, 73));
        imgForca.setPreferredSize(new java.awt.Dimension(68, 73));
        pnlForca.add(imgForca, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 348, 373));

        pnlScore.setEnabled(false);

        lblRodada.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblRodada.setText("Rodada:");

        lblRodadaCont.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblRodadaCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRodadaCont.setText("0");

        lblPontos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPontos.setText("Pontos:");

        lblPontosCont.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPontosCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPontosCont.setText("0");

        lblTempo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTempo.setText("Tempo:");

        lblTempoCont.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTempoCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTempoCont.setText("30");
        lblTempoCont.setToolTipText("");
        lblTempoCont.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlScoreLayout = new javax.swing.GroupLayout(pnlScore);
        pnlScore.setLayout(pnlScoreLayout);
        pnlScoreLayout.setHorizontalGroup(
            pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlScoreLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlScoreLayout.createSequentialGroup()
                            .addComponent(lblRodada)
                            .addGap(5, 5, 5)
                            .addComponent(lblRodadaCont, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlScoreLayout.createSequentialGroup()
                            .addComponent(lblPontos)
                            .addGap(8, 8, 8)
                            .addComponent(lblPontosCont, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlScoreLayout.createSequentialGroup()
                            .addComponent(lblTempo)
                            .addGap(11, 11, 11)
                            .addComponent(lblTempoCont, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlScoreLayout.setVerticalGroup(
            pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlScoreLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRodada)
                        .addComponent(lblRodadaCont))
                    .addGap(4, 4, 4)
                    .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPontos)
                        .addComponent(lblPontosCont))
                    .addGap(4, 4, 4)
                    .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTempo)
                        .addComponent(lblTempoCont))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlForca.add(pnlScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, 80));

        pnlPalavra.setEnabled(false);
        pnlPalavra.setFocusable(false);
        pnlPalavra.setRequestFocusEnabled(false);

        lblDica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDica.setLabelFor(pnlPalavra);
        lblDica.setText(" ");
        lblDica.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlPalavraLayout = new javax.swing.GroupLayout(pnlPalavra);
        pnlPalavra.setLayout(pnlPalavraLayout);
        pnlPalavraLayout.setHorizontalGroup(
            pnlPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPalavraLayout.createSequentialGroup()
                .addComponent(lblDica, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlPalavraLayout.setVerticalGroup(
            pnlPalavraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPalavraLayout.createSequentialGroup()
                .addComponent(lblDica)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlTeclado.setPreferredSize(new java.awt.Dimension(366, 130));

        btnI.setText("I");
        btnI.setFocusable(false);

        btnE.setText("E");
        btnE.setFocusable(false);

        btnL.setText("L");
        btnL.setFocusable(false);

        btnR.setText("R");
        btnR.setFocusable(false);

        btnW.setText("W");
        btnW.setFocusable(false);

        btnO.setText("O");
        btnO.setFocusable(false);

        btnP.setText("P");
        btnP.setFocusable(false);

        btnA.setText("A");
        btnA.setFocusable(false);

        btnS.setText("S");
        btnS.setFocusable(false);

        btnD.setText("D");
        btnD.setFocusable(false);

        btnF.setText("F");
        btnF.setFocusable(false);

        btnG.setText("G");
        btnG.setFocusable(false);

        btnH.setText("H");
        btnH.setFocusable(false);

        btnJ.setText("J");
        btnJ.setFocusable(false);

        btnK.setText("K");
        btnK.setFocusable(false);

        btnT.setText("T");
        btnT.setFocusable(false);

        btnY.setText("Y");
        btnY.setFocusable(false);

        btnU.setText("U");
        btnU.setFocusable(false);

        btnZ.setText("Z");
        btnZ.setFocusable(false);

        btnB.setText("B");
        btnB.setFocusable(false);

        btnN.setText("N");
        btnN.setFocusable(false);

        btnM.setText("M");
        btnM.setFocusable(false);

        btnX.setText("X");
        btnX.setFocusable(false);

        btnC.setText("C");
        btnC.setFocusable(false);

        btnV.setText("V");
        btnV.setFocusable(false);

        btnQ.setText("Q");
        btnQ.setFocusable(false);

        btnIniciar.setText("INICIAR PARTIDA");

        chkSom.setSelected(true);
        chkSom.setText("som");
        chkSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSomActionPerformed(evt);
            }
        });

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
        pnlTeclado.setLayer(btnQ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(btnIniciar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTeclado.setLayer(chkSom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlTecladoLayout = new javax.swing.GroupLayout(pnlTeclado);
        pnlTeclado.setLayout(pnlTecladoLayout);
        pnlTecladoLayout.setHorizontalGroup(
            pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecladoLayout.createSequentialGroup()
                .addComponent(btnQ)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTecladoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addComponent(btnA)
                                .addGap(6, 6, 6)
                                .addComponent(btnS)
                                .addGap(6, 6, 6)
                                .addComponent(btnD)
                                .addGap(6, 6, 6)
                                .addComponent(btnF)
                                .addGap(6, 6, 6)
                                .addComponent(btnG)
                                .addGap(6, 6, 6)
                                .addComponent(btnH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJ)
                                .addGap(6, 6, 6)
                                .addComponent(btnK)
                                .addGap(6, 6, 6)
                                .addComponent(btnL))
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addComponent(btnW)
                                .addGap(6, 6, 6)
                                .addComponent(btnE)
                                .addGap(6, 6, 6)
                                .addComponent(btnR)
                                .addGap(6, 6, 6)
                                .addComponent(btnT)
                                .addGap(6, 6, 6)
                                .addComponent(btnY)
                                .addGap(6, 6, 6)
                                .addComponent(btnU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnI)
                                .addGap(6, 6, 6)
                                .addComponent(btnO)
                                .addGap(6, 6, 6)
                                .addComponent(btnP)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTecladoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnZ)
                        .addGap(8, 8, 8)
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(chkSom))
                            .addGroup(pnlTecladoLayout.createSequentialGroup()
                                .addComponent(btnX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC)
                                .addGap(6, 6, 6)
                                .addComponent(btnV)
                                .addGap(6, 6, 6)
                                .addComponent(btnB)
                                .addGap(6, 6, 6)
                                .addComponent(btnN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnM)))
                        .addContainerGap())))
        );
        pnlTecladoLayout.setVerticalGroup(
            pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTecladoLayout.createSequentialGroup()
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQ)
                    .addGroup(pnlTecladoLayout.createSequentialGroup()
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnW)
                            .addComponent(btnE)
                            .addComponent(btnR)
                            .addComponent(btnT)
                            .addComponent(btnY)
                            .addComponent(btnU)
                            .addComponent(btnI)
                            .addComponent(btnO)
                            .addComponent(btnP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnA)
                            .addComponent(btnS)
                            .addComponent(btnD)
                            .addComponent(btnF)
                            .addComponent(btnG)
                            .addComponent(btnH)
                            .addComponent(btnJ)
                            .addComponent(btnK)
                            .addComponent(btnL))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnZ)
                        .addComponent(btnX)
                        .addComponent(btnC)
                        .addComponent(btnV)
                        .addComponent(btnB)
                        .addComponent(btnN))
                    .addComponent(btnM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSom))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pnlForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSomActionPerformed
        // quando clicar no chkSom é necessário colocar o foco no teclado
        pnlTeclado.requestFocus();
    }//GEN-LAST:event_chkSomActionPerformed
    
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
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Forca dialog = new Forca(new javax.swing.JFrame(), true);
                
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });

                    dialog.setLocationRelativeTo(null); // centraliza formulário na tela
                    dialog.setSize(440, 600); // fixa o tamanho do formulário
                    dialog.setVisible(true);  // torna o fomulário visível              
                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(Forca.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JButton btnIniciar;
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
    private javax.swing.JCheckBox chkSom;
    private javax.swing.JLabel imgForca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPontosCont;
    private javax.swing.JLabel lblRodada;
    private javax.swing.JLabel lblRodadaCont;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTempoCont;
    private javax.swing.JPanel pnlForca;
    private javax.swing.JPanel pnlPalavra;
    private javax.swing.JPanel pnlScore;
    private javax.swing.JLayeredPane pnlTeclado;
    // End of variables declaration//GEN-END:variables

    
    // FUNÇÕES AUXILIARES         
    private void carregaImagemForca(int tipo) {
        imgForca.setIcon(new javax.swing.ImageIcon(getClass().
                         getResource("/imagens/forca" + tipo + ".png")));
    }
    
    private void configurarJogo() throws InterruptedException { // escutador das teclas alfabéticas
        // VERIFICA se a letra já foi utilizada
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String letra = e.getActionCommand();

                if (btnIniciar.isEnabled()) {
                    if (letra.equals(btnIniciar.getText())) {
                        inicializaJogo();
                    }
                } else {
                    try {
                        jogada(letra);
                    } catch (IOException ex) {
                        Logger.getLogger(Forca.class.getName()).log(Level.SEVERE, null, ex);
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
        
        // jogo o foco no pnlTeclado para funcionar o KeyPressed
        pnlTeclado.requestFocus();
        
        // aguardo alguma tecla ser digitada
        pnlTeclado.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (btnIniciar.isEnabled()) {
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        inicializaJogo();
                    }
                } else {
                    String letra = String.valueOf(e.getKeyChar()).toUpperCase();
                    
                    if (letra.matches("[A-Z]*")) { try {
                        // aceita apenas letras
                        jogada(letra);
                        } catch (IOException ex) {
                            Logger.getLogger(Forca.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });    
    }       
    
    private void criaEditsLetras() { // sorteia a palavra e prepara edits para as letras
        String secreta = palavra.sortear();
        String texto[] = secreta.split(";");
        
        pnlPalavra.repaint(); 
        lblDica.setText(texto[1]);
        
        // CRIA os edits das letras da palavra secreta
        for (int i = 0; i < texto[0].length(); i++) {
            String nome = "Letra" + Integer.toString(i);
            JTextField letra = new JTextField(nome);
            letra.setBounds(29 * i, 15, 29, 34);
            letra.setFocusable(false); // evita que clique e apareça a letra com seleção
            letra.setFont(new Font("dialog", Font.BOLD, 17));
            letra.setForeground(Color.white); // esconde a letra
            letra.setHorizontalAlignment(JTextField.CENTER);
            letra.setText(texto[0].substring(i, i + 1));
            
            pnlPalavra.add(letra);

            letra.setVisible(true);
        }
    }

    private void criaTimer() {
        // criar o temporizador 2020-05-11
        tempo = new Timer();
        tempo.scheduleAtFixedRate(new TimerTask() {
            @Override    
            public void run() {
                if (contRegressivo > 0) {
                    contRegressivo--;

                    lblTempoCont.setText(String.valueOf(contRegressivo));

                    // muda a cor do temporizador e som de tictic
                    if (contRegressivo <= 5) {
                        lblTempoCont.setForeground(Color.red);
                        geraSom(SOM_TICTOC);
                    }

                    try {
                        jogada("");
                    } catch (IOException ex) {
                        Logger.getLogger(Forca.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }, 1000, 1000); // 1000ms = 1s
    }

    private void geraSom(int tipo) {
        if (chkSom.isSelected()) {
            Som efeito = new Som();
            efeito.start(tipo);                    
        }
    }
        
    private void inicializaJogo() { // inicializa a interface do jogo
        // inicializa variáveis
        contAcertos = contErros = 0;
        contRegressivo = MAX_REGRESSIVO;
        
        contRodada++;        
         
        // configura componentes
        pnlScore.setVisible(true);
        btnIniciar.setEnabled(false);
                
        lblRodadaCont.setText(String.valueOf(contRodada) + "/" + String.valueOf(MAX_RODADA));
        
        lblTempoCont.setVisible(true);
        lblTempoCont.setForeground(Color.black);
        lblTempoCont.setText(String.valueOf(contRegressivo));
        
        pnlTeclado.requestFocus();

        // chama métodos específicos
        inicializaTela(false);
        
        criaEditsLetras();
                        
        criaTimer();
        
        geraSom(SOM_INICIAR);        
    }

    private void inicializaTela(boolean flagTotal) { 

        if (flagTotal) { // inicializa a tela pra começar nova partida
            totalPontos = contRodada = 0;

            lblPontosCont.setText(String.valueOf(totalPontos));
            btnIniciar.setText("INICIAR PARTIDA");
            pnlScore.setVisible(false);
            lblDica.setText(" ");
        }
               
        pintaEditLetras(EDT_LIMPA, null);  
        
        pintaLetraTeclado("", Color.LIGHT_GRAY);
        
        carregaImagemForca(TELA_INICIO);
    }

    private boolean isLetraUsada(String letra) { // verifica se a letra já foi teclada
        boolean retorno = false;
        
        if (!letra.equals("")) { // entra apenas se quando for um caracter
            for (Component b : pnlTeclado.getComponents()) {
                if (b instanceof JButton) {
                    if (((JButton) b).getText().equals(letra)) {
                        retorno = !((JButton) b).getBackground().equals(Color.LIGHT_GRAY);

                        break;
                    }
                }
            }
        } else {
            retorno = true; // jogada não vai entrar no processamento de acertos e erros 
        }
        
        return retorno;
    }
 
    private void jogada(String letra) throws IOException {
        int status = ST_JOGANDO;

        if (pnlPalavra.getComponents().length > 0) { // só ativa teclado caso a palavra tenha sido sorteada
            if (!isLetraUsada(letra)) {
                boolean flagAcertouLetra = pintaEditLetras(EDT_PROCURA, letra);

                if (!flagAcertouLetra) {
                    pintaLetraTeclado(letra, Color.red);

                    contErros++;

                    carregaImagemForca(contErros); // carrega a imagem do enforcamento 

                    geraSom(SOM_ERRO);
                } else {
                    geraSom(SOM_ACERTO);
                }
            }

            // VITÓRIA / DERROTA
            if (contAcertos == pnlPalavra.getComponents().length - 1) { // vitória (edits - lblDica)
                if (contErros > 0) { // liberta o boneco se tiver iniciado o enforcamento
                    carregaImagemForca(TELA_LIVRE);  
                }

                status = ST_VITORIA;
                
                geraSom(SOM_VITORIA);
            } else if ((contErros == MAX_ERROS) || (contRegressivo == 0)) { // derrota por erros ou tempo
                if (contRegressivo == 0) {
                    carregaImagemForca(TELA_ENFORCADO);
                }
                
                pintaEditLetras(EDT_MOSTRA, null);  // mostra as letras que faltam na palavra

                status = ST_DERROTA;
                
                geraSom(SOM_DERROTA);       
            }
        }

        // contabiliza os pontos a cada tentativa
        int pontosPartida = pontosJogo.pontos(contAcertos, contErros, contRegressivo);
        
        if (status != ST_JOGANDO) {
            totalPontos += pontosPartida;
            lblPontosCont.setText(String.valueOf(totalPontos));
            
            tempo.cancel();
            
            // verifica se já finalizou o partida
            if (contRodada < MAX_RODADA) {
                btnIniciar.setText("RODADA " + (contRodada + 1));
            } else {
                pontosJogo.verifica(totalPontos);
                
                inicializaTela(true);
            }

            btnIniciar.setEnabled(true);
        } else {
            lblPontosCont.setText(String.valueOf(totalPontos + pontosPartida));
        }
    }

    private boolean pintaEditLetras(int op, String letra) {
        boolean flagUsouLetra = false;
        
        for (Component c : pnlPalavra.getComponents()) {
            if (c instanceof JTextField) {
                switch (op) {
                    case EDT_LIMPA:
                        // DESTROI Edits existentes
                        pnlPalavra.remove((JTextField) c);
                        pnlPalavra.repaint(); 
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

    private void pintaLetraTeclado(String letra, Color cor) { // responsável por pintar as teclas
        for (Component b : pnlTeclado.getComponents()) {
            if (b instanceof JButton) {
                if ((letra.equals("")) || (((JButton) b).getText().equals(letra))) {
                   ((JButton) b).setBackground(cor);
                   
                   ((JButton) b).setOpaque(letra.equals(""));
                }
            }
        }
    }  
    
    private void sleep(int tempo) { // tempo em milisegundos
        try { Thread.sleep (tempo); } catch (InterruptedException ex) {} 
    }
}
