
import javax.swing.JOptionPane;

public class New_app extends javax.swing.JFrame {

    /**
     * Creates new form New_app
     */
    public New_app() {
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

        jLabel1 = new javax.swing.JLabel();
        weight_text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        height_text = new javax.swing.JTextField();
        kg_or_lbs_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("weight");

        jButton1.setText("calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("height");

        kg_or_lbs_text.setText("kg or lbs ");

        jLabel3.setText("meters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(height_text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weight_text))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kg_or_lbs_text, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(309, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight_text, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(kg_or_lbs_text, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(height_text, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        JOptionPane Jpanel = new JOptionPane();    
        
        double weight = Double.parseDouble(weight_text.getText());
        String kg_or_lbs = kg_or_lbs_text.getText();
        double height_m = Double.parseDouble(height_text.getText());
        
        double bmi = 0;
        
        switch (kg_or_lbs){
            
            case "kg":
                bmi = (weight/(height_m*height_m));
               // String calculate = String.format("%.2f", kg);
        
                Jpanel.showMessageDialog(null, "Your body mass index: " + bmi);
                break;
               
            case "lbs":
                 bmi  = (703 *(weight/ (height_m*height_m)));      //When using English measurements, ounces (oz) and fractions must be changed to decimal values. 
                                                                  //Then, calculate BMI by dividing weight in pounds (lb) by height in inches (in) 
                                                                  //squared and multiplying by a conversion factor of 703.
                
                
                Jpanel.showMessageDialog(null, "Your body mass index: " + bmi);
                break;
                
            default:
                Jpanel.showMessageDialog(null, "Please choose correct weight unit!" );
                  
                
        }
        
         if(bmi < 16){
            Jpanel.showMessageDialog(null, "You are in 'Very severely underweight' Category" );
            

        }else if(bmi >= 16 && bmi < 17){
            Jpanel.showMessageDialog(null, "You are in 'moderate thinness' Category" );
            

        }else if(bmi >= 17 && bmi < 18.5){
            Jpanel.showMessageDialog(null, "You are in 'mild thinness' Category" );

        }else if(bmi >= 18.5 && bmi < 25){
            Jpanel.showMessageDialog(null, "You are in 'normal underweight' Category" );

        }else if(bmi >= 25 && bmi < 30){
            Jpanel.showMessageDialog(null, "You are in 'overweight underweight' Category" );

        }else if(bmi >= 30 && bmi < 35){
            Jpanel.showMessageDialog(null, "You are in 'obese class 1 underweight' Category" );

        }else if(bmi >= 35 && bmi < 40){
            Jpanel.showMessageDialog(null, "You are in 'obese class 2 underweight' Category" );

        }else if(bmi > 40){
            Jpanel.showMessageDialog(null, "You are in 'obese underweight' Category" );

        

    
} 
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(New_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField height_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kg_or_lbs_text;
    private javax.swing.JTextField weight_text;
    // End of variables declaration//GEN-END:variables
}
