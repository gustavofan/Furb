public class carro {

    public static void main(String[] args) {

        String modelo = "corsa";
        int tanque = 44;
        double kmrodado = 448.8;

         double mediaconsumo = kmrodado / tanque;
         mediaconsumo = Math.round(mediaconsumo * 100.0) / 100.0;

         System.out.println("o modelo do seu carro é um " + modelo + ", e a média de consumo é de " + mediaconsumo);


    }

}