/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvkubrik;

/**
 *
 * @author marco
 */
public class jfrmAux extends javax.swing.JFrame {

    /**
     * Creates new form jfrmAux
     */
    public jfrmAux() {
        initComponents();
        System.out.println("Tamaños: \n");
        System.out.println("Logo: " + jlblLogo.getWidth()+ ", " + jlblLogo.getHeight());
        System.out.println("Titulo: " + jlblTitulo.getWidth() + ", " + jlblTitulo.getHeight());
        System.out.println("Titulo original: " + jlblIntegrantes.getWidth() + ", " + jlblIntegrantes.getHeight());
        System.out.println("Titulo deseado: " + jlblTimer.getWidth() + ", " + jlblTimer.getHeight());
        System.out.println("Etiqueta de numeros: " + jlblAciertos1.getWidth() + ", " + jlblAciertos1.getHeight());
        System.out.println("\n");
        System.out.println("Coordenadas del logo:" + jlblLogo.getX()+ ", " + jlblLogo.getY());
        System.out.println("Coordenadas del titulo:" + jlblTitulo.getX()+ ", " + jlblTitulo.getY());
        System.out.println("Coordenadas del titulo originina:" + jlblIntegrantes.getX()+ ", " + jlblIntegrantes.getY());
        System.out.println("Coordenadas del titulo deseado:" + jlblTimer.getX()+ ", " + jlblTimer.getY());
        System.out.println("\n");
        System.out.println("Coordenadas");
        System.out.println("1: " + jlblAciertos1.getX()+ ", " + jlblAciertos1.getY());
        System.out.println("2: " + jlblAciertos2.getX() + ", " + jlblAciertos2.getY());
        System.out.println("3: " + jlblAciertos3.getX() + ", " + jlblAciertos3.getY());
        System.out.println("4: " + jlblAciertos4.getX() + ", " + jlblAciertos4.getY());
        System.out.println("5: " + jlblAciertos5.getX() + ", " + jlblAciertos5.getY());
        System.out.println("6: " + jlblAciertos6.getX() + ", " + jlblAciertos6.getY());
        System.out.println("7: " + jlblAciertos7.getX() + ", " + jlblAciertos7.getY());
        System.out.println("8: " + jlblAciertos8.getX() + ", " + jlblAciertos8.getY());
        System.out.println("Coordenadas 2da Matriz");
        System.out.println("9: " + jlblAciertos9.getX() + ", " + jlblAciertos9.getY());
        System.out.println("10: " + jlblAciertos10.getX() + ", " + jlblAciertos10.getY());
        System.out.println("11: " + jlblAciertos11.getX() + ", " + jlblAciertos11.getY());
        System.out.println("12: " + jlblAciertos12.getX() + ", " + jlblAciertos12.getY());
        System.out.println("13: " + jlblAciertos13.getX() + ", " + jlblAciertos13.getY());
        System.out.println("14: " + jlblAciertos14.getX() + ", " + jlblAciertos14.getY());
        System.out.println("15: " + jlblAciertos15.getX() + ", " + jlblAciertos15.getY());
        System.out.println("16: " + jlblAciertos16.getX() + ", " + jlblAciertos16.getY());
        System.out.println("\n");
        System.out.println("Tamaño botón: \n");
        System.out.println("Boton1: " + jButton4.getWidth()+ ", " + jButton4.getHeight());
        System.out.println("Boton2: " + jButton3.getWidth()+ ", " + jButton3.getHeight());
        System.out.println("\n");
        System.out.println("Coordenadas botón: \n");
        System.out.println("btn1: " + jButton4.getX() + ", " + jButton4.getY());
        System.out.println("btn2: " + jButton3.getX() + ", " + jButton3.getY());
        System.out.println("btn3: " + jButton2.getX() + ", " + jButton2.getY());
        System.out.println("btn4: " + jButton1.getX() + ", " + jButton1.getY());
        System.out.println("Tamaño area: \n");
        System.out.println("area: " + jTextArea2.getWidth()+ ", " + jTextArea2.getHeight());
        System.out.println("Coordenadas area: \n");
        System.out.println("area: " + jTextArea2.getX() + ", " + jTextArea2.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblLogo = new javax.swing.JLabel();
        jlblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlblAciertos1 = new javax.swing.JLabel();
        jlblAciertos2 = new javax.swing.JLabel();
        jlblAciertos3 = new javax.swing.JLabel();
        jlblAciertos4 = new javax.swing.JLabel();
        jlblAciertos5 = new javax.swing.JLabel();
        jlblAciertos6 = new javax.swing.JLabel();
        jlblAciertos7 = new javax.swing.JLabel();
        jlblAciertos8 = new javax.swing.JLabel();
        jlblIntegrantes = new javax.swing.JLabel();
        jlblTimer = new javax.swing.JLabel();
        jlblAciertos9 = new javax.swing.JLabel();
        jlblAciertos10 = new javax.swing.JLabel();
        jlblAciertos13 = new javax.swing.JLabel();
        jlblAciertos14 = new javax.swing.JLabel();
        jlblAciertos11 = new javax.swing.JLabel();
        jlblAciertos15 = new javax.swing.JLabel();
        jlblAciertos12 = new javax.swing.JLabel();
        jlblAciertos16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setText("Rectangulo Kubrik.");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dylan Michel Mendoza Hernandez.");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Efrain Mohedano Torres.");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marco Antonio Vega Parra");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reiniciar.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Aleatorio.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Intro. Valores.");

