package tugas2.instrumen;

import tugas2.Instrumen;

import java.util.Random;

public class Bersenar implements Instrumen{
    private String name;
    private int volume;

    @Override
    public void play() {
        System.out.println(what() + " is being played with current volume " + adjust() + "dB");
    }

    @Override
    public String what() {
        return name;
    }

    @Override
    public int adjust() {
        Random rand = new Random();
        this.volume = rand.nextInt(10) + 1; // 1-10
        return volume;
    }

    public void setName(String string){
        this.name = string;
    }
}
