/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantallas.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author hecto
 */
public class TableHeader extends DefaultTableCellRenderer{

    public TableHeader() {
        setPreferredSize(new Dimension(0,35));
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.setColor(new Color(115,115,115));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        
    }
    
    
    
}
