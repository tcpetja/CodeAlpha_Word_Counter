package WordCounter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WordCount extends JFrame {

	private JPanel contentPane;
	private JTextField paragraph;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCount frame = new WordCount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void Count(String paragraph){
        
            if (paragraph.isEmpty()) {
                JOptionPane.showMessageDialog(null,"There is no text in the text field", "No text", JOptionPane.ERROR_MESSAGE);
            }else{
                String trimmedParagraph = paragraph.trim();
                String[] words = trimmedParagraph.split("\\s+"); 
                int wordCount = words.length;
                
                JOptionPane.showMessageDialog(null,"The text provided has " + wordCount + " Words", "Word Count",JOptionPane.INFORMATION_MESSAGE );
            }
        
    }
	
	public WordCount() {
		setTitle("WordCounter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 349);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word Counter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(238, 38, 183, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter/paste text to count words on");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(150, 93, 368, 38);
		contentPane.add(lblNewLabel_1);
		
		paragraph = new JTextField();
		paragraph.setFont(new Font("Tahoma", Font.PLAIN, 13));
		paragraph.setBounds(77, 144, 468, 45);
		contentPane.add(paragraph);
		paragraph.setColumns(10);
		
		JButton btnCount = new JButton("Count");
		btnCount.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Count(paragraph.getText());
			}
		});
		btnCount.setBounds(91, 222, 172, 45);
		contentPane.add(btnCount);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnClose.setBounds(353, 222, 145, 45);
		contentPane.add(btnClose);
	}
}
