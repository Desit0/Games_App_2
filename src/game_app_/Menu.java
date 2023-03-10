/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game_app_;

/**
 *
 * @author Desi
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        LogoPanel = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        ChessButton = new javax.swing.JButton();
        MemoryButton = new javax.swing.JButton();
        Chess = new javax.swing.JLabel();
        Memory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        MenuPanel.setBackground(new java.awt.Color(204, 0, 204));

        LogoPanel.setBackground(new java.awt.Color(204, 255, 255));

        LabelLogo.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        LabelLogo.setText("Games");

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LabelLogo)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        ChessButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desi\\OneDrive\\Desktop\\Game_App_\\strategy-icon-678.png")); // NOI18N

        MemoryButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desi\\OneDrive\\Desktop\\hangman12.png")); // NOI18N
        MemoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoryButtonActionPerformed(evt);
            }
        });

        Chess.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        Chess.setText("Chess");

        Memory.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        Memory.setText("Hangman");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(ChessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(MemoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Chess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Memory)
                .addGap(153, 153, 153))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chess)
                    .addComponent(Memory))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MemoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoryButtonActionPerformed
        this.dispose();
        new HangmanMenu().setVisible(true);
    }//GEN-LAST:event_MemoryButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chess;
    private javax.swing.JButton ChessButton;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel Memory;
    private javax.swing.JButton MemoryButton;
    private javax.swing.JPanel MenuPanel;
    // End of variables declaration//GEN-END:variables
}
