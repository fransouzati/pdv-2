/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewTipoProduto.java
 *
 * Created on 18/10/2011, 19:57:22
 */
package view;

import controller.ControllerUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;

/**
 *
 * @author Leandro
 */
public class ViewUsuario extends javax.swing.JFrame {

    public ViewUsuario() {
        initComponents();
        this.carregarUsuarios();
        setLocationRelativeTo(null);
        this.cancelarOperacao();

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
        jTabbedPaneTipoProduto = new javax.swing.JTabbedPane();
        jpCadastro = new javax.swing.JPanel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfConfirmarSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jpConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfCodigo.setEditable(false);
        jtfCodigo.setToolTipText("Código do tipo do produto");
        jtfCodigo.setEnabled(false);
        jpCadastro.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 85, -1));

        jLabel1.setText("Código:");
        jpCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtfNome.setToolTipText("Descrição do tipo do produto");
        jpCadastro.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 350, -1));

        jLabel2.setText("Nome:");
        jpCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jbConfirmarAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbConfirmarAlteracao.setText("Salvar Alteração");
        jbConfirmarAlteracao.setToolTipText("Confirmar alteração no cadastro do tipo do produto");
        jbConfirmarAlteracao.setEnabled(false);
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jpCadastro.add(jbConfirmarAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbCadastrar.setText("Salvar");
        jbCadastrar.setToolTipText("Salvar cadastro do tipo de produto");
        jbCadastrar.setEnabled(false);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jpCadastro.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("Cancelar operação");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jpCadastro.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, -1, -1));

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setToolTipText("Limpar todos os campos");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jpCadastro.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 199, -1, -1));

        jLabel3.setText("Login:");
        jpCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jpCadastro.add(jtfConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 180, -1));

        jLabel4.setText("Senha:");
        jpCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        jpCadastro.add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, -1));

        jLabel5.setText("Confirmar senha:");
        jpCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));
        jpCadastro.add(jtfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, -1));

        jTabbedPaneTipoProduto.addTab("Cadastro", jpCadastro);

        jTableUsuarios.setAutoCreateRowSorter(true);
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Excluir tipo de produto selecionado");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Alterar tipo de produto selecionado");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlterar)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbExcluir))
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)))
                .addContainerGap())
        );

        jTabbedPaneTipoProduto.addTab("Consulta/Alteração/Exclusão", jpConsulta);

        getContentPane().add(jTabbedPaneTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        if (this.jtfNome.getText().equals("")|| this.jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve informar o nome para salvar!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());
        
        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            this.salvarCorFerragem();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        //salvar tipo produto
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTableUsuarios.getSelectedRow();
        String nome = (String) jTableUsuarios.getValueAt(linha, 1);
        int codigo = (int) jTableUsuarios.getValueAt(linha, 0);

        ControllerUsuario controllerUsuario = new ControllerUsuario();
        //pegunta se realmente deseja excluir o tipo de produto
        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja"
                + " excluir o usuário:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerUsuario.excluirUsuarioController(codigo)) {
                JOptionPane.showMessageDialog(null, "Registro excluido com suscesso!");
                this.carregarUsuarios();
                this.novoUsuario();
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.cancelarOperacao();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
                //abilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(true);
        jbConfirmarAlteracao.setEnabled(false);
        novoUsuario();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        if (this.jtfNome.getText().equals("")|| this.jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve informar o nome para salvar!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());
        
        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            this.alterarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        this.habilitarCampos();
        this.recuperarUsuario();
        
        //abilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(false);
        jbConfirmarAlteracao.setEnabled(true);

        //volta a aba anterior
        this.jTabbedPaneTipoProduto.setSelectedIndex(this.jTabbedPaneTipoProduto.getSelectedIndex() - 1);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    /**
     * Salvar
     * @return 
     */
    private boolean salvarCorFerragem() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        //salvar 
        if (controllerUsuario.salvarUsuarioController(modelUsuario) > 0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            this.novoUsuario();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
    /**
     * alterar
     * @return 
     */
    private boolean alterarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setCodigo(Integer.parseInt(this.jtfCodigo.getText()));
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        //alterar
        if (controllerUsuario.atualizarUsuarioController(modelUsuario)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void cancelarOperacao() {
        desabilitarCampos();
    }

    /**
     * carrena na tebla 
     */
    private void carregarUsuarios() {
        ArrayList<ModelUsuario> listaUsuarios = new ArrayList<>();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        listaUsuarios = controllerUsuario.getListaUsuarioController();

        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
        modelo.setNumRows(0);

        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaUsuarios.get(i).getCodigo(),
                listaUsuarios.get(i).getNome(),
                listaUsuarios.get(i).getLogin()
            });
        }
    }
    
    /**
     * Pega os dados
     *
     * @return boolean
     */
    private boolean recuperarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();

        //recebe a linha selecionada
        int linha = this.jTableUsuarios.getSelectedRow();

        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) jTableUsuarios.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelUsuario = controllerUsuario.getUsuarioController(codigo);
            //seta os dados na interface
            this.jtfCodigo.setText(String.valueOf(modelUsuario.getCodigo()));
            this.jtfNome.setText(modelUsuario.getNome());
            this.jtfLogin.setText(modelUsuario.getLogin());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }
    
    protected void desabilitarCampos(){
        jtfNome.setEditable(false);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(false);
        jtfSenha.setEditable(false);
        jtfConfirmarSenha.setEditable(false);
        carregarUsuarios();
    }
    
    private void novoUsuario(){
        habilitarCampos();
        jtfCodigo.setText("Novo");
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfConfirmarSenha.setText("");
    }
    
    private void habilitarCampos(){
        jtfNome.setEditable(true);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(true);
        jtfSenha.setEditable(true);
        jtfConfirmarSenha.setEditable(true);
        carregarUsuarios();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneTipoProduto;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JPasswordField jtfConfirmarSenha;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
