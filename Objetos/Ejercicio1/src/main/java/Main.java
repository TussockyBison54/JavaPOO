import java.time.LocalDate;
public class Main {

//1. Crea una clase Persona, cuyos atributos son:
//    a. Nombre, cadena
//    b. Fecha de nacimiento (utiliza la clase LocalDate de la librería Java.time, o
//            representa por variables separadas)
//c. DNI (sin letra), entero
//    d. Sexo, carácter
//    e. Altura, float
//    f. Peso, float
//    Debe tener unos métodos:
//    a. getters y setters que consideres oportunos.
//    b. getLetraDni, que devuelva la letra del dni. No acepta parámetros.
//            c. getIMC, que devuelve el índice de masa corporal. No acepta parámetros. La
//    fórmula es: peso (kg) / [estatura (m)]2
//
// Cambios realizados por mi Sexo es un enum y nombre un String

    public static void main(String[] args) {
        Persona p = new Persona("Manolo",1921022,Sexo.MASCULINO, LocalDate.of(1998,3,11),1.79F,90, 'R');
        System.out.println(p.toString());
        System.out.println(p.getIMC());
        System.out.println(p.getLetra());
    }

}
