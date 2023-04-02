/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jimit Shukla
 */
public class Table_Model_1 extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;
    
    public Table_Model_1(){}
    
    public Table_Model_1(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }
    
    public Class getColumnClass(int column){
        // 1 is the index of the column image
        if(column == 1){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    return this.rows[rowIndex][columnIndex];
    }
    
    public String getColumnName(int col){
        return this.columns[col];
    }
    
}
