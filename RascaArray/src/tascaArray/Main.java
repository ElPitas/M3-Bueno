package tascaArray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
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
			Pacient p0 = new Pacient("Nyx", "89746513E");
			Pacient p1 = new Pacient("Orfeo", "56468143A");
			Doctor p2 = new Doctor("Izanami", "41321654W", "1000 verdades");
			Doctor p3 = new Doctor("Arsene", "84981325C", "LeBlank");
		
			for (Persona p : array2) {
				if(p instanceof Doctor) {
					Doctor pac = (Doctor)p;
					System.out.println("ii");
				}else {
					System.out.println("ii");
				}
			}	
			 System.out.println("A");
		
			
		}

}
