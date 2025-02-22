package SmartTV;

public class SmartTv {
    private boolean wifi = false;
    private boolean tvLigada = false;
    private int canal = 1;
    private int volume = 20;

    public void statusTv(){
        if(tvLigada == false){
            System.out.println("A Tv está desligada");
        }else {
            System.out.println("A Tv está ligada");
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        }
    }
    public void ligarDesligarTv(){
        if(tvLigada == false) {
            tvLigada = true;
            System.out.println("Você ligou a Tv.");
            System.out.println("Seja bem-vindo a Smart Tv");
        } else {
            tvLigada = false;
            System.out.println("Você desligou a Tv.");
            System.out.println("Obrigado por utilizar a Smart Tv, até mais.");
        }
    }
//    public void desligarTv(){
//        if(tvLigada == true){
//            tvLigada = false;
//            System.out.println("Você desligou a Tv.");
//            System.out.println("Obrigado por utilizar a Smart Tv, até mais.");
//        }else{
//            System.out.println("A Tv já está desligada.");
//        }
//    }
    public void aumentarVolume(){
        if(tvLigada == true){
            volume++;
            System.out.println("O volume atual é: " + volume);
        }else{
            System.out.println("Ligue a Tv para conseguir ajustar o volume.");
        }
    }
    public void diminuirVolume(){
        if(tvLigada == true){
            volume--;
            System.out.println("O volume atual é: " + volume);
        }else {
            System.out.println("Ligue a Tv para conseguir ajustar o volume.");
        }
    }
    public void mudarCanal(int canal) {
        if (tvLigada == true){
            this.canal = canal;
            System.out.println("O canal atual é: " + canal);
        }else {
            System.out.println("Ligue a Tv para conseguir escolher um canal.");
        }
    }
    public void ligarDesligarWifi(){
        if(wifi == false){
            wifi = true;
            System.out.println("O wifi está ligado.");
        }else {
            wifi = false;
            System.out.println("O wifi está desligado.");
        }
    }
    public void acessarAppStreaming(String app){
        if (tvLigada == true && wifi == true){
            switch (app){
                case "Netflix" :
                    System.out.println("Você acessou a Netflix");
                    System.out.println("Tenha um bom filme ou série...");
                    break;
                case "Prime Video" :
                    System.out.println("Você acessou a Prime Video");
                    System.out.println("Tenha um bom filme ou série...");
                    break;
                case "Disney+" :
                    System.out.println("Você acessou a Disney Plus");
                    System.out.println("Tenha um bom filme ou série...");
                    break;
                default:
                    System.out.println("Escolha um app valido em nosso sistema para poder acessar");
            }
        }else if(tvLigada == true && wifi == false){
            System.out.println("Ligue o wifi para poder acessar...");
        }else if(tvLigada == false && wifi == false){
            System.out.println("Ligue a Tv e se conecte com uma rede wifi para poder acessasr.");
        }
    }

}
