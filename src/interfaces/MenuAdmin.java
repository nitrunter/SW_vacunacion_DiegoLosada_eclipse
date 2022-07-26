package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 46);
		contentPane.add(menuBar);
		
		JMenu menu_user = new JMenu("Usuario");
		menu_user.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/usuarios_small40x40.png")));
		menuBar.add(menu_user);
		menu_user.setFont(new Font("Roboto", Font.BOLD, 16));
		
		JMenuItem menu_new_user = new JMenuItem("Nuevo Usuario");
		menu_new_user.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_user.add(menu_new_user);
		
		JMenuItem menu_user_query = new JMenuItem("Consultar Usuario");
		menu_user_query.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_user.add(menu_user_query);
		
		JMenuItem menu_user_modify = new JMenuItem("Modificar Usuario");
		menu_user_modify.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_user.add(menu_user_modify);
		
		JMenu menu_employee = new JMenu("Empleado");
		menu_employee.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/usuarios_small40x40.png")));
		menu_employee.setFont(new Font("Roboto", Font.BOLD, 16));
		menuBar.add(menu_employee);
		
		JMenuItem menu_new_user_1 = new JMenuItem("Nuevo Empleado");
		menu_new_user_1.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_employee.add(menu_new_user_1);
		
		JMenuItem menu_user_query_1 = new JMenuItem("Consultar Empleado");
		menu_user_query_1.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_employee.add(menu_user_query_1);
		
		JMenuItem menu_user_modify_1 = new JMenuItem("Modificar Empleado");
		menu_user_modify_1.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_employee.add(menu_user_modify_1);
		
		JMenu menu_report = new JMenu("Reporte");
		menu_report.setFont(new Font("Roboto", Font.BOLD, 16));
		menuBar.add(menu_report);
		
		JMenuItem menu_create_report = new JMenuItem("Generar Reporte");
		menu_create_report.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_report.add(menu_create_report);
		
		JMenuItem menu_print_report = new JMenuItem("Imprimir Reporte");
		menu_print_report.setFont(new Font("Roboto", Font.BOLD, 14));
		menu_report.add(menu_print_report);
		
		JLabel tbtn_exit = new JLabel("Salir");
		tbtn_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tbtn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		tbtn_exit.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/exit_small_blue.png")));
		tbtn_exit.setPreferredSize(new Dimension(44, 14));
		tbtn_exit.setMinimumSize(new Dimension(44, 14));
		tbtn_exit.setMaximumSize(new Dimension(44, 14));
		tbtn_exit.setHorizontalAlignment(SwingConstants.CENTER);
		tbtn_exit.setFont(new Font("Roboto", Font.BOLD, 14));
		tbtn_exit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tbtn_exit.setAlignmentX(0.5f);
		tbtn_exit.setBounds(600, 424, 140, 66);
		contentPane.add(tbtn_exit);
		
		JLabel tbtn_return = new JLabel("Regresar");
		tbtn_return.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tbtn_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login loginn = new login ();
				loginn.setVisible(true);
				dispose();
			}
		});
		tbtn_return.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/atras_small.png")));
		tbtn_return.setHorizontalAlignment(SwingConstants.LEFT);
		tbtn_return.setFont(new Font("Roboto", Font.BOLD, 14));
		tbtn_return.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tbtn_return.setAlignmentX(0.5f);
		tbtn_return.setBounds(353, 424, 140, 66);
		contentPane.add(tbtn_return);
		
		JLabel txt_title_2 = new JLabel("Módulo para el administrador");
		txt_title_2.setFont(new Font("Roboto", Font.BOLD, 16));
		txt_title_2.setBounds(408, 317, 213, 19);
		contentPane.add(txt_title_2);
		
		JLabel img_logo = new JLabel("");
		img_logo.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/logo_hospital -small.png")));
		img_logo.setBounds(370, 125, 282, 181);
		contentPane.add(img_logo);
		
		JLabel txt_title_1 = new JLabel("Hecho por: Diego Armando Losada Chala");
		txt_title_1.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title_1.setBounds(382, 103, 260, 17);
		contentPane.add(txt_title_1);
		
		JLabel txt_title = new JLabel("Software de vacunación ");
		txt_title.setFont(new Font("Roboto", Font.BOLD, 14));
		txt_title.setBounds(440, 65, 156, 17);
		contentPane.add(txt_title);
		
		JLabel img_side_left = new JLabel("");
		img_side_left.setIcon(new ImageIcon(MenuAdmin.class.getResource("/img/Vacunacovid-19.png")));
		img_side_left.setBounds(-116, 31, 367, 570);
		contentPane.add(img_side_left);
	}
}
