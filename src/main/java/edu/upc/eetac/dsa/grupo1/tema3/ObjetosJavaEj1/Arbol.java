package edu.upc.eetac.dsa.grupo1.tema3.ObjetosJavaEj1;

public class Arbol {

	 private String Nombre;
	 private int Altura;

	 
	 Arbol(int Altura ,String Nombre){
		 this.Altura = Altura; 
		 this.Nombre = Nombre;  
	 }
	 Arbol(int Altura){
		 this.Altura = Altura;
		 Nombre= "árbol";
	 }
	 Arbol(String Nombre){ 
		 this.Nombre = Nombre;  
	 }
	 Arbol(){
		 Nombre= "árbol generico";
	 }
	
	 public String GetNombre() {
	      return Nombre;
	   }
	  public int GetAltura() {
	      return Altura;
	   }
	  public void setNombre(String nombre) {
	      this.Nombre = nombre;
	   }
	  public void setAltura(int altura) {
	      this.Altura  = altura;
	   }
}
