/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallas.swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author hecto
 */
public class Table extends JTable {

    public Table() {
    }
    
    public void tableStyle (JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        //panel.setBackground(new Color(60, 60, 60));
        getTableHeader().setDefaultRenderer(new TableHeader());
        setRowHeight(30);
        setShowHorizontalLines(true);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }
    
    /* public Component prepareRender (TableCellRenderer tcr, int i, int j) {
        Component com = super.prepareRenderer(tcr, i, j);
        return com;
    } */
    
}
