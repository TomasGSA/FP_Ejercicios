import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;

public class Colecciones1 {
    public static void main(String[] args) {
        HashSet<String> colores = new <String> HashSet();

        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Rosa");
        colores.add("Negro");
        colores.add("Blanco");
        colores.add("Morado");
        colores.add("Marrón");

        for (String color: colores) {
            System.out.print("["+color+"]");
        }
        //añadimos el color rojo de nuevo
        colores.add("Rojo");
        System.out.println();
        if(colores.equals("Dorado")){
            System.out.print("Contiene el color Dorado");
        }else{
            System.out.println("No contiene el color Dorado");
        }
        colores.remove("Amarillo");

        for (String color:colores) {
            System.out.print("["+color+"]");
        }
        System.out.println();
        System.out.println("El tamaño del array es: "+ colores.size() );
    }
}
