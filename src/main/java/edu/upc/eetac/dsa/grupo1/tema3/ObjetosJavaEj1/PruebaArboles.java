package edu.upc.eetac.dsa.grupo1.tema3.ObjetosJavaEj1;



/**
 * Hello world!
 *
 */
public class PruebaArboles
{
public static void main(String args[])
{
Arbol arbol1 = new Arbol(4);
Arbol arbol2 = new Arbol("Roble");
Arbol arbol3 = new Arbol();
Arbol arbol4 = new Arbol(5,"Pino");

System.out.println("Un "+arbol1.GetNombre()+" de "+ arbol1.GetAltura() +" metros");
System.out.print("Un "+ arbol2.GetNombre()+"\n");
System.out.print("un "+ arbol3.GetNombre() + "\n");
System.out.print("Un "+ arbol4.GetNombre()+" de "+ arbol4.GetAltura()+ " metros\n");
}
}
