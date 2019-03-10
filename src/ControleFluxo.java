public class ControleFluxo {

    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 10 && idade <18 juvenil
        // idade >=18 Adulto
        int idade = 15;
        String categoria;
        if (idade >= 10) {
            categoria = "infantil";
            System.out.println("categoria infantil");
        }else if ( idade>= 15 && idade < 18 ) {
            categoria = "juvenil";
            System.out.println("categoria Juvenil");
        }else {
            categoria = "adulto";
        }
            System.out.println("categoria Adulto");

    }
}
