package View;

import G1_GuessTheN.View_GuessTheN;
import G2_JokenPo.View_JokenPo;
import java.awt.Color;

/**
 *
 * @author caiop
 */
public class Hub extends javax.swing.JFrame {

    
    public Hub() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_title = new javax.swing.JLabel();
        b_guessTheNumber = new javax.swing.JButton();
        b_JokenPo = new javax.swing.JButton();
        b_brickBreakGame = new javax.swing.JButton();
        b_gameOfLife = new javax.swing.JButton();
        b_pong = new javax.swing.JButton();
        b_theme = new javax.swing.JButton();
        b_options = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Games for Fun");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(321, 466));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        l_title.setFont(new java.awt.Font("Counter-Strike", 0, 36)); // NOI18N
        l_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_title.setText("Game Plataform");

        b_guessTheNumber.setText("Guess the Number");
        b_guessTheNumber.setBorderPainted(false);
        b_guessTheNumber.setFocusPainted(false);
        b_guessTheNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guessTheNumberActionPerformed(evt);
            }
        });

        b_JokenPo.setText("JokenPo");
        b_JokenPo.setBorderPainted(false);
        b_JokenPo.setFocusPainted(false);
        b_JokenPo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_JokenPoActionPerformed(evt);
            }
        });

        b_brickBreakGame.setText("Brick Break Game");
        b_brickBreakGame.setBorderPainted(false);
        b_brickBreakGame.setFocusPainted(false);

        b_gameOfLife.setText("Game of Life");
        b_gameOfLife.setBorderPainted(false);
        b_gameOfLife.setFocusPainted(false);

        b_pong.setText("Pong");
        b_pong.setBorderPainted(false);
        b_pong.setFocusPainted(false);

        b_theme.setText("Theme");
        b_theme.setBorderPainted(false);
        b_theme.setFocusPainted(false);

        b_options.setText("Options");
        b_options.setBorderPainted(false);
        b_options.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_pong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_gameOfLife, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_brickBreakGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_guessTheNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_title, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(b_JokenPo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_options)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_theme)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_guessTheNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_JokenPo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_brickBreakGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_gameOfLife)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_theme)
                    .addComponent(b_options))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_guessTheNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guessTheNumberActionPerformed
       View_GuessTheN newGTN = new View_GuessTheN();
       newGTN.setVisible(true);
       dispose();
    }//GEN-LAST:event_b_guessTheNumberActionPerformed

    private void b_JokenPoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_JokenPoActionPerformed
       View_JokenPo newJokenPo = new View_JokenPo();
       newJokenPo.setVisible(true);
       dispose();
    }//GEN-LAST:event_b_JokenPoActionPerformed

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
            java.util.logging.Logger.getLogger(Hub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_JokenPo;
    private javax.swing.JButton b_brickBreakGame;
    private javax.swing.JButton b_gameOfLife;
    private javax.swing.JButton b_guessTheNumber;
    private javax.swing.JButton b_options;
    private javax.swing.JButton b_pong;
    private javax.swing.JButton b_theme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_title;
    // End of variables declaration//GEN-END:variables
}
