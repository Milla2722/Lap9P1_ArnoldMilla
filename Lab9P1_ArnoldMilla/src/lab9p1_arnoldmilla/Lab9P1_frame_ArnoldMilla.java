package lab9p1_arnoldmilla;
import javax.swing.*;
import java.util.*;
public class Lab9P1_frame_ArnoldMilla extends javax.swing.JFrame {
Gusanito x ;
    
    public Lab9P1_frame_ArnoldMilla() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lab 9 - Q4-2023");

        start.setText("Gusanito");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(start)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        String coords = JOptionPane.showInputDialog("Ingrese las dimensiones del tablero en el formato ancho,alto");
        String[] div = coords.split(",");
        String X = div [0];
        String Y = div [1];
        int psos = 1;
        ArrayList<String> IN = new ArrayList();
        
        int hsize = Integer.parseInt(X);
        int vsize = Integer.parseInt(Y);
        
        while (hsize > 10 || hsize < 4 || vsize > 10 || vsize < 4){
            coords = JOptionPane.showInputDialog("Matriz de tamaño no valido, ingrese otros datos formato ancho,alto");
            div = coords.split(",");
            X = div [0];
            Y = div [1];
            
        
            hsize = Integer.parseInt(X);
            vsize = Integer.parseInt(Y);
        }
        x = new Gusanito(hsize,vsize);
        
        char [][] matriz = x.matriz(hsize, vsize);
        String Pmatriz = x.llenar(matriz);
        String instrucciones = JOptionPane.showInputDialog("Mapa\n" +
                    Pmatriz + "\n"
                    + "1.Ingresar una instruccion \n"
                    + "2. Ejecutar instrucciones");
        while (psos == 1){
            
           int inst = Integer.parseInt(instrucciones);
           if (inst == 1){              
               String direccion = JOptionPane.showInputDialog("Mapa\n" +
                    Pmatriz + "\n"
                    +  "Ingrese la instruccion de la forma magnitudDIRECCION (ej. 2UP)");
               IN.add(direccion);
               JOptionPane.showInputDialog("Mapa\n" +
                    Pmatriz + "\n"
                    + "1.Ingresar una instruccion \n"
                    + "2. Ejecutar instrucciones");
               psos = 1;
               x.mostrarPaso(IN, matriz);
            }
            else (inst == 2){
           
            }
            System.out.println(IN);
        }
        
    }//GEN-LAST:event_startActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab9P1_frame_ArnoldMilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
