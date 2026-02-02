package tascaArray;

public class Doctor extends Persona{
	private String especialitat;

	public Doctor(String nom, String dni, String especialitat) {
		super(nom, dni);
		this.especialitat = especialitat;
	}

	public String getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(String especialitat) {
		this.especialitat = especialitat;
	}

	@Override
	public String toString() {
		return "Doctor [especialitat=" + especialitat + ", nom=" + nom + ", dni=" + dni + "]";
	}
	
}
