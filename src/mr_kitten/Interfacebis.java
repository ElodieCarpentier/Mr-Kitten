/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

/**
 *
 * @author Charles
 */


public class Interfacebis extends javax.swing.JDialog {

    /**
     * Creates new form Interfacebis
     */
    public Interfacebis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Homepage = new javax.swing.JDialog();
        Homepage_pic = new javax.swing.JLabel();
        Welcome_message = new javax.swing.JLabel();
        Button_play = new javax.swing.JButton();
        Exit_window = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Introduction_window = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Pic_tavern = new javax.swing.JLabel();
        Description_room = new javax.swing.JButton();
        Button_right = new javax.swing.JButton();
        Button_up = new javax.swing.JButton();
        Button_left = new javax.swing.JButton();
        Button_down = new javax.swing.JButton();
        Game_shutdown = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        Homepage.setBackground(new java.awt.Color(0, 0, 0));

        Homepage_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/homepage.jpg"))); // NOI18N

        Welcome_message.setText("Welcome to Mr Kitten's game. To begin the adventure, please play \"Play\"");

        Button_play.setText("Play");
        Button_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomepageLayout = new javax.swing.GroupLayout(Homepage.getContentPane());
        Homepage.getContentPane().setLayout(HomepageLayout);
        HomepageLayout.setHorizontalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Welcome_message)
                .addGap(132, 132, 132))
            .addGroup(HomepageLayout.createSequentialGroup()
                .addGroup(HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomepageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Homepage_pic))
                    .addGroup(HomepageLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(Button_play)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomepageLayout.setVerticalGroup(
            HomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Homepage_pic)
                .addGap(18, 18, 18)
                .addComponent(Welcome_message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_play)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Are you sure you want to leave?");

        jLabel2.setText("Your progression will be lost!");

        jButton4.setText("Leave the game");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/warning.gif"))); // NOI18N

        javax.swing.GroupLayout Exit_windowLayout = new javax.swing.GroupLayout(Exit_window.getContentPane());
        Exit_window.getContentPane().setLayout(Exit_windowLayout);
        Exit_windowLayout.setHorizontalGroup(
            Exit_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Exit_windowLayout.createSequentialGroup()
                .addGroup(Exit_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Exit_windowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(Exit_windowLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(Exit_windowLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2))
                    .addGroup(Exit_windowLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Exit_windowLayout.setVerticalGroup(
            Exit_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Exit_windowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("You just woke up, in a strange room. Nothing here looks familiar.");

        jLabel5.setText("\"What...what happened? Where am I?");

        jLabel6.setText("What is this place? Oh my God, I remember now...My family...This strange man...");

        jLabel7.setText("They said he would take me...Why? Is this his place? What is he going to do to me?");

        jLabel8.setText("I cant believe I was torn away from my family...I have to find them!");

        jLabel9.setText("This human is going to pay for what he did to me!\"");

        javax.swing.GroupLayout Introduction_windowLayout = new javax.swing.GroupLayout(Introduction_window.getContentPane());
        Introduction_window.getContentPane().setLayout(Introduction_windowLayout);
        Introduction_windowLayout.setHorizontalGroup(
            Introduction_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Introduction_windowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Introduction_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Introduction_windowLayout.setVerticalGroup(
            Introduction_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Introduction_windowLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mr Kitten");
        setBackground(new java.awt.Color(255, 204, 204));
        setIconImages(null);

        Pic_tavern.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Pic_tavern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/artworkTavern.jpg"))); // NOI18N
        Pic_tavern.setBorder(new javax.swing.border.SoftBevelBorder(0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Pic_tavern, org.jdesktop.beansbinding.ObjectProperty.create(), Pic_tavern, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        Description_room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/eye-watch-icon.png"))); // NOI18N

        Button_right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_right.png"))); // NOI18N

        Button_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_up.png"))); // NOI18N
        Button_up.setMaximumSize(new java.awt.Dimension(81, 57));
        Button_up.setMinimumSize(new java.awt.Dimension(81, 57));
        Button_up.setPreferredSize(new java.awt.Dimension(80, 55));
        Button_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_upActionPerformed(evt);
            }
        });

        Button_left.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_left.png"))); // NOI18N
        Button_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_leftActionPerformed(evt);
            }
        });

        Button_down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/Arrow_down.png"))); // NOI18N

        Game_shutdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr_kitten/shutdown.png"))); // NOI18N
        Game_shutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Game_shutdownActionPerformed(evt);
            }
        });

        jButton1.setText("Items");

        jButton2.setText("Talk");

        jButton3.setText("Fight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 967, Short.MAX_VALUE)
                .addComponent(Game_shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(Pic_tavern))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_left, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Description_room, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(Button_right, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_up, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Button_down, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(328, 328, 328)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Game_shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pic_tavern)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_up, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_left)
                            .addComponent(Button_right))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Description_room)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(Button_down)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(143, 143, 143))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_upActionPerformed

    private void Button_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_leftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_leftActionPerformed

    private void Game_shutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Game_shutdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Game_shutdownActionPerformed

    private void Button_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_playActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interfacebis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfacebis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfacebis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfacebis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfacebis dialog = new Interfacebis(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_down;
    private javax.swing.JButton Button_left;
    private javax.swing.JButton Button_play;
    private javax.swing.JButton Button_right;
    private javax.swing.JButton Button_up;
    private javax.swing.JButton Description_room;
    private javax.swing.JDialog Exit_window;
    private javax.swing.JButton Game_shutdown;
    private javax.swing.JDialog Homepage;
    private javax.swing.JLabel Homepage_pic;
    private javax.swing.JDialog Introduction_window;
    private javax.swing.JLabel Pic_tavern;
    private javax.swing.JLabel Welcome_message;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

