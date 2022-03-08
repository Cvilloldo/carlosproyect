package carlosproyect;

public class Guerrero extends Personaje {
  protected int ataque;
  
  Guerrero (){
	  ataque = 10;
	  System.out.println("Guerrero --> Constructor");

  }
  
  public int movimientoLucha(){
	  int golpe;
	  golpe = (int)(Math.random() * this.ataque);
	  System.out.println("****Espadazo**** golpe:"+golpe);
	  return golpe;
  }
  public String getPersonaje() {
      return "Guerrero";
 }
}
	