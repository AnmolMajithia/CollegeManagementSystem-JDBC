package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class About_Us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Us frame = new About_Us();
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
	public About_Us() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(369, 180, 629, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.WHITE);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(589, 0, 40, 40);
		contentPane.add(lblX);
		
		String str="The MAC is a club of students from the APSIT who design & fabricate solar based automotives which are operated by a DC motor.";
		JLabel lblInfo = new JLabel("<html>The MAC is a club of students from the APSIT who design & fabricate solar based automotives.</html>");
		lblInfo.setBackground(new Color(112, 128, 144));
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInfo.setBounds(38, 285, 249, 59);
		contentPane.add(lblInfo);
		
		JLabel lblMac = new JLabel("MAC");
		lblMac.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMac.setHorizontalAlignment(SwingConstants.CENTER);
		lblMac.setBounds(43, 264, 237, 27);
		contentPane.add(lblMac);
		
		JLabel lblRedhatAcafdemyCenter = new JLabel("Redhat Academy Center");
		lblRedhatAcafdemyCenter.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblRedhatAcafdemyCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedhatAcafdemyCenter.setBounds(310, 240, 274, 27);
		contentPane.add(lblRedhatAcafdemyCenter);
		
		String rac="We provide Free of charge coaching for Red hat Certified System Administrator(RHCSA) & Redhat certified Engineer (RHCE) Cerifications.";
		JLabel lblRac = new JLabel("<html>"+rac+"</html>");
		lblRac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRac.setBounds(316, 260, 269, 65);
		contentPane.add(lblRac);
		
		JLabel lblMac_1 = new JLabel("mac");
		lblMac_1.setIcon(new ImageIcon(About_Us.class.getResource("/images/mac.png")));
		lblMac_1.setBounds(38, 186, 250, 79);
		contentPane.add(lblMac_1);
		
		JLabel lblRac_1 = new JLabel("rac");
		lblRac_1.setIcon(new ImageIcon(About_Us.class.getResource("/images/rac.png")));
		lblRac_1.setBounds(407, 185, 83, 60);
		contentPane.add(lblRac_1);
		
		String intro="A. P. Shah Institute of Technology known as APSIT is a Private Engineering College located in Kasarvadavali, Thane district of Maharashtra state in India. It was established in 2014, and is managed by the Parshvanath Charitable Trust. It offeres \"Bachelor of Engineering\" (B.E.) degree in any one of the following 5 disciplines: Civil engineering, Computer engineering, Electronics and telecommunication engineering, Information Technology, Mechanical engineering. The ordinary duration of these courses is 4 years.";
		JLabel lblIntro = new JLabel("<html>"+intro+"</html>");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntro.setBounds(28, 70, 578, 114);
		contentPane.add(lblIntro);
		
		JLabel lblAboutUs = new JLabel("About Us :");
		lblAboutUs.setForeground(Color.WHITE);
		lblAboutUs.setFont(new Font("", Font.BOLD, 24));
		lblAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutUs.setBounds(299, 0, 295, 59);
		contentPane.add(lblAboutUs);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText(" ");
		editorPane.setBounds(32, 180, 260, 164);
		editorPane.setBorder(BorderFactory.createLineBorder(Color.black,3));
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(299, 182, 295, 162);
		editorPane_1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		contentPane.add(editorPane_1);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(About_Us.class.getResource("/images/ANOOJ_BACKGROUND_1_629x408.png")));
		label.setBounds(0, 0, 629, 412);
		contentPane.add(label);
	}
}
