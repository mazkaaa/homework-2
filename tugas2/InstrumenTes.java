package tugas2;

import tugas2.instrumen.Bersenar;
import tugas2.instrumen.Perkusi;
import tugas2.instrumen.Tiup;

public class InstrumenTes {

    public static void main(String args[]){
        Tiup tiup = new Tiup();
        Perkusi perkusi = new Perkusi();
        Bersenar bersenar = new Bersenar();

        tiup.setName("suling");
        tiup.play();
        delay();
        perkusi.setName("drum");
        perkusi.play();
        delay();
        bersenar.setName("gitar");
        bersenar.play();

    }

    public static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
