package gestor;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gestor_Sesion {

	private JPanel panel_Cines;
	private JPanel panel_Peliculas;
	private JPanel panel_Sesion;
	
	public void obtenerFechas() {

		@SuppressWarnings("unused") 
		String[][] lista = {
				{ "27 febrero", "28 febrero", "29 febrero", "01 marzo" }

		};
	}
	
	@SuppressWarnings("unused")
	public void confirmacion(Object popUp) {
	JOptionPane.showInputDialog(null, "Cine:" + "Pelicula:" + "Sala:" + "Fecha:" + "Hora:", JOptionPane.INFORMATION_MESSAGE);

	String respuesta = JOptionPane.showInputDialog(null, "¿La informacion es correcta? ", JOptionPane.YES_NO_CANCEL_OPTION);
	JButton yesButton = new JButton("Sí");
    JButton noButton = new JButton("No");

    yesButton.addActionListener(e -> {
        popUp.dispose(); 
    });

    noButton.addActionListener(e -> {
        popUp.dispose();
    });
	}
	
	@SuppressWarnings("unused")
	private void Volver() {
		panel_Peliculas.setVisible(true);
		panel_Sesion.setVisible(false);	
	}
	
	@SuppressWarnings("unused")
	private void Finalizar() {
		panel_Cines.setVisible(true);
		panel_Sesion.setVisible(false);
		
	}
	 
}
