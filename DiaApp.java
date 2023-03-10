import java.util.Scanner;
public class DiaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre el 1 - 7 ");
        int numDia = sc.nextInt();
        String diaString ;
        String diaSig = null;
        if (numDia <= 7 || numDia >= 1) {
            switch (numDia) {
                case 1:
                    diaString = "Lunes";
                    diaSig = "Martes, Miercoles, Jueves, Viernes, Sabado, Domingo";
                    break;
                case 2:
                    diaString = "Martes";
                    diaSig = "Miercoles, Jueves, Viernes, Sabado, Domingo";
                    break;
                case 3:
                    diaString = "Miercoles";
                    diaSig = "Jueves, Viernes, Sabado, Domingo";
                    break;
                case 4:
                    diaString = "Jueves";
                    diaSig = "Jueves, Viernes, Sabado, Domingo";
                    break;
                case 5:
                    diaString = "Viernes";
                    diaSig = "Sabado, Domingo";
                    break;
                case 6:
                    diaString = "Sabado";
                    diaSig = "Domingo";
                    break;
                case 7:
                    diaString = "Domingo";
                    diaSig = "este es el ultimo día de la semana";
                    break;
                default:
                    diaString = "Típo de día no válido";
                    break;
            }
            System.out.println(diaString +", el resto de días de la semana:  "+diaSig);
        }else{
            System.out.println("Número no soportado");
        }
    }
}
