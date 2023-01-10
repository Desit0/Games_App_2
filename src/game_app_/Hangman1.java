package game_app_;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author georgisa
 */
public class Hangman1 extends javax.swing.JFrame {

    /**
     * Creates new form Hangman1
     */
    public Hangman1() {
        initComponents();

        b.setAnswer(b.Random());
        String w = "";
        for (int j = 0; j < b.getLength(); j++) {

            w += "_";
        }
        Word.setText(w);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        letter = new javax.swing.JTextField();
        CheckButton = new javax.swing.JButton();
        Word = new javax.swing.JLabel();
        AgainButton = new javax.swing.JButton();
        HangmanPanel = new javax.swing.JPanel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        GTWPanel = new javax.swing.JPanel();
        GuessTheWord = new javax.swing.JLabel();
        Letters = new javax.swing.JLabel();
        YH10TriesPanel = new javax.swing.JPanel();
        YouHave10Tries = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman");

        GamePanel.setBackground(new java.awt.Color(102, 204, 255));

        letter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterActionPerformed(evt);
            }
        });

        CheckButton.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        CheckButton.setText("CHECK");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        Word.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Word.setText("       ");

        AgainButton.setBackground(new java.awt.Color(255, 51, 51));
        AgainButton.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        AgainButton.setText("Play Again!");
        AgainButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        AgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgainButtonActionPerformed(evt);
            }
        });

        HangmanPanel.setBackground(new java.awt.Color(204, 255, 255));

        Label2.setFont(new java.awt.Font("Tahoma", 0, 220)); // NOI18N
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Label3.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label4.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N
        Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label5.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N

        Label7.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N

        Label6.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N
        Label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label8.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N

        Label9.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N

        Label10.setFont(new java.awt.Font("Tahoma", 0, 92)); // NOI18N

        Label1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HangmanPanelLayout = new javax.swing.GroupLayout(HangmanPanel);
        HangmanPanel.setLayout(HangmanPanelLayout);
        HangmanPanelLayout.setHorizontalGroup(
            HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HangmanPanelLayout.createSequentialGroup()
                .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HangmanPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Label2)
                                .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(HangmanPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(Label9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        HangmanPanelLayout.setVerticalGroup(
            HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HangmanPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HangmanPanelLayout.createSequentialGroup()
                        .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HangmanPanelLayout.createSequentialGroup()
                                .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GTWPanel.setBackground(new java.awt.Color(255, 51, 51));

        GuessTheWord.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        GuessTheWord.setText("Guess the word");
        GuessTheWord.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout GTWPanelLayout = new javax.swing.GroupLayout(GTWPanel);
        GTWPanel.setLayout(GTWPanelLayout);
        GTWPanelLayout.setHorizontalGroup(
            GTWPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GTWPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(GuessTheWord)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        GTWPanelLayout.setVerticalGroup(
            GTWPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GTWPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuessTheWord, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Letters.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Letters.setText("             ");
        Letters.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Letters.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        YH10TriesPanel.setBackground(new java.awt.Color(153, 255, 153));

        YouHave10Tries.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        YouHave10Tries.setText("You have 10 tries");
        YouHave10Tries.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout YH10TriesPanelLayout = new javax.swing.GroupLayout(YH10TriesPanel);
        YH10TriesPanel.setLayout(YH10TriesPanelLayout);
        YH10TriesPanelLayout.setHorizontalGroup(
            YH10TriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YH10TriesPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(YouHave10Tries)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        YH10TriesPanelLayout.setVerticalGroup(
            YH10TriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YH10TriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YouHave10Tries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(AgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(YH10TriesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Letters, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GTWPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addComponent(letter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(CheckButton)
                                .addGap(34, 34, 34))))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Word, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(HangmanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(GTWPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Word, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckButton))
                .addGap(34, 34, 34)
                .addComponent(YH10TriesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Letters, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(AgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HangmanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letterActionPerformed

    hangman b = new hangman();
    int broigreshki = 0;
    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        String w1 = Word.getText(); //zapametqwa wsqka edna promenite ot predishniq put, t e wuwejdame a, te se pokazwat i shte se zapazwat
        
        String w2 = "";
        String k = letter.getText();
        char[] k1 = k.toCharArray(); // k w char ot metoda proverka
        if (b.proverka(k1[0]) == true) {

            for (int i = 0; i < b.getLength(); i++) {
               if(b.getAnswer().charAt(i)==k1[0]){
                   w2+=k1[0];// wseki put pulnim w2 s promenite
               }
               else{
                   w2+=w1.charAt(i);
               }
            }
            Word.setText(w2);
            letter.setText("");
            int n=0;//broi kolko broqch
            for(int i=0; i<b.getLength(); i++){
                if(w2.charAt(i)=='_'){
                    n++;// wseki put kato ima cherta w w2, da q
                }
                
            }
           if(n==0){
               JOptionPane.showMessageDialog(rootPane, "You win! Congratulations!");
           }
        }
        else{
            broigreshki++;
            if(broigreshki==10){
                JOptionPane.showMessageDialog(rootPane, "You lost! Sorry!");
            } else{
                String w3 = Letters.getText();
                w3+=k1[0];
                Letters.setText(w3);
                switch(broigreshki){
                    
                    case 1: Label1.setText("_");
                    break;
                    case 2: Label2.setText("|");
                    break;
                }
                
                letter.setText("");
            }
            
        }

    }//GEN-LAST:event_CheckButtonActionPerformed

    private void AgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgainButtonActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_AgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Hangman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgainButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JPanel GTWPanel;
    private javax.swing.JPanel GamePanel;
    private javax.swing.JLabel GuessTheWord;
    private javax.swing.JPanel HangmanPanel;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JLabel Letters;
    private javax.swing.JLabel Word;
    private javax.swing.JPanel YH10TriesPanel;
    private javax.swing.JLabel YouHave10Tries;
    private javax.swing.JTextField letter;
    // End of variables declaration//GEN-END:variables
}
