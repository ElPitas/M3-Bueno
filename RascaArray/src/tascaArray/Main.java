package tascaArray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> array = new ArrayList<>();
			Pacient p0 = new Pacient("Nyx", "89746513E");
			Pacient p1 = new Pacient("Orfeo", "56468143A");
			Doctor p2 = new Doctor("Izanami", "41321654W", "1000 verdades");
			Doctor p3 = new Doctor("Arsene", "84981325C", "LeBlank");
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
		}

}
