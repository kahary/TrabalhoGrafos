package com.damage.frames;

import com.damage.grafos.Grafo;
import com.damage.modeloTabelaGrafos.ModeloTabelaGrafos;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;


public class FramePrincipal extends javax.swing.JFrame {

    /**Declaração das variaveis personalizadas*/
    //Tabela de grafos
    ModeloTabelaGrafos grafos;
    
    
    
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        grafos = new ModeloTabelaGrafos();
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

        jPanel1 = new javax.swing.JPanel();
        labelMatrizIncidência = new javax.swing.JLabel();
        labelMatrizAdjacência = new javax.swing.JLabel();
        labelSimples = new javax.swing.JLabel();
        labelCompleto = new javax.swing.JLabel();
        labelConexo = new javax.swing.JLabel();
        labelPlanar = new javax.swing.JLabel();
        labelInformacaoSimples = new javax.swing.JLabel();
        labelInformacaoCompleto = new javax.swing.JLabel();
        labelInformacaoConexo = new javax.swing.JLabel();
        labelInformacaoPlanar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoMatrizIncidencia = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoMatrizAdjacencia = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        botaoMenuCriarGrafo = new javax.swing.JButton();
        botaoMenuModificarGrafo = new javax.swing.JButton();
        botaoMenuExcluirGrafo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaGrafos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(50, 50));
        setName("framePrincipal"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        labelMatrizIncidência.setText("Matriz Incidência");

        labelMatrizAdjacência.setText("Matriz Adjacência");

        labelSimples.setText("Simples:");

        labelCompleto.setText("Completo:");

        labelConexo.setText("Conexo:");

        labelPlanar.setText("Planar:");

        labelInformacaoSimples.setText("Não");

        labelInformacaoCompleto.setText("Não");

        labelInformacaoConexo.setText("Não");

        labelInformacaoPlanar.setText("Não");

        textoMatrizIncidencia.setEditable(false);
        textoMatrizIncidencia.setColumns(20);
        textoMatrizIncidencia.setRows(5);
        jScrollPane2.setViewportView(textoMatrizIncidencia);

        textoMatrizAdjacencia.setColumns(20);
        textoMatrizAdjacencia.setRows(5);
        jScrollPane3.setViewportView(textoMatrizAdjacencia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMatrizIncidência)
                            .addComponent(labelMatrizAdjacência)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSimples)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInformacaoSimples))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelConexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInformacaoConexo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelPlanar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInformacaoPlanar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInformacaoCompleto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMatrizIncidência)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMatrizAdjacência)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSimples)
                    .addComponent(labelInformacaoSimples))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompleto)
                    .addComponent(labelInformacaoCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConexo)
                    .addComponent(labelInformacaoConexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlanar)
                    .addComponent(labelInformacaoPlanar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        botaoMenuCriarGrafo.setText("Criar Grafo");
        botaoMenuCriarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuCriarGrafoActionPerformed(evt);
            }
        });

        botaoMenuModificarGrafo.setText("Modificar Grafo");

        botaoMenuExcluirGrafo.setText("Excluir Grafo");
        botaoMenuExcluirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuExcluirGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoMenuCriarGrafo)
                    .addComponent(botaoMenuModificarGrafo)
                    .addComponent(botaoMenuExcluirGrafo))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoMenuCriarGrafo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoMenuModificarGrafo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoMenuExcluirGrafo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafos"));

        TabelaGrafos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Nós", "Arestas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaGrafos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelaGrafos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaGrafos.setMinimumSize(new java.awt.Dimension(45, 0));
        this.TabelaGrafos.setModel(this.grafos);
        this.TabelaGrafos.getColumnModel().getColumn(0).setHeaderValue("Nome");
        this.TabelaGrafos.getColumnModel().getColumn(1).setHeaderValue("Nós");
        this.TabelaGrafos.getColumnModel().getColumn(2).setHeaderValue("Arestas");
        TabelaGrafos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaGrafosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaGrafos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaGrafosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaGrafosMouseClicked
      this.textoMatrizIncidencia.setText(this.grafos.getGrafos().get(this.TabelaGrafos.getSelectedRow()).getMatrizIncidenciaString());
    }//GEN-LAST:event_TabelaGrafosMouseClicked

    private void botaoMenuCriarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuCriarGrafoActionPerformed
        FrameCriarGrafo.abrir(grafos);
    }//GEN-LAST:event_botaoMenuCriarGrafoActionPerformed

    private void botaoMenuExcluirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuExcluirGrafoActionPerformed
        if(this.TabelaGrafos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(labelCompleto, "Selecione um grafo para realizar a Exclusão");
            return;
        }
        this.grafos.getGrafos().remove(this.TabelaGrafos.getSelectedRow());
        this.grafos.fireTableDataChanged();
        this.resetarInformacoes();
    }//GEN-LAST:event_botaoMenuExcluirGrafoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());    
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    
    public void resetarInformacoes(){
        this.textoMatrizAdjacencia.setText("");
        this.textoMatrizIncidencia.setText("");
        this.labelInformacaoCompleto.setText("Não");
        this.labelInformacaoConexo.setText("Não");
        this.labelInformacaoSimples.setText("Não");
        this.labelInformacaoPlanar.setText("Não");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaGrafos;
    private javax.swing.JButton botaoMenuCriarGrafo;
    private javax.swing.JButton botaoMenuExcluirGrafo;
    private javax.swing.JButton botaoMenuModificarGrafo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCompleto;
    private javax.swing.JLabel labelConexo;
    private javax.swing.JLabel labelInformacaoCompleto;
    private javax.swing.JLabel labelInformacaoConexo;
    private javax.swing.JLabel labelInformacaoPlanar;
    private javax.swing.JLabel labelInformacaoSimples;
    private javax.swing.JLabel labelMatrizAdjacência;
    private javax.swing.JLabel labelMatrizIncidência;
    private javax.swing.JLabel labelPlanar;
    private javax.swing.JLabel labelSimples;
    private javax.swing.JTextArea textoMatrizAdjacencia;
    private javax.swing.JTextArea textoMatrizIncidencia;
    // End of variables declaration//GEN-END:variables
}
