package G1_GuessTheN;

import View.Hub;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;

/**
 *
 * @author caiop
 */
public class View_GuessTheN extends javax.swing.JFrame {

    Controller_GTN cp = new Controller_GTN(); // cp = computer
    
    
    
    public View_GuessTheN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_background = new javax.swing.JPanel();
        l_title = new javax.swing.JLabel();
        jp_cardlayout = new javax.swing.JPanel();
        jp_play = new javax.swing.JPanel();
        b_play = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jp_gtn = new javax.swing.JPanel();
        c_answer = new javax.swing.JTextField();
        b_guess = new javax.swing.JButton();
        label_question = new javax.swing.JLabel();
        b_giveUp = new javax.swing.JButton();
        label_hint = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_attempts = new javax.swing.JLabel();
        jp_win = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b_tryAgain = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label_attemptsW = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jp_background.setBackground(new java.awt.Color(255, 255, 255));

        l_title.setFont(new java.awt.Font("Counter-Strike", 0, 36)); // NOI18N
        l_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_title.setText("Guess the Number");

        jp_cardlayout.setBackground(new java.awt.Color(255, 255, 255));
        jp_cardlayout.setLayout(new java.awt.CardLayout());

        b_play.setText("Play");
        b_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_playActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("You need to guess the number I'm thinking between 0-100");

        javax.swing.GroupLayout jp_playLayout = new javax.swing.GroupLayout(jp_play);
        jp_play.setLayout(jp_playLayout);
        jp_playLayout.setHorizontalGroup(
            jp_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_playLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jp_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_playLayout.createSequentialGroup()
                        .addComponent(b_play, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_playLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jp_playLayout.setVerticalGroup(
            jp_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_playLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_play, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jp_cardlayout.add(jp_play, "card_play");

        b_guess.setText("Guess");
        b_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guessActionPerformed(evt);
            }
        });

        label_question.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_question.setText("Take your guess...");

        b_giveUp.setText("Give Up");
        b_giveUp.setBorderPainted(false);
        b_giveUp.setFocusPainted(false);
        b_giveUp.setFocusable(false);
        b_giveUp.setOpaque(true);
        b_giveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_giveUpActionPerformed(evt);
            }
        });

        label_hint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Attempts:");

        label_attempts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_attempts.setText("0");

        javax.swing.GroupLayout jp_gtnLayout = new javax.swing.GroupLayout(jp_gtn);
        jp_gtn.setLayout(jp_gtnLayout);
        jp_gtnLayout.setHorizontalGroup(
            jp_gtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_gtnLayout.createSequentialGroup()
                .addGroup(jp_gtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_gtnLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(b_giveUp))
                    .addGroup(jp_gtnLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jp_gtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_answer)
                            .addComponent(b_guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_question, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(label_hint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_gtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_attempts, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jp_gtnLayout.setVerticalGroup(
            jp_gtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_gtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_gtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_attempts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(label_question)
                .addGap(18, 18, 18)
                .addComponent(label_hint, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(b_guess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_giveUp)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jp_cardlayout.add(jp_gtn, "card_gtn");

        jLabel3.setFont(new java.awt.Font("Counter-Strike", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("You WIN!!!");

        b_tryAgain.setText("Try again");
        b_tryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tryAgainActionPerformed(evt);
            }
        });

        jLabel4.setText("You made in: ");

        label_attemptsW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_attemptsW.setText("0");

        jLabel5.setText("attempts");

        javax.swing.GroupLayout jp_winLayout = new javax.swing.GroupLayout(jp_win);
        jp_win.setLayout(jp_winLayout);
        jp_winLayout.setHorizontalGroup(
            jp_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_winLayout.createSequentialGroup()
                .addGroup(jp_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_winLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_winLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(b_tryAgain))
                    .addGroup(jp_winLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_attemptsW, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jp_winLayout.setVerticalGroup(
            jp_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_winLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_winLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_attemptsW)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(b_tryAgain)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jp_cardlayout.add(jp_win, "card_win");

        b_menu.setText("Menu");
        b_menu.setFocusPainted(false);
        b_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_backgroundLayout = new javax.swing.GroupLayout(jp_background);
        jp_background.setLayout(jp_backgroundLayout);
        jp_backgroundLayout.setHorizontalGroup(
            jp_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_cardlayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jp_backgroundLayout.createSequentialGroup()
                .addComponent(b_menu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_backgroundLayout.setVerticalGroup(
            jp_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_backgroundLayout.createSequentialGroup()
                .addComponent(b_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_title, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_cardlayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Play command
    private void b_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_playActionPerformed
        CardLayout CL = (CardLayout) jp_cardlayout.getLayout();
        CL.show(jp_cardlayout, "card_gtn");
        
        cp.gerarNumero();
        
        System.out.println("ANSWER_LOG: " + cp.getNumber()); //LOG
    }//GEN-LAST:event_b_playActionPerformed

    //Player answer
    private void b_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guessActionPerformed
     
        
        int answer = Integer.parseInt(c_answer.getText());
        
        cp.checarNumero(answer);
        
        if(cp.isAcerto() == true){
            CardLayout CL = (CardLayout) jp_cardlayout.getLayout();
            CL.show(jp_cardlayout, "card_win");
            label_attemptsW.setText(String.valueOf(cp.getAttempts()));
            
        } else if(cp.isAcerto() == false && cp.isnMaior() == true){ //Verify if answer is lower than number
            label_hint.setText("The Number > " + answer);//Send the hint
        } else if (cp.isAcerto() == false && cp.isnMenor() == true){//Verify if answer is higher than number
            label_hint.setText("The Number < " + answer);//Send the hint
        }
        
        
        label_attempts.setText(String.valueOf(cp.getAttempts()));
        c_answer.setText("");
        
        System.out.println("GUESS_LOG: " + answer); //LOG
        
    }//GEN-LAST:event_b_guessActionPerformed

    //Give up Command
    private void b_giveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_giveUpActionPerformed
      CardLayout CL = (CardLayout) jp_cardlayout.getLayout();
      CL.show(jp_cardlayout, "card_play");
      
      label_attempts.setText("0");
      label_hint.setText("");
      c_answer.setText("");
    }//GEN-LAST:event_b_giveUpActionPerformed

    private void b_tryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tryAgainActionPerformed
      label_attempts.setText("0");
      label_attemptsW.setText("0");
      label_hint.setText("");
      
      
      CardLayout CL = (CardLayout) jp_cardlayout.getLayout();
      CL.show(jp_cardlayout, "card_play");
      
    }//GEN-LAST:event_b_tryAgainActionPerformed

    private void b_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menuActionPerformed
        
        Hub hub = new Hub();
        hub.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_menuActionPerformed

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
            java.util.logging.Logger.getLogger(View_GuessTheN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_GuessTheN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_GuessTheN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_GuessTheN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_GuessTheN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_giveUp;
    private javax.swing.JButton b_guess;
    private javax.swing.JButton b_menu;
    private javax.swing.JButton b_play;
    private javax.swing.JButton b_tryAgain;
    private javax.swing.JTextField c_answer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jp_background;
    private javax.swing.JPanel jp_cardlayout;
    private javax.swing.JPanel jp_gtn;
    private javax.swing.JPanel jp_play;
    private javax.swing.JPanel jp_win;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel label_attempts;
    private javax.swing.JLabel label_attemptsW;
    private javax.swing.JLabel label_hint;
    private javax.swing.JLabel label_question;
    // End of variables declaration//GEN-END:variables
}
