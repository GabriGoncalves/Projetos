package SmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.statusTv();
        tv.ligarDesligarTv();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mudarCanal(4);
        tv.acessarAppStreaming("Prime Video");
        tv.ligarDesligarWifi();
        tv.acessarAppStreaming("Globo Play");
        tv.acessarAppStreaming("Netflix");
        tv.ligarDesligarWifi();
        tv.ligarDesligarTv();
    }
}
