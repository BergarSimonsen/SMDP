import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Configurator extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel TitleLabel = new JLabel("ShirtConfigurator");
	private JLabel BrandLabel = new JLabel("Brand");
	private JLabel ColorLabel = new JLabel("Color");
	private JLabel SizeLabel = new JLabel("Size");
	private JLabel VNeckLabel = new JLabel("VNeck");
	private JLabel PrintLabel = new JLabel("Print");
	private JLabel PrintColorLabel = new JLabel("PrintColor");
	private JLabel PrintShapeLabel = new JLabel("PrintShape");
	private JLabel PrintPlacementLabel = new JLabel("PrintPlacement");
	
	
	//
	private JTextField BrandTextField = new JTextField();
	
	private String[] ColorComboBoxValues = new String[] {"Black", "Blue", "Green", "Red", "White", "Yellow" };
	private JComboBox<String> ColorComboBox = new JComboBox<String>(ColorComboBoxValues);
	
	Integer[] SizeComboBoxValues = new Integer[] {32, 34, 36, 38, 40, 42, 44, 46};
	private JComboBox<Integer> SizeComboBox = new JComboBox<>(SizeComboBoxValues); 
	
	private JCheckBox vNeckCheckBox = new JCheckBox();
	
	String[] PrintColorComboBoxValues = new String[] {"Red", "Green", "Blue"};
	private JComboBox<String> PrintColorComboBox = new JComboBox<>(PrintColorComboBoxValues); 
	
	String[] PrintShapeComboBoxValues = new String[] {"Round", "Square", "Triangular"};
	private JComboBox<String> PrintShapeComboBox = new JComboBox<>(PrintShapeComboBoxValues);
	
	String[] PrintPlacementListValues = new String[] {"Front", "Back", "LeftSleeve", "RightSleeve"};
	private JList<String> PrintPlacementList = new JList<>(PrintPlacementListValues);
	
	private JButton submitButton = new JButton("Submit");
	
	private void init() {
		JPanel panel = new JPanel();
		setPreferredSize(new Dimension(800, 600));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		contentPane.add(mainPanel, BorderLayout.CENTER);
		

		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String c = checkConstraints();
				if(c != null && c.length() == 0) {
					boolean b = save();
					JOptionPane.showMessageDialog(null, "Configuration file saved successfully!");
				} else 
					JOptionPane.showMessageDialog(null, c);
			}
		});
		
		//
		getContentPane().add(BorderLayout.NORTH, TitleLabel);
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.GREEN);
		getContentPane().add(panel);
		GridBagConstraints left = new GridBagConstraints();
		left.anchor = GridBagConstraints.EAST;
		GridBagConstraints right = new GridBagConstraints();
		right.weightx = 2.0;
		right.fill = GridBagConstraints.HORIZONTAL;
		right.gridwidth = GridBagConstraints.REMAINDER;

		panel.add(BrandLabel, left);
		panel.add(BrandTextField, right);

		panel.add(ColorLabel, left);
		panel.add(ColorComboBox, right);

		panel.add(SizeLabel, left);
		panel.add(SizeComboBox, right);
		
		panel.add(VNeckLabel, left);
		panel.add(vNeckCheckBox, right);

		panel.add(PrintLabel, left);
		panel.add(new JLabel(), right);

		panel.add(PrintColorLabel, left);
		panel.add(PrintColorComboBox, right);

		panel.add(PrintShapeLabel, left);
		panel.add(PrintShapeComboBox, right);

		panel.add(PrintPlacementLabel, left);
		panel.add(PrintPlacementList, right);

		panel.add(submitButton, left);

		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		show();		
	}

	private String checkConstraints() {
		String r = "";
		
		if(ColorComboBox.getSelectedItem() == null)
			r += "Color cannot be empty\n";
		if(SizeComboBox.getSelectedItem() == null)
			r += "Size cannot be empty";
		if(PrintColorComboBox.getSelectedItem() == null)
			r += "PrintColor cannot be empty\n";
		if(PrintShapeComboBox.getSelectedItem() == null)
			r += "PrintShapeCannot be empty\n";
		if(PrintPlacementList.getSelectedValuesList().size() == 0 || PrintPlacementList.getSelectedValuesList().size() > 2)
			r += "PrintPlacement must have 1 or 2 values";
		
		if(r.length() == 0) {
			if(!(!(ColorComboBox.getSelectedItem().toString().equals("RED")) || (ColorComboBox.getSelectedItem().toString().equals("RED") && (int)SizeComboBox.getSelectedItem() > 38)))
				r += "Constraint ((Color != String.RED) || ((Color == String.RED) && (Size > 38))) violated\n";
			if(!((((int)SizeComboBox.getSelectedItem() <= 40) || ((int)SizeComboBox.getSelectedItem() > 40)) && (vNeckCheckBox.isSelected() == false)))
				r += "Constraint ((Size <= 40) || ((Size > 40) && (VNeck == false))) violated";
			if(!(ColorComboBox.getSelectedItem().toString() != PrintColorComboBox.getSelectedItem().toString()))
				r += "Constraint (Color != PrintColor) violated\n";
		}
		
		return r;
	}
	
	private boolean save() {
		try {
			File f = new File("/home/bs/Desktop/configurator_output.txt");

			String s = "";
			s += BrandLabel.getText() + " : ";
			s += BrandTextField.getText() + "\n\n";

			s += ColorLabel.getText() + " : ";
			s += ColorComboBox.getSelectedItem().toString() + "\n\n";

			s += SizeLabel.getText() + " : ";
			s += (int) SizeComboBox.getSelectedItem() + "\n\n";

			s += PrintLabel.getText() + " : \n";

			s += PrintColorLabel.getText() + " : ";
			s += PrintColorComboBox.getSelectedItem().toString() + "\n\n";

			s += PrintShapeLabel.getText() + " : ";
			s += PrintShapeComboBox.getSelectedItem().toString() + "\n\n";

			s += PrintPlacementLabel.getText() + " : ";
			for(String p : PrintPlacementList.getSelectedValuesList())
				s += p + " ";

			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(s);
			bw.flush();
			bw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		Configurator c = new Configurator();
		c.init();
	}
}
