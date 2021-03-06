/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Utils.AssociadoTPTableModel;
import Utils.AssociadoTPTableModel.DadosAssociado;
import Utils.EmprestimoTableModel;
import VO.Associado;
import VO.Emprestimo;
import VO.ValueObject;
import controller.AssociadoController;
import controller.EmprestimoController;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Luan
 */
public class Principal extends javax.swing.JFrame {
    private final AssociadoController associadoController;
    private final EmprestimoController emprestimoController;
    
    public void atualizarTabelaAssociado() {
        AssociadoTPTableModel tabela = (AssociadoTPTableModel)(tbAss.getModel());
        tabela.clear();
        for(ValueObject vo : associadoController.getListAssociado(txtBAss.getText())){
            Associado selected = (Associado)vo;
            DadosAssociado dado;
            dado = new DadosAssociado(selected.getId(), selected.getNome(), 
                                      emprestimoController.getLivrosEmprestando(selected));
            tabela.addDado(dado);
        }
        tabela.fireTableDataChanged();
    }
    
    public void atualizarTabelaEmprestimo()
    {
        EmprestimoTableModel tabela = (EmprestimoTableModel)(tbEmp.getModel());
        tabela.setDados(emprestimoController.getListEmprestimo(txtBEmp.getText()));
        tabela.fireTableDataChanged();
    }
    
    public void setClean()
    {
        txtBAss.setText("");
        txtBEmp.setText("");
    }
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbEmp.setComponentPopupMenu(pupEmprestimo);
        associadoController = new AssociadoController();
        emprestimoController = new EmprestimoController();
        atualizarTabelaAssociado();
        atualizarTabelaEmprestimo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pupEmprestimo = new javax.swing.JPopupMenu();
        menuDevolucao = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAss = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBAss = new javax.swing.JTextField();
        btnFiltroAss = new javax.swing.JButton();
        txtBEmp = new javax.swing.JTextField();
        btnFiltroEmp = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuAssociados = new javax.swing.JMenuItem();
        menuRevistas = new javax.swing.JMenuItem();
        menuLivros = new javax.swing.JMenuItem();
        menuAutores = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuEmprestimo = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        menuDevolucao.setText("Realizar Devolução");
        menuDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDevolucaoActionPerformed(evt);
            }
        });
        pupEmprestimo.add(menuDevolucao);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbEmp.setModel(new EmprestimoTableModel());
        jScrollPane1.setViewportView(tbEmp);

        jLabel1.setText("Empréstimos esperando devolução:");

        tbAss.setModel(new AssociadoTPTableModel());
        jScrollPane2.setViewportView(tbAss);

        jLabel2.setText("Associados cadastrados:");

        btnFiltroAss.setText("Buscar");
        btnFiltroAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroAssActionPerformed(evt);
            }
        });

        btnFiltroEmp.setText("Buscar");
        btnFiltroEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroEmpActionPerformed(evt);
            }
        });

        menuCadastros.setText("Cadastros");

        menuAssociados.setText("Associados");
        menuAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAssociadosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuAssociados);

        menuRevistas.setText("Revistas");
        menuRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRevistasActionPerformed(evt);
            }
        });
        menuCadastros.add(menuRevistas);

        menuLivros.setText("Livros");
        menuLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuLivros);

        menuAutores.setText("Autores");
        menuAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutoresActionPerformed(evt);
            }
        });
        menuCadastros.add(menuAutores);

        jMenuItem1.setText("Operadores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem1);
        menuCadastros.add(jSeparator1);

        menuEmprestimo.setText("Realizar empréstimo");
        menuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmprestimoActionPerformed(evt);
            }
        });
        menuCadastros.add(menuEmprestimo);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuCadastros.add(menuSair);

        mainMenuBar.add(menuCadastros);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltroEmp))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBAss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltroAss)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltroEmp)
                    .addComponent(txtBAss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltroAss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAssociadosActionPerformed
        new CadAssociados(this, true).setVisible(true);
    }//GEN-LAST:event_menuAssociadosActionPerformed

    private void menuLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrosActionPerformed
        new CadLivros(this, true).setVisible(true);
    }//GEN-LAST:event_menuLivrosActionPerformed

    private void menuAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutoresActionPerformed
        new CadAutores(this, true).setVisible(true);
    }//GEN-LAST:event_menuAutoresActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmprestimoActionPerformed
        new RealizarEmprestimo(this, true).setVisible(true);
    }//GEN-LAST:event_menuEmprestimoActionPerformed

    private void btnFiltroEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroEmpActionPerformed
        atualizarTabelaEmprestimo();
    }//GEN-LAST:event_btnFiltroEmpActionPerformed

    private void btnFiltroAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroAssActionPerformed
        atualizarTabelaAssociado();
    }//GEN-LAST:event_btnFiltroAssActionPerformed

    private void menuDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDevolucaoActionPerformed
        if(tbEmp.getSelectedRowCount() != 0){
            EmprestimoTableModel tb = (EmprestimoTableModel)tbEmp.getModel();
            Emprestimo emp = (Emprestimo)tb.getDados().get(tbEmp.getSelectedRow());
            new RealizarDevolucao(this, true, emp).setVisible(true);
        }
    }//GEN-LAST:event_menuDevolucaoActionPerformed

    private void menuRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRevistasActionPerformed
        new CadRevistas(this, true).setVisible(true);
    }//GEN-LAST:event_menuRevistasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new CadOperadores(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltroAss;
    private javax.swing.JButton btnFiltroEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenuItem menuAssociados;
    private javax.swing.JMenuItem menuAutores;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuDevolucao;
    private javax.swing.JMenuItem menuEmprestimo;
    private javax.swing.JMenuItem menuLivros;
    private javax.swing.JMenuItem menuRevistas;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPopupMenu pupEmprestimo;
    private javax.swing.JTable tbAss;
    private javax.swing.JTable tbEmp;
    private javax.swing.JTextField txtBAss;
    private javax.swing.JTextField txtBEmp;
    // End of variables declaration//GEN-END:variables
}
