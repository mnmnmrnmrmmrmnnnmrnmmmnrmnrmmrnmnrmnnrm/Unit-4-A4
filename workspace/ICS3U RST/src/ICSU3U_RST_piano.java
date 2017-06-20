/* name: Josh Pye
 * course code: ICS3U
 * teacher: Mr. Kuzmochka
 * date: June 20th
 * description: This is the Final RST. This program is a piano on a GUI interface that is controlled by 
 * button mappings on the keyboard. 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class ICSU3U_RST_piano extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigitalPiano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICSU3U_RST_piano frame = new ICSU3U_RST_piano();
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
	public ICSU3U_RST_piano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("G");
		btnNewButton.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(31, 261, 63, 161);
		contentPane.add(btnNewButton);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnA.setBounds(108, 261, 63, 161);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnB.setBounds(181, 261, 63, 161);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnC.setBounds(254, 261, 63, 161);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnD.setBounds(327, 261, 63, 161);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnE.setBounds(400, 261, 63, 161);
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnF.setBounds(473, 261, 63, 161);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G#");
		btnG.setBackground(Color.BLACK);
		btnG.setForeground(Color.WHITE);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnG.setBounds(75, 89, 70, 161);
		contentPane.add(btnG);
		
		JButton btnA_1 = new JButton("A#");
		btnA_1.setBackground(Color.BLACK);
		btnA_1.setForeground(Color.WHITE);
		btnA_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnA_1.setBounds(148, 89, 70, 161);
		contentPane.add(btnA_1);
		
		JButton btnB_1 = new JButton("C#");
		btnB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB_1.setForeground(Color.WHITE);
		btnB_1.setBackground(Color.BLACK);
		btnB_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnB_1.setBounds(290, 89, 70, 161);
		contentPane.add(btnB_1);
		
		JButton btnD_1 = new JButton("D#");
		btnD_1.setForeground(Color.WHITE);
		btnD_1.setBackground(Color.BLACK);
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnD_1.setBounds(370, 89, 70, 161);
		contentPane.add(btnD_1);
		
		JButton btnE_1 = new JButton("F#");
		btnE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE_1.setForeground(Color.WHITE);
		btnE_1.setBackground(Color.BLACK);
		btnE_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnE_1.setBounds(502, 89, 70, 161);
		contentPane.add(btnE_1);
		
		JTextPane txtpnKeyBindingsGq = new JTextPane();
		txtpnKeyBindingsGq.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		txtpnKeyBindingsGq.setForeground(new Color(255, 255, 255));
		txtpnKeyBindingsGq.setBackground(new Color(128, 0, 0));
		txtpnKeyBindingsGq.setText("Key Bindings:\r\nG=q\r\nG#=2\r\nA=w\r\nA#=3\r\nB=e\r\nC=r\r\nC#=5\r\nD=t\r\nD#=6\r\nE=y\r\nF=u\r\nF#=8\r\nG=i");
		txtpnKeyBindingsGq.setBounds(628, 45, 70, 243);
		contentPane.add(txtpnKeyBindingsGq);
		
		txtDigitalPiano = new JTextField();
		txtDigitalPiano.setFont(new Font("Segoe Print", Font.PLAIN, 24));
		txtDigitalPiano.setBackground(new Color(128, 0, 0));
		txtDigitalPiano.setForeground(new Color(255, 255, 255));
		txtDigitalPiano.setText("Digital Piano");
		txtDigitalPiano.setBounds(8, 11, 217, 67);
		contentPane.add(txtDigitalPiano);
		txtDigitalPiano.setColumns(10);
		
		JButton btnG_1 = new JButton("G");
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 20));
		btnG_1.setBounds(546, 261, 63, 161);
		contentPane.add(btnG_1);
	}
}
