package gestor;

import javax.swing.JPanel;

public class Gestor_Peliculas {
	
	private JPanel panel_Cines;
	private JPanel panel_Peliculas;
	private JPanel panel_Factura;
	private JPanel panel_Sesion;
	
	public void obtenerPeliculas() {

		@SuppressWarnings("unused") 
		String[][] lista = {
				{ "Titanic", "La Monja", "Avengers", "Shrek" }

		};
	}
	
	@SuppressWarnings("unused")
	private void seleccionar() {
		panel_Sesion.setVisible(true);
		panel_Peliculas.setVisible(false);
		
	}
	
	@SuppressWarnings("unused")
	private void volver() {
		panel_Cines.setVisible(true);
		panel_Peliculas.setVisible(false);
		
	}
	
	@SuppressWarnings("unused")
	private void finalizar() {
		panel_Factura.setVisible(true);
		panel_Peliculas.setVisible(false);
		
	}
}
