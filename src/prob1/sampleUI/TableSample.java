package prob1.sampleUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import prob1.privatetable.TablePanel;

public class TableSample extends JFrame {
	private TablePanel p;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JButton button;

	public TableSample() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		getContentPane().add(mainPanel);
		pack();
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		p = new TablePanel();
		topPanel.add(p);
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		button = new JButton("My Button");
		button.addActionListener(new MyButtonListener());
		middlePanel.add(button);
	}

	public void loadData(String[][] data) {
		p.setTableValues(data);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sortable Table");
		centerFrameOnDesktop(this);
		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width-frameWidth)/4), (height-frameHeight)/10);    
	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String[][] rowData = new String[][] {
					{ "Billy", "Smith", "11/11/11", "100000" },
					{ "Richard", "Jones", "10/10/11", "100000" } };
			p.setTableValues(rowData);
			// read data values from TablePanel like this -- not used here
			String[][] data = p.getData();
		}
	}

	private static final long serialVersionUID = 3618976789175941431L;
}
