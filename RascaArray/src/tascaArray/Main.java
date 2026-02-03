package tascaArray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int i;

		// TODO Auto-generated method stub
		/*
		
		ArrayList<Persona> array = new ArrayList<>();
			Persona p0 = new Persona("Nyx", "89746513E");
			Persona p1 = new Persona("Orfeo", "56468143A");
			Persona p2 = new Persona("Izanami", "41321654W");
			Persona p3 = new Persona("Arsene", "84981325C");
			array.add(p0);
			array.add(p1);
			array.add(p2);
			array.add(p3);
		
			System.out.println(array.get(1));
			System.out.println("El tamaño del array es " + array.size());
			array.set(0, p1);
			array.remove(1);
			
			for (Persona element : array) {
				System.out.print(element + " ");
			}	
			*/
		
		
		ArrayList<Persona> array2 = new ArrayList<>();
			array2.add(new Pacient("Nyx", "89746513E", "The moment man devoured the fruit of knowledge"));
			array2.add(new Pacient("Orfeo", "56468143A","he sealed his fate... "));
			array2.add(new Doctor("Izanami", "41321654W", "Entrusting his future to the cards,"));
			array2.add(new Doctor("Arsene", "84981325C", "man clings to a dim hope."));
		
			i = 0;
			
			for (Persona p : array2) {
				if(p instanceof Doctor) {
					Doctor Doc = (Doctor)p;
					System.out.println("Element del vector: " + i +  " Doctor" + ", Nombre:" + p.getNom() + ", DNI: " + p.getDni() + ", Especialitat: " + Doc.getEspecialitat());
					i++;
				}else {
					Pacient Pac = (Pacient)p;
					System.out.println("Element del vector: " + i +  " Pacient" +  ", Nombre: " + p.getNom() + ", DNI: " + p.getDni() + ", Historial Medic: " + Pac.getHistorialMedic());
					i++;
				}
			}	
 		
			
		}

}
