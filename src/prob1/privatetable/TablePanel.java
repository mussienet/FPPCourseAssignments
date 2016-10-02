package prob1.privatetable;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel {
	DefaultTableModel model = new DefaultTableModel();
	Object columnNames[] = { "First Name", "Last Name", "Hire Date", "Salary" };
 	public TablePanel() {
	    setTableValues(null);
	    JTable table = new JTable(model);
	    JScrollPane scrollPane = new JScrollPane(table);
	    add(scrollPane, BorderLayout.CENTER);
	}
	public void setTableValues(Object[][] data) {
		model.setDataVector(data, columnNames);
	}
	public String[][] getData() {
		Vector<Vector<String>> v = model.getDataVector();
		String[][] ret = new String[v.size()][4];
		for(int i = 0; i < v.size(); ++i) {
			for(int j = 0; j< 4; ++j) {
				ret[i][j] = v.get(i).get(j);
			}
		}
		return ret;
	}
	private static final long serialVersionUID = 1L;
	
}




 