        jlblAciertos1.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos1.setText("jLabel51");

        jlblAciertos2.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos2.setText("jLabel61");

        jlblAciertos3.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos3.setText("jLabel71");

        jlblAciertos4.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos4.setText("jLabel81");

        jlblAciertos5.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos5.setText("jLabel91");

        jlblAciertos6.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos6.setText("jLabel10");

        jlblAciertos7.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos7.setText("jLabel11");

        jlblAciertos8.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos8.setText("jLabel12");

        jlblIntegrantes.setForeground(new java.awt.Color(255, 255, 255));
        jlblIntegrantes.setText("Rectangulo Kubrik Original:");

        jlblTimer.setForeground(new java.awt.Color(255, 255, 255));
        jlblTimer.setText("Rectangulo Kubrik Deseado:");

        jlblAciertos9.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos9.setText("jLabel15");

        jlblAciertos10.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos10.setText("jLabel16");

        jlblAciertos13.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos13.setText("jLabel17");

        jlblAciertos14.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos14.setText("jLabel18");

        jlblAciertos11.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos11.setText("jLabel19");

        jlblAciertos15.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos15.setText("jLabel20");

        jlblAciertos12.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos12.setText("jLabel21");

        jlblAciertos16.setForeground(new java.awt.Color(255, 255, 255));
        jlblAciertos16.setText("jLabel22");

        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblAciertos1)
                            .addComponent(jlblAciertos5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblAciertos2)
                            .addComponent(jlblAciertos6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAciertos7)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAciertos3)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos4)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAciertos9)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos10)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos11)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblAciertos13)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos14)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos15)
                                .addGap(18, 18, 18)
                                .addComponent(jlblAciertos16))
                            .addComponent(jlblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAciertos1)
                            .addComponent(jlblAciertos2)
                            .addComponent(jlblAciertos3)
                            .addComponent(jlblAciertos4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAciertos5)
                            .addComponent(jlblAciertos6)
                            .addComponent(jlblAciertos7)
                            .addComponent(jlblAciertos8))
                        .addGap(56, 56, 56)
                        .addComponent(jlblTimer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAciertos9)
                            .addComponent(jlblAciertos10)
                            .addComponent(jlblAciertos11)
                            .addComponent(jlblAciertos12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAciertos13)
                            .addComponent(jlblAciertos14)
                            .addComponent(jlblAciertos15)
                            .addComponent(jlblAciertos16)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrmAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmAux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jlblAciertos1;
    private javax.swing.JLabel jlblAciertos10;
    private javax.swing.JLabel jlblAciertos11;
    private javax.swing.JLabel jlblAciertos12;
    private javax.swing.JLabel jlblAciertos13;
    private javax.swing.JLabel jlblAciertos14;
    private javax.swing.JLabel jlblAciertos15;
    private javax.swing.JLabel jlblAciertos16;
    private javax.swing.JLabel jlblAciertos2;
    private javax.swing.JLabel jlblAciertos3;
    private javax.swing.JLabel jlblAciertos4;
    private javax.swing.JLabel jlblAciertos5;
    private javax.swing.JLabel jlblAciertos6;
    private javax.swing.JLabel jlblAciertos7;
    private javax.swing.JLabel jlblAciertos8;
    private javax.swing.JLabel jlblAciertos9;
    private javax.swing.JLabel jlblIntegrantes;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblTimer;
    private javax.swing.JLabel jlblTitulo;
    // End of variables declaration//GEN-END:variables
}