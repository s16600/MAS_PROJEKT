
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Okno1 {

	private JDialog frame;
	private JPanel panelSample;
	private JPanel panelResult;
	private JPanel panelMeasurements;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTable tableMeasurements;
	private JTextField txtSampleName;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textFieldSampleNumber;
	private JLabel lblNewLabel_2;
	private JTextField textFieldBatchNumber;
	private JLabel lblNewLabel_5;
	private JTextField textFieldResult;
	private JTextPane textPaneTestedParameter;
	private JTextPane textPaneSpecificationLimits;
	
	private long Id_WYNIK;
	private WYNIK wynik;
	private String NR_PROBY;
	private String NR_SERII;
	private String NAZWA_MATERIALU;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno1 window = new Okno1(2);
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void showData() {
		/*
		WYNIK wynik = WYNIK.find(id);
		PROBA proba = PROBA.find(wynik.getPROBA_ID_PROBA());
		SPECYFIKACJA specyfikacja = SPECYFIKACJA.find(proba.getSPECYFIKACJA_ID_SPECYFIKACJI());
		
		textPaneTestedParameter.setText(wynik.getNAZWA());
		textPaneSpecificationLimits.setText(wynik.getWYMAGANIA());
		
		txtSampleName.setText(specyfikacja.getNAZWA_MATERIALU());
		textFieldSampleNumber.setText(proba.getNR_PROBY());
		textFieldBatchNumber.setText(proba.getNR_SERII());
		
		DefaultTableModel model = new DefaultTableModel();
    	model.addColumn("No.");
    	model.addColumn("Result");
    	tableMeasurements.setModel(model);
	    
    	int iterator = 1;
    	List<POMIAR> pomiary = WYNIK.findPomiary(wynik.getID_WYNIK());
	    for (POMIAR p : pomiary) {
	    	model.addRow(new Object[]{iterator++,p.getWARTOSC_NUM()});
	    }
	    
	    textFieldResult.setText(wynik.calculate().toString());
	    */
		
		/*
		WYNIK wynik = new WYNIK();
		wynik.read(id);
		PROBA proba = PROBA.find(wynik.getPROBA_ID_PROBA());
		SPECYFIKACJA specyfikacja = SPECYFIKACJA.find(proba.getSPECYFIKACJA_ID_SPECYFIKACJI());
		
		textPaneTestedParameter.setText(wynik.getNAZWA());
		textPaneSpecificationLimits.setText(wynik.getWYMAGANIA());
		
		txtSampleName.setText(specyfikacja.getNAZWA_MATERIALU());
		textFieldSampleNumber.setText(proba.getNR_PROBY());
		textFieldBatchNumber.setText(proba.getNR_SERII());
		
		DefaultTableModel model = new DefaultTableModel();
    	model.addColumn("No.");
    	model.addColumn("Result");
    	tableMeasurements.setModel(model);
    	
    	int iterator = 1;
	    for (POMIAR p : wynik.pomiary) {
	    	model.addRow(new Object[]{iterator++,p.getWARTOSC_NUM()});
	    }
	    
	    textFieldResult.setText(wynik.calculate().toString());
	    */
		
		//WYNIK wynik = new WYNIK();
		//wynik.read(Id_WYNIK);
		
		DefaultTableModel model = new DefaultTableModel();
    	model.addColumn("No.");
    	model.addColumn("Result");
    	tableMeasurements.setModel(model);
    	
    	int iterator = 1;
	    for (POMIAR p : wynik.pomiary) {
	    	model.addRow(new Object[]{iterator++,p.getWARTOSC_NUM()});
	    }
	    
	    textFieldResult.setText(wynik.calculate().toString());
	    
	}
	
	/**
	 * Create the application.
	 */
	public Okno1(long id) {
		initialize();
		
		frame.setModal(true);
		
		this.Id_WYNIK = id;
		this.wynik = new WYNIK();
		this.wynik.read(Id_WYNIK);
		
		textPaneTestedParameter.setText(wynik.getNAZWA());
		textPaneSpecificationLimits.setText(wynik.getWYMAGANIA());
		txtSampleName.setText(wynik.specyfikacja().getNAZWA_MATERIALU());
		textFieldSampleNumber.setText(wynik.proba().getNR_PROBY());
		textFieldBatchNumber.setText(wynik.proba().getNR_SERII());
		
		showData();
		
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setResizable(false);
		frame.setBounds(100, 100, 712, 604);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelSample = new JPanel();
		panelSample.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sample", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelSample.setBounds(10, 11, 375, 164);
		frame.getContentPane().add(panelSample);
		panelSample.setLayout(null);
		
		txtSampleName = new JTextField();
		txtSampleName.setEnabled(false);
		txtSampleName.setEditable(false);
		txtSampleName.setBounds(131, 37, 223, 20);
		panelSample.add(txtSampleName);
		txtSampleName.setColumns(10);
		txtSampleName.setDisabledTextColor(Color.black);
		
		lblNewLabel = new JLabel("Sample name");
		lblNewLabel.setBounds(21, 40, 119, 14);
		panelSample.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Sample number");
		lblNewLabel_1.setBounds(21, 78, 119, 14);
		panelSample.add(lblNewLabel_1);
		
		textFieldSampleNumber = new JTextField();
		textFieldSampleNumber.setEnabled(false);
		textFieldSampleNumber.setEditable(false);
		textFieldSampleNumber.setBounds(131, 75, 223, 20);
		panelSample.add(textFieldSampleNumber);
		textFieldSampleNumber.setColumns(10);
		textFieldSampleNumber.setDisabledTextColor(Color.black);
		
		lblNewLabel_2 = new JLabel("Batch number");
		lblNewLabel_2.setBounds(21, 113, 119, 14);
		panelSample.add(lblNewLabel_2);
		
		textFieldBatchNumber = new JTextField();
		textFieldBatchNumber.setEnabled(false);
		textFieldBatchNumber.setEditable(false);
		textFieldBatchNumber.setBounds(131, 113, 224, 20);
		panelSample.add(textFieldBatchNumber);
		textFieldBatchNumber.setColumns(10);
		textFieldBatchNumber.setDisabledTextColor(Color.black);
		
		panelResult = new JPanel();
		panelResult.setBorder(new TitledBorder(null, "Result", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelResult.setBounds(10, 186, 375, 337);
		frame.getContentPane().add(panelResult);
		panelResult.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Result");
		lblNewLabel_5.setBounds(22, 262, 77, 14);
		panelResult.add(lblNewLabel_5);
		
		//JTextPane textPaneTestedParameter = new JTextPane();
		textPaneTestedParameter = new JTextPane();
		textPaneTestedParameter.setBackground(SystemColor.control);
		textPaneTestedParameter.setEditable(false);
		textPaneTestedParameter.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tested parameter", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textPaneTestedParameter.setBounds(22, 24, 331, 88);
		panelResult.add(textPaneTestedParameter);
		
		//JTextPane textPaneSpecificationLimits = new JTextPane();
		textPaneSpecificationLimits = new JTextPane();
		textPaneSpecificationLimits.setBackground(SystemColor.control);
		textPaneSpecificationLimits.setEditable(false);
		textPaneSpecificationLimits.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Specification limits", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textPaneSpecificationLimits.setBounds(22, 140, 331, 88);
		panelResult.add(textPaneSpecificationLimits);
		
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResult.setEnabled(false);
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(94, 259, 196, 20);
		panelResult.add(textFieldResult);
		textFieldResult.setColumns(10);
		textFieldResult.setDisabledTextColor(Color.black);
		
		JLabel lblNewLabel_3 = new JLabel("unit");
		lblNewLabel_3.setBounds(300, 262, 46, 14);
		panelResult.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Evaluation");
		lblNewLabel_4.setBounds(22, 299, 89, 14);
		panelResult.add(lblNewLabel_4);
		
		JComboBox comboBoxEvaluation = new JComboBox();
		comboBoxEvaluation.setModel(new DefaultComboBoxModel(new String[] {"Correct", "Incorrect", "For information"}));
		comboBoxEvaluation.setBounds(94, 296, 196, 20);
		panelResult.add(comboBoxEvaluation);
		
		panelMeasurements = new JPanel();
		panelMeasurements.setBorder(new TitledBorder(null, "Measurements", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelMeasurements.setBounds(395, 11, 301, 512);
		frame.getContentPane().add(panelMeasurements);
		panelMeasurements.setLayout(null);
		
		btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wynik.pomiary.remove(wynik.pomiary.size() - 1);
				showData();
			}
		});
		btnNewButton_2.setBounds(103, 478, 89, 23);
		panelMeasurements.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Add");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String valueString = JOptionPane.showInputDialog("Input measured value");
					Double valueDouble = null;
					if (valueString != null)  {
						valueDouble = Double.parseDouble(valueString);
						wynik.pomiary.add(new POMIAR(0, Id_WYNIK, "NUM", valueDouble, false, "", ""));
					}
				}
				catch (Exception exc) {
					JOptionPane.showMessageDialog(null,"Incorrect value");
				} 
				
				showData();
			}
		});
		btnNewButton_3.setBounds(202, 478, 89, 23);
		panelMeasurements.add(btnNewButton_3);
		
		tableMeasurements = new JTable();
		tableMeasurements.setEnabled(false);
		tableMeasurements.setRowSelectionAllowed(false);
		tableMeasurements.setBounds(10, 21, 281, 446);
		panelMeasurements.add(tableMeasurements);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
		        //System.exit(0);
			}
		});
		btnNewButton.setBounds(250, 541, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Accept");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wynik.write();
				frame.dispose();
		        //System.exit(0);
			}
		});
		btnNewButton_1.setBounds(349, 541, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
