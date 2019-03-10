public class ControleFluxo2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 10 && idade <18 juvenil
        // idade >=18 Adulto

        int idade = 15;
        String status;


        status = idade <15 ? "infantil" : idade>=15 && idade <18 ? "Juvenil" : "Adulto";
        System.out.println(status);

    }
}
