/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_2020;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author letsy
 */
public class EventoPanel extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
            if(value instanceof JPanel){
            JPanel ev=(JPanel)value;
            return ev;
            }
        
        return super.getTableCellRendererComponent(table, value, 
                isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
   
}
