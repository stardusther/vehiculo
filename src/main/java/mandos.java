/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Esther
 * @author Sandra
 */
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;

public class mandos extends javax.swing.JFrame {
    cliente client;
    double revoluciones = 0; //revoluciones iniciales
    boolean esta_acelerando = false;
    /**
     * Creates new form mandos_form
     */
    public mandos(cliente client) {
        initComponents();
        this.client = client;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acelerarButton = new javax.swing.JToggleButton();
        encenderButton = new javax.swing.JToggleButton();
        frenarButton = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        acelerarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acelerarButton.setText("ACELERAR");
        acelerarButton.setEnabled(false);
        acelerarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acelerarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acelerarButtonActionPerformed(evt);
            }
        });

        encenderButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        encenderButton.setForeground(new java.awt.Color(51, 204, 0));
        encenderButton.setText("ENCENDER");
        encenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encenderButtonencenderApagarActionPerformed(evt);
            }
        });

        frenarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        frenarButton.setText("FRENAR");
        frenarButton.setEnabled(false);
        frenarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenarButtonActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 51, 51));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("APAGADO");
        label.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(encenderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acelerarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frenarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encenderButton)
                    .addComponent(acelerarButton)
                    .addComponent(frenarButton))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acelerarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acelerarButtonActionPerformed
        // pulsamos acelerar
        if(encenderButton.isSelected() && !frenarButton.isSelected() && acelerarButton.isSelected()){
            frenarButton.setEnabled(false);
            encenderButton.setEnabled(false);
            acelerarButton.setText("Parar de acelerar");
            acelerarButton.setForeground(Color.red);
            label.setText("ACELERANDO");
            label.setForeground(Color.blue); 
            
            SwingUtilities.invokeLater( // Cómo podemos hacer que no se meta en un bucle infinito? (creando otra hebra??)
            new Runnable() {

              public void run() {
                while(acelerarButton.isSelected()){
                    System.out.print("\n-----------------_"+revoluciones);
                    revoluciones = client.sendRequest(revoluciones, estadoMotor.ACELERANDO);
                }
              }
            });          
                        
        } else if(encenderButton.isSelected() && !frenarButton.isSelected() && !acelerarButton.isSelected()){
            pordefecto();
        }
        
    }//GEN-LAST:event_acelerarButtonActionPerformed

    private void reestablecer(boolean b){
        acelerarButton.setText("Acelerar");
        acelerarButton.setForeground(Color.black);
        acelerarButton.setEnabled(b);
        frenarButton.setText("Frenar");
        frenarButton.setForeground(Color.black);
        frenarButton.setEnabled(b);    
    }
    
    private void pordefecto(){
        reestablecer(true);
        label.setText("ENCENDIDO");
        label.setForeground(Color.green);       
        encenderButton.setForeground(Color.red);
        encenderButton.setEnabled(true);
    }
    
    private void encenderButtonencenderApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encenderButtonencenderApagarActionPerformed
        // TODO add your handling code here:
        
        if (encenderButton.isSelected()){ //pulsamos encender
            client.sendRequest(0, estadoMotor.ENCENDIDO);
            encenderButton.setText("Apagar");
            encenderButton.setForeground(Color.red);
            pordefecto();
        }
        else { //pulsamos apagar
            client.sendRequest(0, estadoMotor.APAGADO);
            encenderButton.setText("Encender");
            encenderButton.setForeground(Color.green);
            label.setText("APAGADO");
            label.setForeground(Color.red);
            reestablecer(false);
        }
                
    }//GEN-LAST:event_encenderButtonencenderApagarActionPerformed

    private void frenarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenarButtonActionPerformed
        //Pulsamos frenar
        if(encenderButton.isSelected() && frenarButton.isSelected() && !acelerarButton.isSelected()){
           
            revoluciones = client.sendRequest(revoluciones, estadoMotor.FRENANDO);
            acelerarButton.setEnabled(false);
            encenderButton.setEnabled(false);
            frenarButton.setText("Parar de frenar");
            frenarButton.setForeground(Color.red);
            label.setText("FRENANDO");
            label.setForeground(Color.blue);
        } else{
            pordefecto();
        }
            
    }//GEN-LAST:event_frenarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton acelerarButton;
    private javax.swing.JToggleButton encenderButton;
    private javax.swing.JToggleButton frenarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
