import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main extends JFrame {

	private JLabel label;
	private JList<String> list;

	private static final long serialVersionUID = 1L;

	// Parameter variables
	// All values temporarily stored as string
	private String shirtSize = "";
	private String shirtColor = "";
	private String hasPrint = "";
	private String print = ""; // needs children
	private String printSpec = "";
	private String printColor = "";

	private int SHIRT_SIZE = 0;
	private int SHIRT_COLOR = 1;
	private int HAS_PRINT = 2;
	private int PRINT_SPEC = 3;
	private int PRINT_COLOR = 4;

	private JComboBox<String> sizeBox;
	private JComboBox<String> baseColorBox;
	private JComboBox<String> printBox;
	private JComboBox<String> printColorBox;
	private JComboBox<String> hasPrintBox;

	public Main() {
		initUI();
	}

	private void updateVariable(int var, String value) {
		switch(var) {
		case 0:
			this.shirtSize = value;
			break;
		case 1:
			this.shirtColor = value;
			break;
		case 2:
			this.hasPrint = value;
			break;
		case 3:
			this.printSpec = value;
			break;
		case 4:
			this.printColor = value;
			break;
		}
		checkConstraints();
		printValues();
	}

	private void printValues() {
		String s = String.format("Size: %s, BaseColor: %s, HasPrint: %s, Print specifications: %s, Print color: %s", shirtSize, shirtColor, hasPrint, printSpec, printColor);
		System.out.println(s);
	}

	private void checkConstraints() {
		if(shirtSize.equals("S")) {
			hasPrint = "false";
			hasPrintBox.setSelectedItem("false");
		} 

		if(hasPrint.equals("") || hasPrint.equals(" ") || hasPrint.equals("false")) {
			printBox.setEnabled(false);
			printColorBox.setEnabled(false);
		} else {
			printBox.setEnabled(true);
			printColorBox.setEnabled(true);
		}
	}

	private void initUI() {

		JPanel panel = new JPanel();

		//Create a panel and add components to it.
		setPreferredSize(new Dimension(800, 600));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());

		contentPane.add(mainPanel, BorderLayout.CENTER);

		JLabel title = new JLabel("Clothes configurator");
		JLabel emptyLabel = new JLabel("");

		// Enums
		String[] sizes = {" ", "S", "M", "L", "XL"};
		String[] baseColors = {" ", "Red", "Black", "Blue", "White", "Yellow", "Green"};
		String[] printArray = {" ", "Front", "Back", "Both"};
		String[] printColors = {" ", "White", "Black", "Red"};
		String[] hasPrintArray = {" ", "true", "false"};

		// ComboBoxes
		sizeBox = new JComboBox<>(sizes);
		sizeBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				updateVariable(SHIRT_SIZE, (String) cb.getSelectedItem());
			}
		});

		baseColorBox = new JComboBox<>(baseColors);
		baseColorBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				updateVariable(SHIRT_COLOR, (String) cb.getSelectedItem());
			}
		});

		printBox = new JComboBox<>(printArray);
		printBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				updateVariable(PRINT_SPEC, (String) cb.getSelectedItem());
			}
		});

		printColorBox = new JComboBox<>(printColors);
		printColorBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				updateVariable(PRINT_COLOR, (String) cb.getSelectedItem());
			}
		});

		hasPrintBox = new JComboBox<>(hasPrintArray);
		hasPrintBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				updateVariable(HAS_PRINT, (String) cb.getSelectedItem());
			}
		});

		// Parameter labels
		JLabel shirtSizeLabel = new JLabel("Shirt Size: ");
		JLabel shirtColorLabel = new JLabel("Shirt color: ");
		JLabel hasPrintLabel = new JLabel("Has print: ");
		JLabel printLabel = new JLabel("Print: "); // Parent 
		JLabel printSpecLabel = new JLabel("Print specifications: ");
		JLabel printColorLabel = new JLabel("Print color: ");

		getContentPane().add(BorderLayout.NORTH, title);
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.green);
		getContentPane().add(panel);
		GridBagConstraints left = new GridBagConstraints();
		left.anchor = GridBagConstraints.EAST;
		GridBagConstraints right = new GridBagConstraints();
		right.weightx = 2.0;
		right.fill = GridBagConstraints.HORIZONTAL;
		right.gridwidth = GridBagConstraints.REMAINDER;

		panel.add(shirtSizeLabel, left);
		panel.add(sizeBox, right);

		panel.add(shirtColorLabel, left);
		panel.add(baseColorBox, right);

		panel.add(hasPrintLabel, left);
		panel.add(hasPrintBox, right);

		panel.add(printLabel, left);
		panel.add(emptyLabel, right);

		panel.add(printSpecLabel, left);
		panel.add(printBox, right);

		panel.add(printColorLabel, left);
		panel.add(printColorBox, right);

		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Main ex = new Main();
				ex.setVisible(true);
				ex.checkConstraints();
			}
		});
	}
}
