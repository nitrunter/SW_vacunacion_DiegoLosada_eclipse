package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu menu_user = new JMenu("Usuario");
		menu_user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menu_user.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		menu_user.setIcon(new ImageIcon(MainMenu.class.getResource("/img/usuarios_small40x40.png")));
		menu_user.setFont(new Font("Roboto", Font.BOLD, 16));
		menuBar.add(menu_user);
		
		JMenuItem menu_new_user = new JMenuItem("Nuevo Usuario");
		menu_new_user.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_user.add(menu_new_user);
		
		JMenuItem menu_user_query = new JMenuItem("Consultar Usuario");
		menu_user_query.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_user.add(menu_user_query);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setFont(new Font("Roboto", Font.PLAIN, 12));
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel img_side_left = new JLabel("");
		img_side_left.setIcon(new ImageIcon(MainMenu.class.getResource("/img/Vacunacovid-19_2.png")));
		img_side_left.setBounds(-68, 0, 334, 570);
		contentPane.add(img_side_left);
		
		JLabel txt_title = new JLabel("Software de vacunación ");
		txt_title.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title.setBounds(458, 11, 156, 17);
		contentPane.add(txt_title);
		
		JLabel txt_title_1 = new JLabel("Hecho por: Diego Armando Losada Chala");
		txt_title_1.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title_1.setBounds(400, 49, 260, 17);
		contentPane.add(txt_title_1);
		
		JLabel img_logo = new JLabel("");
		img_logo.setIcon(new ImageIcon(MainMenu.class.getResource("/img/logo_hospital -small.png")));
		img_logo.setBounds(388, 71, 282, 181);
		contentPane.add(img_logo);
		
		JLabel txt_title_2 = new JLabel("Módulo para el empleado");
		txt_title_2.setFont(new Font("Roboto", Font.BOLD, 16));
		txt_title_2.setBounds(444, 273, 184, 19);
		contentPane.add(txt_title_2);
		
		JLabel tbtn_exit = new JLabel("Salir");
		tbtn_exit.setPreferredSize(new Dimension(44, 14));
		tbtn_exit.setMinimumSize(new Dimension(44, 14));
		tbtn_exit.setMaximumSize(new Dimension(44, 14));
		tbtn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		tbtn_exit.setIcon(new ImageIcon(MainMenu.class.getResource("/img/exit_small_blue.png")));
		tbtn_exit.setHorizontalAlignment(SwingConstants.CENTER);
		tbtn_exit.setAlignmentX(Component.CENTER_ALIGNMENT);
		tbtn_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tbtn_exit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tbtn_exit.setFont(new Font("Roboto", Font.BOLD, 14));
		tbtn_exit.setBounds(618, 370, 140, 66);
		contentPane.add(tbtn_exit);
		
		JLabel tbtn_return = new JLabel("Regresar");
		tbtn_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login loginn = new login ();
				loginn.setVisible(true);
				dispose();
			}
		});
		tbtn_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tbtn_return.setIcon(new ImageIcon(MainMenu.class.getResource("/img/atras_small.png")));
		tbtn_return.setHorizontalAlignment(SwingConstants.LEFT);
		tbtn_return.setFont(new Font("Roboto", Font.BOLD, 14));
		tbtn_return.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tbtn_return.setAlignmentX(0.5f);
		tbtn_return.setBounds(371, 370, 140, 66);
		contentPane.add(tbtn_return);
	}
}
