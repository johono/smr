/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Rotinas.Consistencias;
import Rotinas.Parametros;
import Rotinas.Recibo_Prefeitura;
import Rotinas.T_Aluno;
import Rotinas.T_Recibo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathan.alves
 */
public class Recibos extends javax.swing.JFrame {
    T_Aluno alunos = new T_Aluno();
    T_Recibo recibos = new T_Recibo();
    Consistencias consistencias = new Consistencias();
    Parametros parametros = new Parametros();
    Recibo_Prefeitura rec_prefeitura = new Recibo_Prefeitura();
    String rec = "tb_rec_pref";
    String rec2 = "vw_rec_pref";
    boolean date = true;
    
    private void Atualiza_Aluno(){
        this.cb.removeAllItems();
        ResultSet rs5 = this.alunos.Ler_Aluno();
        if(rs5 != null){
            try {
                while(rs5.next()){
                    this.cb.addItem(rs5.getString("nom_aluno")+" - "+rs5.getString("cod_aluno"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Recibos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void Limpa_Tela(){
        this.codigo.setText("");
        this.nome.setText("");
        this.data_atual.setText("");
        this.telefone.setText("");
        this.competencia.setText("");
        this.recibo.setText("");
        this.empresa.setText("");
        this.cidade.setText("");
        this.unidade.setText("");
        this.curso.setText("");
        this.valor1.setText("");
        this.valor2.setText("");
    }
    private String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
    private String cod_aluno(){
      String aluno = (String) this.cb.getSelectedItem();
      int contador = aluno.length();
      String cod = "0";
      
      for(int i = 0; i < contador; i++){
          if(aluno.substring(i, i+1).equals("-")){
              int posicao = i+2;
              cod = aluno.substring(i+2, contador);
          }
      }
      return cod;
    }
    private String data_atual(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    /**
     * Creates new form Recibos
     */
    public Recibos() {
        initComponents();
        Atualiza_Aluno();
        Limpa_Tela();
        this.data_recibo.setText("");
        this.recibo.setText("");
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        recibo = new javax.swing.JTextField();
        competencia = new javax.swing.JTextField();
        empresa = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        unidade = new javax.swing.JTextField();
        curso = new javax.swing.JTextField();
        valor1 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btVoltar = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btEmitir = new javax.swing.JButton();
        data_atual = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        data_recibo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Aluno:");

        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemStateChanged(evt);
            }
        });

        jLabel2.setText("Código do Aluno:");

        jLabel3.setText("Nome do Aluno:");

        jLabel4.setText("Telefone do Aluno:");

        jLabel5.setText("Data do Atual:");

        jLabel6.setText("Número do Recibo:");

        jLabel7.setText("Competência:");

        jLabel8.setText("Empresa:");

        jLabel9.setText("Destino:");

        jLabel10.setText("Unidade:");

        jLabel11.setText("Curso:");

        jLabel12.setText("Valor no cadastro:");

        jLabel13.setText("Outro valor:");

        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        codigo.setEnabled(false);
        codigo.setFocusable(false);

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setEnabled(false);
        nome.setFocusable(false);

        telefone.setBackground(new java.awt.Color(255, 255, 255));
        telefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        telefone.setEnabled(false);
        telefone.setFocusable(false);

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        recibo.setEnabled(false);
        recibo.setFocusable(false);

        competencia.setBackground(new java.awt.Color(255, 255, 255));
        competencia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        competencia.setEnabled(false);
        competencia.setFocusable(false);

        empresa.setBackground(new java.awt.Color(255, 255, 255));
        empresa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        empresa.setEnabled(false);
        empresa.setFocusable(false);

        cidade.setBackground(new java.awt.Color(255, 255, 255));
        cidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cidade.setEnabled(false);
        cidade.setFocusable(false);

        unidade.setBackground(new java.awt.Color(255, 255, 255));
        unidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        unidade.setEnabled(false);
        unidade.setFocusable(false);

        curso.setBackground(new java.awt.Color(255, 255, 255));
        curso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        curso.setEnabled(false);
        curso.setFocusable(false);

        valor1.setBackground(new java.awt.Color(255, 255, 255));
        valor1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        valor1.setEnabled(false);
        valor1.setFocusable(false);

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btImprimir.setText("IMPRIMIR");

        btEmitir.setText("EMITIR");
        btEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmitirActionPerformed(evt);
            }
        });

        data_atual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel14.setText("Data do Recibo:");

        data_recibo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        data_recibo.setEnabled(false);
        data_recibo.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btVoltar)
                .addGap(18, 18, 18)
                .addComponent(btImprimir)
                .addGap(18, 18, 18)
                .addComponent(btEmitir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(valor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(curso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(unidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(cidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(empresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(competencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(recibo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(data_recibo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(data_atual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(data_recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(competencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btImprimir)
                    .addComponent(btEmitir))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmitirActionPerformed
        if(!"".equals(this.codigo.getText())){
            if(this.consistencias.testa_data(this.data_atual.getText())){
                String valor = "";
                if("".equals(this.valor2.getText())){
                    valor = this.valor1.getText();
                } else {
                    valor = this.valor2.getText();
                }
                String compet_mes = this.competencia.getText().substring(0, 2);
                String compet_ano = this.competencia.getText().substring(3, 7);
                String data_rec = this.consistencias.databanco(this.data_atual.getText());
                String cod_aluno = this.codigo.getText();
                
                ResultSet rs = this.recibos.Ler_Rec(rec2, cod_aluno, compet_mes, compet_ano);
            }
        }
    }//GEN-LAST:event_btEmitirActionPerformed

    private void cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemStateChanged

        try {
            String cod_aluno = cod_aluno();
            
            ResultSet rs = this.recibos.Ler_Rec(cod_aluno);
            rs.first();
            this.codigo.setText(cod_aluno);
            this.nome.setText(rs.getString("NOM_ALUNO"));
            this.telefone.setText(this.consistencias.mascaraTel(rs.getString("FONE")));
            this.data_atual.setText(data_atual());
            this.data_recibo.setText("");
            this.recibo.setText("");
            this.competencia.setText(rs.getString("COMP_MES")+"/"+rs.getString("COMP_ANO"));
            this.empresa.setText(rs.getString("RAZAO_EMPRESA"));
            this.cidade.setText(rs.getString("NOME_CIDADE"));
            this.unidade.setText(rs.getString("NOME_UND"));
            this.curso.setText(rs.getString("NOME_CURSO"));
            this.valor1.setText(rs.getString("PRECO"));
            this.valor2.setText("");
            Date fim = rs.getDate("DATA_FIM");
            Date hoje = new Date();
            this.date = hoje.compareTo(fim)<0;
            
            
            ResultSet rs2 = this.recibos.Ler_Rec(this.rec2, this.codigo.getText(), this.competencia.getText().substring(0, 2), this.competencia.getText().substring(3, 7));
            if(rs2.first()){
                this.recibo.setText(rs2.getString("NUM_REC"));
                this.valor1.setText(rs2.getString("VALOR_REC"));
                this.valor2.setText(rs2.getString("VALOR_REC"));
                this.data_recibo.setText(this.consistencias.dataexibe(rs2.getString("DATA_REC")));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Recibos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbItemStateChanged

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
            java.util.logging.Logger.getLogger(Recibos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Recibos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmitir;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField competencia;
    private javax.swing.JTextField curso;
    private javax.swing.JFormattedTextField data_atual;
    private javax.swing.JFormattedTextField data_recibo;
    private javax.swing.JTextField empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField recibo;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField unidade;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables
}