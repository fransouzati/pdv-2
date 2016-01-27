/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Lucas
 */
public class TabelaRenderer extends DefaultTableCellRenderer{

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    String a;
    Object val;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(450);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        
        table.getColumnModel().getColumn(0).setCellRenderer(this);
        table.getColumnModel().getColumn(2).setCellRenderer(this);
        table.getColumnModel().getColumn(4).setCellRenderer(this);
        if(column==2){
            a = String.format("%.2f", value);
            val = "R$"+a;
        }else{
            val = value;
        }
        super.setValue(val);
           
        //Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      
        Color background = new Color(240,240,240);
        Color selecao = new Color(255,204,0);
        
        if (row % 2 == 0) {     
        setBackground(background);
      } else {
       setBackground(null);
      }
        
        if(isSelected){
           setBackground(selecao);
        }
        
        return this;
        
    }
    
    
}