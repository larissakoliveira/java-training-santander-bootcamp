package tv.first;
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.err.println("Tv ligada " + smartTv.ligada);
        System.err.println("Canal atual " + smartTv.canal);
        System.err.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();

        System.err.println("Tv ligada " + smartTv.ligada);
        System.err.println("Canal atual " + smartTv.canal);
        System.err.println("Volume atual " + smartTv.volume);

        smartTv.mudarCanal(15);

        System.err.println("Canal atual " + smartTv.canal);


    }
}
