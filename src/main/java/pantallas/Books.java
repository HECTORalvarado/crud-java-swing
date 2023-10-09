/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

import com.mycompany.biblioteca.DAOBooksImplements;
import interfaces.DAOBooks;
import javax.swing.table.DefaultTableModel;
import pantallas.swing.cellOption;

/**
 *
 * @author hecto
 */
public class Books extends javax.swing.JPanel {

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        lblTitleBooks.putClientProperty("FlatLaf.styleClass", "h1");
        table1.tableStyle(tablejScrollPane);
        LoadBooks();
    }
    
    private void LoadBooks () {
        cellOption btn = new cellOption();
        try {
            DAOBooks dao = new DAOBooksImplements();
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            dao.getBooks().forEach((l) -> model.addRow(new Object[]{l.getTitulo(), l.getAutor(), l.getEditorial(), l.getEdicion(), l.getDescripcion(), l.getCategoria(), l.getCantidad(), btn}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitleBooks = new javax.swing.JLabel();
        tablejScrollPane = new javax.swing.JScrollPane();
        table1 = new pantallas.swing.Table();

        setMinimumSize(new java.awt.Dimension(910, 560));
        setName(""); // NOI18N
        setPreferredSize(null);

        bg.setMinimumSize(new java.awt.Dimension(910, 560));

        lblTitleBooks.setText("Libros Disponibles");

        tablejScrollPane.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Editorial", "Edicion", "Descripcion", "Categoria", "Cantidad", "Opcion"
            }
        ));
        tablejScrollPane.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(6).setPreferredWidth(3);
            table1.getColumnModel().getColumn(7).setResizable(false);
            table1.getColumnModel().getColumn(7).setPreferredWidth(7);
        }

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(lblTitleBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(310, 310, 310))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablejScrollPane)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitleBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(tablejScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel lblTitleBooks;
    private pantallas.swing.Table table1;
    private javax.swing.JScrollPane tablejScrollPane;
    // End of variables declaration//GEN-END:variables
}
