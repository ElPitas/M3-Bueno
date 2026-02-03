package tascaArray;

public class Pacient extends Persona{
	
	private String historialMedic;
	
	public Pacient(String nom, String dni, String his) {
		super(nom, dni);
		this.historialMedic = his;
		// TODO Auto-generated constructor stub
	}

	public String getHistorialMedic() {
		return historialMedic;
	}

	public void setHistorialMedic(String historialMedic) {
		this.historialMedic = historialMedic;
	}

	@Override
	public String toString() {
		return "Pacient [historialMedic=" + historialMedic + ", nom=" + nom + ", dni=" + dni + "]";
	}

	
}
