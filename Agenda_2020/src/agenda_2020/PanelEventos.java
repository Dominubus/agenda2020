/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_2020;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author letsy
 */
public class PanelEventos extends DefaultTableCellRenderer{
    public ArrayList<JPanel> e;
    public PanelEventos (ArrayList a){
    e=a;
    }
    @Override
     public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
            if(value instanceof Eventos){
            Eventos ev=(Eventos)value;
            return ev;
            }
        
        return super.getTableCellRendererComponent(table, value, 
                isSelected, hasFocus, row, column); 
    
 }
     public void addevento(){
     
     }
     
}
