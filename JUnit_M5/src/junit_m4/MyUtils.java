package junit_m4;

import java.util.Calendar;

public class MyUtils {

    /**
     * @param cadena String cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    
    public static String inverteix(String cadena) {
        if (cadena == null) {
            return null;
        }
        String resultat = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat += cadena.charAt(i);
        }
        return resultat;
    }

    /**
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
     */
    
    public static int edat(int day, int month, int year) {
        int DiaActual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int MesActual = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int AnyActual = Calendar.getInstance().get(Calendar.YEAR);

        if (year > AnyActual || (year == AnyActual && month > MesActual) || (year == AnyActual && month == MesActual && day > DiaActual)) {
            return -2;
        }
        int edat = AnyActual - year;
        if (month < MesActual) {
            edat--;
        } else if (month == MesActual && day < DiaActual) {
            edat--;
        }
        if (edat > 150) {
            return -1;
        }

        return edat;
    }

    /**
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
     */
    
    public static double factorial(double numero) {
        if (numero < 0) {
            return -1;
        }

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
