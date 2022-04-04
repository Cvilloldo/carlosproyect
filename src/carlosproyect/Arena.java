package carlosproyect;

import java.util.ArrayList;
import java.util.Iterator;

public class Arena {
	public static int danoValor = 0;
	public static ArrayList<Integer> listaAcuGolpes = new ArrayList<Integer>();
	
			
	public static void Lucha (Guerrero guer, Mago mag, int danoVal, ArrayList<Integer>listAcuGolpes){
		int golGue = guer.movimientoLucha();
		int golMag = mag.movimientoLucha();
		mag.setVida(mag.getVida() - golGue);
		guer.setVida(guer.getVida() - golMag);
		danoVal = golGue + golMag;
		listAcuGolpes.add(Integer.valueOf(golGue + golMag));
		
	}

	public static void main(String[] args) {

		Guerrero guer1 = new Guerrero();
		System.out.println("VIDA DEL GUERRERO: "+guer1.getVida());
		//System.out.println("Lucha del guerrero: "+guer1.movimientoLucha());
	
		Mago mag1 = new Mago();
		System.out.println("Nivel de vida de Mago: "+mag1.getVida());
		//System.out.println("Lucha del mago: "+mag1.movimientoLucha());
	   
		for (int i=0; i<4; i++) {
		Lucha (guer1,mag1, danoValor, listaAcuGolpes);
	
		System.out.println("Primera Lucha");
		System.out.println("Nivel de vida de Guerrero: "+guer1.getVida());
		System.out.println("Nivel de vida de Mago: "+mag1.getVida());
		}
		
		Iterator<Integer> iteInt = listaAcuGolpes.iterator();
		
		
		System.out.println("Daño acumulado por valor: "+danoValor);
		while (iteInt.hasNext()) {
			System.out.println(iteInt.next()+ " ");
		}
		
	}

}
