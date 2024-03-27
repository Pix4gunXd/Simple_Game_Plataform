package G2_JokenPo;

import View.Hub;
import java.awt.CardLayout;

/**
 *
 * @author caiop
 */
public class View_JokenPo extends javax.swing.JFrame {

    Controller_JokenPo cp = new Controller_JokenPo();
    
    
    public View_JokenPo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        JP_background = new javax.swing.JPanel();
        jp_cardLayout = new javax.swing.JPanel();
        JP_start = new javax.swing.JPanel();
        b_start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JP_game = new javax.swing.JPanel();
        b_rock = new javax.swing.JButton();
        b_paper = new javax.swing.JButton();
        b_scissors = new javax.swing.JButton();
        b_giveUp = new javax.swing.JButton();
        JP_end = new javax.swing.JPanel();
        label_result = new javax.swing.JLabel();
        b_tryAgain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b_menu = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JP_background.setBackground(new java.awt.Color(255, 255, 255));

        jp_cardLayout.setLayout(new java.awt.CardLayout());

        b_start.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b_start.setText("Start");
        b_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_startActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jo....Ken.....Po");

        javax.swing.GroupLayout JP_startLayout = new javax.swing.GroupLayout(JP_start);
        JP_start.setLayout(JP_startLayout);
        JP_startLayout.setHorizontalGroup(
            JP_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_startLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(JP_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_start, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        JP_startLayout.setVerticalGroup(
            JP_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_startLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jp_cardLayout.add(JP_start, "card_start");

        b_rock.setText("Rock");
        b_rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rockActionPerformed(evt);
            }
        });

        b_paper.setText("Paper");
        b_paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_paperActionPerformed(evt);
            }
        });

        b_scissors.setText("Scissors");
        b_scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_scissorsActionPerformed(evt);
            }
        });

        b_giveUp.setText("Give Up");
        b_giveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_giveUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_gameLayout = new javax.swing.GroupLayout(JP_game);
        JP_game.setLayout(JP_gameLayout);
        JP_gameLayout.setHorizontalGroup(
            JP_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_gameLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(b_rock, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(JP_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_giveUp, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(b_paper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(b_scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        JP_gameLayout.setVerticalGroup(
            JP_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_gameLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(JP_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_rock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_paper, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(b_giveUp)
                .addGap(46, 46, 46))
        );

        jp_cardLayout.add(JP_game, "card_game");

        label_result.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_result.setText("RESULTADO");

        b_tryAgain.setText("Try Again");
        b_tryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tryAgainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_endLayout = new javax.swing.GroupLayout(JP_end);
        JP_end.setLayout(JP_endLayout);
        JP_endLayout.setHorizontalGroup(
            JP_endLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_endLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(JP_endLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_tryAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_result, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        JP_endLayout.setVerticalGroup(
            JP_endLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_endLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(b_tryAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jp_cardLayout.add(JP_end, "card_end");

        jLabel1.setFont(new java.awt.Font("Counter-Strike", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JokenPO");

        b_menu.setText("Menu");
        b_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_backgroundLayout = new javax.swing.GroupLayout(JP_background);
        JP_background.setLayout(JP_backgroundLayout);
        JP_backgroundLayout.setHorizontalGroup(
            JP_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_cardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JP_backgroundLayout.createSequentialGroup()
                        .addComponent(b_menu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_backgroundLayout.setVerticalGroup(
            JP_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jp_cardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menuActionPerformed
       Hub hub = new Hub(); 
       hub.setVisible(true);
       dispose();
    }//GEN-LAST:event_b_menuActionPerformed

    private void b_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_startActionPerformed
        CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
        CL.show(jp_cardLayout, "card_game");
        
        cp.gameStart();
    }//GEN-LAST:event_b_startActionPerformed

    private void b_giveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_giveUpActionPerformed
        CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
        CL.show(jp_cardLayout, "card_start");
        
    }//GEN-LAST:event_b_giveUpActionPerformed

    private void b_rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rockActionPerformed
        CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
        
        cp.win(0);
        
        if(cp.isWin() == true){
            //Ir para CL de vitoria
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Win!!!");
           
            System.out.println("LOG_RESULTADO: Vitoria");
            
        }else if(cp.isWin() == false && cp.isDraw() == false){
            //Ir para CL de derrota
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Lose...");
            
            System.out.println("LOG_RESULTADO: Derrota");
            
        }else if(cp.isDraw() == true){
            //Ir para CL de empate
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("Draw!");
            
            System.out.println("LOG_RESULTADO: Empate");
        }
        
        
    }//GEN-LAST:event_b_rockActionPerformed

    private void b_paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_paperActionPerformed
        CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
        
        cp.win(1);
        
        if(cp.isWin() == true){
            //Ir para CL de vitoria
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Win!!!");
           
            System.out.println("LOG_RESULTADO: Vitoria");
            
        }else if(cp.isWin() == false && cp.isDraw() == false){
            //Ir para CL de derrota
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Lose...");
            
            System.out.println("LOG_RESULTADO: Derrota");
            
        }else if(cp.isDraw() == true){
            //Ir para CL de empate
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("Draw!");
            
            System.out.println("LOG_RESULTADO: Empate");
        }
        
        
    }//GEN-LAST:event_b_paperActionPerformed

    private void b_scissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_scissorsActionPerformed
        CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
        
        cp.win(2);
        
        if(cp.isWin() == true){
            //Ir para CL de vitoria
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Win!!!");
           
            System.out.println("LOG_RESULTADO: Vitoria");
            
        }else if(cp.isWin() == false && cp.isDraw() == false){
            //Ir para CL de derrota
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("You Lose...");
            
            System.out.println("LOG_RESULTADO: Derrota");
            
        }else if(cp.isDraw() == true){
            //Ir para CL de empate
            CL.show(jp_cardLayout, "card_end");
            label_result.setText("Draw!");
            
            System.out.println("LOG_RESULTADO: Empate");
        }
        
        
    }//GEN-LAST:event_b_scissorsActionPerformed

    private void b_tryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tryAgainActionPerformed
       CardLayout CL = (CardLayout) jp_cardLayout.getLayout();
       CL.show(jp_cardLayout, "card_start");
       
       
    }//GEN-LAST:event_b_tryAgainActionPerformed

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
            java.util.logging.Logger.getLogger(View_JokenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_JokenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_JokenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_JokenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_JokenPo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_background;
    private javax.swing.JPanel JP_end;
    private javax.swing.JPanel JP_game;
    private javax.swing.JPanel JP_start;
    private javax.swing.JButton b_giveUp;
    private javax.swing.JButton b_menu;
    private javax.swing.JButton b_paper;
    private javax.swing.JButton b_rock;
    private javax.swing.JButton b_scissors;
    private javax.swing.JButton b_start;
    private javax.swing.JButton b_tryAgain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel jp_cardLayout;
    private javax.swing.JLabel label_result;
    // End of variables declaration//GEN-END:variables
}
