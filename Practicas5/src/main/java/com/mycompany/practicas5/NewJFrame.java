/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicas5;

import java.awt.Color;
import java.awt.List;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 *
 * @author CiaMb
 */
public class NewJFrame extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger("NewJFrame");

    private static final Color red = new Color(255, 0, 0);

    private static final Color green = new Color(0, 255, 0);

    private static final Color blue = new Color(0, 0, 255);

    private boolean isRedCheked = true;

    private boolean isGreenCheked = true;

    private boolean isBlueCheked = true;
    
    private PictureLocation location = PictureLocation.LEFT_UP;

    private final Map<Point, Color> colors = new HashMap<>();
    
    private final Map<Point, Integer> pointsToDeleteLogo = new HashMap<>();
    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        initializeColors();
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        lienzo1 = new com.mycompany.practicas5.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set colors of the image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setToolTipText("Setting colors");
        jPanel1.setName("Setting colors"); // NOI18N

        jCheckBox1.setText("All the colors");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Red");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Green");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Blue");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jCheckBox4)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Set the position of the logo"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Top right");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Top left");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Under right");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Under left");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton4))
        );

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        System.err.println("Logo posizionato in basso a sinistra");
        location = PictureLocation.LEFT_DOWN;
        setLocation();
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        System.out.println("Opzione rosso cambiata");
        int rosso = evt.getStateChange();
        System.out.println("Stato: " + rosso);
        if (rosso == ItemEvent.SELECTED) {
            System.out.println("Colore rosso selezionato!");
            isRedCheked = true;
            if (isRedCheked && isBlueCheked && isGreenCheked) {
                jCheckBox1.setEnabled(false);
                jCheckBox1.setSelected(true);
            }
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(true);

        }
        if (rosso == ItemEvent.DESELECTED) {
            jCheckBox1.setEnabled(true);
            jCheckBox1.setSelected(false);
            System.out.println("Colore rosso deselezionato");
            if (isGreenCheked || isBlueCheked) {
                isRedCheked = false;
            }
            if (isGreenCheked && !isBlueCheked) {
                jCheckBox3.setEnabled(false);
            } else if (!isGreenCheked && isBlueCheked) {
                jCheckBox4.setEnabled(false);
            }

        }
        setColors();
        setLocation();
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        // TODO add your handling code here:
        System.out.println("Opzione verde cambiata");
        int verde = evt.getStateChange();
        System.out.println("Stato: " + verde);
        if (verde == ItemEvent.SELECTED) {
            System.out.println("Colore verde selezionato!");
            isGreenCheked = true;
            if (isRedCheked && isBlueCheked && isGreenCheked) {
                jCheckBox1.setEnabled(false);
                jCheckBox1.setSelected(true);
            }
            jCheckBox2.setEnabled(true);
            jCheckBox4.setEnabled(true);
        }
        if (verde == ItemEvent.DESELECTED) {
            jCheckBox1.setEnabled(true);
            jCheckBox1.setSelected(false);
            System.out.println("Colore verde deselezionato");
            if (isRedCheked || isBlueCheked) {
                isGreenCheked = false;
            }
            if (isRedCheked && !isBlueCheked) {
                jCheckBox2.setEnabled(false);
            } else if (!isRedCheked && isBlueCheked) {
                jCheckBox4.setEnabled(false);
            }
        }
        setColors();
        setLocation();
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        // TODO add your handling code here:
        System.out.println("Opzione blu cambiata");
        int blue = evt.getStateChange();
        System.out.println("Stato: " + blue);
        if (blue == ItemEvent.SELECTED) {
            System.out.println("Colore blue selezionato!");
            isBlueCheked = true;
            if (isRedCheked && isBlueCheked && isGreenCheked) {
                jCheckBox1.setEnabled(false);
                jCheckBox1.setSelected(true);
            }
            jCheckBox3.setEnabled(true);
            jCheckBox2.setEnabled(true);
        }
        if (blue == ItemEvent.DESELECTED) {
            jCheckBox1.setEnabled(true);
            jCheckBox1.setSelected(false);
            System.out.println("Colore blue deselezionato");
            if (isRedCheked || isGreenCheked) {
                isBlueCheked = false;
            }
            if (isRedCheked && !isGreenCheked) {
                jCheckBox2.setEnabled(false);
            } else if (!isRedCheked && isGreenCheked) {
                jCheckBox3.setEnabled(false);
            }
        }
        setColors();
        setLocation();
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        System.out.println("Opzione tutti i colori cambiata");
        int all = evt.getStateChange();
        System.out.println("Stato: " + all);
        if (all == ItemEvent.SELECTED) {
            System.out.println("Tutti i colori selezionati!");
            isRedCheked = true;
            isGreenCheked = true;
            isBlueCheked = true;
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox2.setEnabled(true);
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(true);
        }
        if (all == ItemEvent.DESELECTED) {
            System.out.println("Tutti i colori deselezionati");
        }
        setColors();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Logo posizionato in alto a destra");
        location = PictureLocation.RIGHT_UP;
        setLocation();
        setLocation();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Logo posizionato in alto a sinistra");
        location = PictureLocation.LEFT_UP;
        setLocation();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        System.out.println("Logo posizionato in basso a destra");
        location = PictureLocation.RIGHT_DOWN;
        setLocation();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private void setColors() {
        BufferedImage image = this.lienzo1.getImage();
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = image.getRGB(i, j);
                Color color = new Color(rgb);
                Color pointColor = colors.get(new Point(i, j));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int alpha = color.getAlpha();
                if (!isRedCheked) {
                    red = 0;
                } else {
                    red = pointColor.getRed();
                }
                if (!isGreenCheked) {
                    green = 0;
                } else {
                    green = pointColor.getRed();
                }
                if (!isBlueCheked) {
                    blue = 0;
                } else {
                    blue = pointColor.getBlue();
                }
                int newRgb = new Color(red, green, blue, alpha).getRGB();
                image.setRGB(i, j, newRgb);
            }
        }
        
      lienzo1.repaint();
      setLocation();
    }
    
    
      private void setLocation() {
        BufferedImage image = this.lienzo1.getImage();
        deleteLogo(image);
        BufferedImage image2 = this.lienzo1.getImage2();
        switch (location) {
            case RIGHT_UP:
                paintRightUp(image, image2);
                break;
            case LEFT_UP:
                paintLeftUp(image, image2);
                break;
            case RIGHT_DOWN:
                paintRightDown(image, image2);
                break;
            case LEFT_DOWN:
                paintLeftDown(image, image2);
                break;
            default:
                break;
        }
        lienzo1.repaint();
     }
    
    private void deleteLogo(BufferedImage image) {
        for (Map.Entry<Point, Integer> entry  : pointsToDeleteLogo.entrySet()) {
            Point key = entry.getKey();
            Integer value = entry.getValue();           
            image.setRGB((int)entry.getKey().getX(), (int)entry.getKey().getY(), value);
        }
        pointsToDeleteLogo.clear();
    }  
      
    private void paintRightUp(BufferedImage image, BufferedImage image2) {
        int height1 = image.getHeight();
        int width1 = image.getWidth();
        int height2 = image2.getHeight();
        int width2 = image2.getWidth();
        for (int i = width1 - width2; i < width1; i++ ) {
            for (int j = 0; j < height2; j++) {
                int rgb = image2.getRGB(i - width1 + width2, j);
                pointsToDeleteLogo.put(new Point(i, j), image.getRGB(i, j));
                image.setRGB(i, j, rgb);
            }
        }
    }
    
    private void paintLeftUp(BufferedImage image, BufferedImage image2) {
        int height2 = image2.getHeight();
        int width2 = image2.getWidth();
        for (int i = 0; i < width2; i++) {
            for (int j = 0; j < height2; j++) {
                int rgb = image2.getRGB(i, j);
                pointsToDeleteLogo.put(new Point(i, j), image.getRGB(i, j));
                image.setRGB(i, j, rgb);
            }
        }
        
    }
    
    private void paintRightDown(BufferedImage image, BufferedImage image2) {
        int height1 = image.getHeight();
        int width1 = image.getWidth();
        int height2 = image2.getHeight();
        int width2 = image2.getWidth();
        for (int i = width1 - width2; i < width1; i++) {
            for (int j = height1 - height2; j < height1; j++) {
                int rgb = image2.getRGB(i - width1 + width2, j - height1 + height2);
                pointsToDeleteLogo.put(new Point(i, j), image.getRGB(i, j));
                image.setRGB(i, j, rgb);
            }
        }
    }
    
    private void paintLeftDown(BufferedImage image, BufferedImage image2) {
        int height1 = image.getHeight();
        int width1 = image.getWidth();
        int height2 = image2.getHeight();
        int width2 = image2.getWidth();
        for (int i = 0; i < width2; i++) {
            for (int j = height1 - height2; j < height1; j++) {
                int rgb = image2.getRGB(i, j - height1 + height2);
                pointsToDeleteLogo.put(new Point(i, j), image.getRGB(i, j));
                image.setRGB(i, j, rgb);
            }
        }
    }

    private void initializeColors() {
        BufferedImage image = lienzo1.getImage();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                int rgb = image.getRGB(i, j);
                Color color = new Color(rgb);
                colors.put(new Point(i, j), color);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private com.mycompany.practicas5.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
enum PictureLocation {
        LEFT_UP,
        RIGHT_UP,
        LEFT_DOWN,
        RIGHT_DOWN
    }

}
