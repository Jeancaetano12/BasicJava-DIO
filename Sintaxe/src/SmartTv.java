public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        // volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        // volume = volume - 1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void aumentarCanal(){
        // canal = canal + 1
        canal++;
    }
    public void diminuirCanal(){
        // canal = canal - 1
        canal--;
    }
    public void mudarCanal(int novoCanal){
        // usa o parametro para definir o canal
        canal = novoCanal;
    }
}
