import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class konversiSuhu extends javax.swing.JFrame {

    private JComboBox<String> pilihanKonversi;
    private JButton tombolKonversi;
    private JLabel hasilLabel;
    
    public konversiSuhu() {
        initComponents();
        setTitle("Aplikasi Konversi Suhu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                inputSuhu.setText(""); 
                jLabel3.setText(""); 
            }
        });

        inputSuhu.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume(); 
                }
            }
        });
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelHasil = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputSuhu = new javax.swing.JTextField();
        comboBoxKonversi = new javax.swing.JComboBox<>();
        konversiSuhu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        exit = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHasil.setBackground(new java.awt.Color(102, 51, 0));
        labelHasil.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 26, 15, 0);
        labelHasil.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Masukkan suhu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(218, 199, 0, 0);
        labelHasil.add(jLabel2, gridBagConstraints);

        inputSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSuhuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(220, 24, 0, 0);
        labelHasil.add(inputSuhu, gridBagConstraints);

        comboBoxKonversi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius ke Fahrenheit", "Celcius ke Reamur", "Celcius ke Kelvin", "Fahrenheit ke Celcius", "Fahrenheit ke Reamur", "Fahrenheit ke Kelvin", "Reamur ke Celcius", "Reamur ke Fahrenheit", "Reamur ke Kelvin", "Kelvin ke Celcius", "Kelvin ke Fahrenheit", "Kelvin ke Reamur" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(220, 7, 0, 0);
        labelHasil.add(comboBoxKonversi, gridBagConstraints);

        konversiSuhu.setText("Konversi");
        konversiSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiSuhuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 88, 291, 0);
        labelHasil.add(konversiSuhu, gridBagConstraints);

        jButton2.setText("Hapus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 18, 291, 0);
        labelHasil.add(jButton2, gridBagConstraints);

        exit.setText("Keluar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 291, 267);
        labelHasil.add(exit, gridBagConstraints);

        getContentPane().add(labelHasil, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Program Konversi Suhu");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSuhuActionPerformed

    private void konversiSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiSuhuActionPerformed
     try {
            double suhu = Double.parseDouble(inputSuhu.getText());
            String jenisKonversi = (String) comboBoxKonversi.getSelectedItem();
            double hasil = 0;

            switch (jenisKonversi) {
                case "Celcius ke Fahrenheit":
                    hasil = (suhu * 9/5) + 32;
                    break;
                case "Celcius ke Reamur":
                    hasil = suhu * 4/5;
                    break;
                case "Celcius ke Kelvin":
                    hasil = suhu + 273.15;
                    break;
                case "Fahrenheit ke Celcius":
                    hasil = (suhu - 32) * 5/9;
                    break;
                case "Fahrenheit ke Reamur":
                    hasil = (suhu - 32) * 4/9;
                    break;
                case "Fahrenheit ke Kelvin":
                    hasil = (suhu - 32) * 5/9 + 273.15;
                    break;
                case "Reamur ke Celcius":
                    hasil = suhu * 5/4;
                    break;
                case "Reamur ke Fahrenheit":
                    hasil = (suhu * 9/4) + 32;
                    break;
                case "Reamur ke Kelvin":
                    hasil = suhu * 5/4 + 273.15;
                    break;
                case "Kelvin ke Celcius":
                    hasil = suhu - 273.15;
                    break;
                case "Kelvin ke Fahrenheit":
                    hasil = (suhu - 273.15) * 9/5 + 32;
                    break;
                case "Kelvin ke Reamur":
                    hasil = (suhu - 273.15) * 4/5;
                    break;
                default:
                    jLabel3.setText("Jenis konversi tidak valid!");
                    return;
            }
            jLabel3.setText("Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            jLabel3.setText("Input tidak valid!");
        }
     
     exit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.exit(0); // Menutup aplikasi
    }
});

     
    }//GEN-LAST:event_konversiSuhuActionPerformed

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
            java.util.logging.Logger.getLogger(konversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxKonversi;
    private javax.swing.JToggleButton exit;
    private javax.swing.JTextField inputSuhu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton konversiSuhu;
    private javax.swing.JPanel labelHasil;
    // End of variables declaration//GEN-END:variables
}
