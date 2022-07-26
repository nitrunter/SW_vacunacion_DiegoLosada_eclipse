package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class login extends JFrame {

	private JPanel fondo;
	private JTextField box_user;
	private JPasswordField box_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setPreferredSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		fondo = new JPanel();
		fondo.setBackground(new Color(255, 255, 255));
		fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fondo);
		fondo.setLayout(null);
		
		JLabel img_side_left = new JLabel("New label");
		img_side_left.setIcon(new ImageIcon(login.class.getResource("/img/Vacunacovid-19.png")));
		img_side_left.setBounds(-89, 0, 384, 570);
		fondo.add(img_side_left);
		
		JButton btn_exit = new JButton("Salir");
		btn_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_exit.setFont(new Font("Roboto", Font.PLAIN, 11));
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_exit.setBounds(655, 493, 89, 23);
		fondo.add(btn_exit);
		
		JButton btn_login = new JButton("Iniciar sesión");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu menumain =new MainMenu();
				menumain.setVisible(true);
				dispose();
			}
		});
		btn_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_login.setFont(new Font("Roboto", Font.PLAIN, 11));
		btn_login.setBounds(433, 443, 129, 23);
		fondo.add(btn_login);
		
		JLabel txt_title = new JLabel("Software de vacunación ");
		txt_title.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title.setBounds(470, 11, 156, 17);
		fondo.add(txt_title);
		
		JLabel txt_title_1 = new JLabel("Hecho por: Diego Armando Losada Chala");
		txt_title_1.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title_1.setBounds(412, 49, 260, 17);
		fondo.add(txt_title_1);
		
		JLabel txt_user = new JLabel("Usuario");
		txt_user.setFont(new Font("Roboto", Font.PLAIN, 14));
		txt_user.setBounds(396, 294, 48, 17);
		fondo.add(txt_user);
		
		JLabel txt_pass = new JLabel("Contraseña");
		txt_pass.setFont(new Font("Roboto", Font.PLAIN, 14));
		txt_pass.setBounds(371, 354, 73, 17);
		fondo.add(txt_pass);
		
		box_user = new JTextField();
		box_user.setBounds(487, 293, 144, 20);
		fondo.add(box_user);
		box_user.setColumns(10);
		
		box_pass = new JPasswordField();
		box_pass.setBounds(487, 353, 144, 20);
		fondo.add(box_pass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/img/logo_hospital -small.png")));
		lblNewLabel.setBounds(400, 71, 282, 181);
		fondo.add(lblNewLabel);
		
		JButton btn_login_1 = new JButton("Iniciar sesión adm");
		btn_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAdmin menuadm =new MenuAdmin();
				menuadm.setVisible(true);
				dispose();
			}
		});
		btn_login_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		btn_login_1.setBounds(599, 443, 129, 23);
		fondo.add(btn_login_1);
	}
}
