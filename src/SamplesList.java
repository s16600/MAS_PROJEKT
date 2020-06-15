import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class SamplesList {

	private JFrame frame;
	private JScrollPane scrollPaneParameter;
	private JScrollPane scrollPaneSample;
	private JTable tableSample;
	private JTable tableParameter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SamplesList window = new SamplesList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SamplesList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 711, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEditResult = new JButton("Edit Result");
		btnEditResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Przycisk");
				List<Sample> lista = new ArrayList<Sample>();
				lista = myDBase.readBase();
				DefaultTableModel model_1 = new DefaultTableModel();
				model_1.addColumn("Sample id");
				model_1.addColumn("Sample number");
				model_1.addColumn("Batch number");
				
				for(Sample sample : lista) {
					//model_1.addRow(new Object[] {sample.idSample, sample.nrProby, sample.nrSerii});
					//String tekst = JOptionPane.showInputDialog("Wpisz tekst...");
					model_1.addRow(new Object[] {"","",""});
				}
				tableSample.setModel(model_1);
				


				
			}
		});
		btnEditResult.setBounds(387, 371, 298, 51);
		frame.getContentPane().add(btnEditResult);
		
		scrollPaneParameter = new JScrollPane();
		scrollPaneParameter.setBorder(new TitledBorder(null, "Tested parameters", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPaneParameter.setBounds(387, 11, 298, 349);
		frame.getContentPane().add(scrollPaneParameter);
		
		tableParameter = new JTable();
		tableParameter.setDefaultEditor(Object.class, null);
		tableParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		DefaultTableModel model = new DefaultTableModel(); 
		model.addColumn("Id.");
		model.addColumn("Tested parameter");
		tableParameter.setModel(model);
		for (int i = 0; i<5; i++) model.addRow(new Object[]{String.valueOf(i)," "});
		scrollPaneParameter.setViewportView(tableParameter);
		
		scrollPaneSample = new JScrollPane();
		scrollPaneSample.setBorder(new TitledBorder(null, "Sample", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPaneSample.setBounds(10, 11, 368, 411);
		frame.getContentPane().add(scrollPaneSample);
		
		tableSample = new JTable();
		tableSample.setDefaultEditor(Object.class, null);
		tableSample.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		/*
		DefaultTableModel model_1 = new DefaultTableModel(); 
		model_1.addColumn("Sample id");
		model_1.addColumn("Sample number");
		model_1.addColumn("Batch number");
		tableSample.setModel(model_1);
		for (int i = 0; i<30; i++) model_1.addRow(new Object[]{String.valueOf(i),"123, askdvfksdvfbdfvdfvdkfvdf"});
		*/
		scrollPaneSample.setViewportView(tableSample);
		
	}
}
