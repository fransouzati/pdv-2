/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCaixa;
import model.ModelCaixa;
import model.ModelSessaoUsuario;
import util.DataClasses;

/**
 *
 * @author Lucas
 */
public class ViewFechamento extends javax.swing.JDialog {

    
    
    private ModelCaixa caixa = new ModelCaixa();
    private int status =0;
    
    
    /**
     * Creates new form ViewFechamento
     */
    public ViewFechamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        ControllerCaixa c = new ControllerCaixa();
        this.caixa = c.retornarUltimoCaixa( ViewPrincipal.getTerminal() );
        this.lb_data_abertura.setText(this.caixa.getDataAbertura());
        this.lb_operador.setText(ModelSessaoUsuario.nome);
        
        this.lb_dinheiro.setText( DataClasses.converterFloatParaMoeda(this.caixa.getDinheiro(),true) );
        this.lb_debito.setText(DataClasses.converterFloatParaMoeda(this.caixa.getDebito(),true));
        this.lb_credito.setText(DataClasses.converterFloatParaMoeda(this.caixa.getCartao(),true));
        this.lb_convenio.setText(DataClasses.converterFloatParaMoeda(this.caixa.getConvenio(),true));
        this.lb_cheque.setText(DataClasses.converterFloatParaMoeda(this.caixa.getCheque(),true));
        this.lb_vale.setText(DataClasses.converterFloatParaMoeda(this.caixa.getVale(),true));
        
        this.lb_total.setText(DataClasses.converterFloatParaMoeda(this.caixa.getTotal(),true));
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_data_abertura = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_dinheiro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_debito = new javax.swing.JLabel();
        lb_cheque = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_convenio = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_vale = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lb_credito = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lb_data_atual = new javax.swing.JLabel();
        lb_operador = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fechar caixa do dia:");

        lb_data_abertura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_data_abertura.setText("00/00/0000");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Operador:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Valor em Caixa");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_dinheiro.setBackground(new java.awt.Color(245, 244, 226));
        lb_dinheiro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_dinheiro.setText("R$ 0,00");
        lb_dinheiro.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(245, 244, 226));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Dinheiro");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(231, 240, 244));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Débito");
        jLabel7.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(231, 240, 244));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cheque");
        jLabel11.setOpaque(true);

        lb_debito.setBackground(new java.awt.Color(231, 240, 244));
        lb_debito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_debito.setText("R$ 0,00");
        lb_debito.setOpaque(true);

        lb_cheque.setBackground(new java.awt.Color(231, 240, 244));
        lb_cheque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_cheque.setText("R$ 0,00");
        lb_cheque.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(245, 244, 226));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Convênio");
        jLabel12.setOpaque(true);

        lb_convenio.setBackground(new java.awt.Color(245, 244, 226));
        lb_convenio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_convenio.setText("R$ 0,00");
        lb_convenio.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(231, 240, 244));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Vale");
        jLabel14.setOpaque(true);

        lb_vale.setBackground(new java.awt.Color(231, 240, 244));
        lb_vale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_vale.setText("R$ 0,00");
        lb_vale.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("Total:");

        lb_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(255, 51, 0));
        lb_total.setText("R$ 0,00");

        jLabel18.setBackground(new java.awt.Color(245, 244, 226));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Crédito");
        jLabel18.setOpaque(true);

        lb_credito.setBackground(new java.awt.Color(245, 244, 226));
        lb_credito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_credito.setText("R$ 0,00");
        lb_credito.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_debito)
                            .addComponent(lb_dinheiro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(37, 37, 37)
                        .addComponent(lb_total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_credito)
                            .addComponent(lb_cheque)
                            .addComponent(lb_vale)
                            .addComponent(lb_convenio))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lb_dinheiro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lb_debito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_credito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lb_cheque))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lb_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_vale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lb_total))
                .addContainerGap())
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("Fechar Caixa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lb_data_atual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_data_atual.setText("Data:");

        lb_operador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_operador.setText("Operador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_data_abertura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_data_atual)
                            .addComponent(lb_operador)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(jLabel5))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_data_abertura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_data_atual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_operador))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        caixa.fecharCaixa();
        status = 1;
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public int getStatus(){
        return status;
    }
    
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
            java.util.logging.Logger.getLogger(ViewFechamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFechamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFechamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFechamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFechamento( new javax.swing.JFrame(), true ).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cheque;
    private javax.swing.JLabel lb_convenio;
    private javax.swing.JLabel lb_credito;
    private javax.swing.JLabel lb_data_abertura;
    private javax.swing.JLabel lb_data_atual;
    private javax.swing.JLabel lb_debito;
    private javax.swing.JLabel lb_dinheiro;
    private javax.swing.JLabel lb_operador;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_vale;
    // End of variables declaration//GEN-END:variables
}
