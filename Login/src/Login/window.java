package Login;

import java.awt.EventQueue;
import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;

public class window {

	private JFrame frmLogin;
	private JPasswordField uNameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frmLogin.setVisible(true);
					try{
						loadUser();
					}catch(Exception e){
						e.printStackTrace();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private void loadUser() {
				// TODO Auto-generated method stub
				{

					try{


						File file = new File("login.txt");
						FileInputStream fileIn = new FileInputStream(file);
						BufferedReader br = new BufferedReader(new InputStreamReader(fileIn));

						String line = null;

						while ((line = br.readLine()) != null) {
							//System.out.println(line);
							
						}

						br.close();

					}catch(Exception e){
						//error
					}

				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(21, 16, 391, 228);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("168px"),
				ColumnSpec.decode("40px:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("10px"),},
				new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("26px"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,}));

		JLabel lblPleaseLogin = new JLabel("Please Login:");
		lblPleaseLogin.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPleaseLogin, "1, 2, 2, 1, center, default");

		JLabel lblName = new JLabel("Name:");
		panel.add(lblName, "1, 6, left, center");

		uNameField = new JPasswordField();
		uNameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		panel.add(uNameField, "2, 6, fill, fill");

		JLabel lblPassword = new JLabel("Password: ");
		panel.add(lblPassword, "1, 8, left, default");

		passwordField = new JPasswordField();
		panel.add(passwordField, "2, 8, fill, default");

		JLabel lblSucess = new JLabel("Congratulations!!");
		lblSucess.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSucess, "1, 10, 2, 3");
		lblSucess.setForeground(Color.BLACK);

		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel, "1, 14");

		JButton btnok = new JButton("OK");
		panel.add(btnok, "2, 14");
		btnok.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {


			}
		});
		btnok.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				Varify();
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override


			public void mouseClicked(MouseEvent e) {
			}
		});
		lblSucess.setVisible(false);
	}
}
