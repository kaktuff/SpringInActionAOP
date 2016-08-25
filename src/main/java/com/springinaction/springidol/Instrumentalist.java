package com.springinaction.springidol;

public class Instrumentalist implements Performer{
//    private String song;

    private Instrument instrument;

//    private int age;

    public Instrument getInstrument() {
        return instrument;
    }

//    public void setSong(String song) {
//        this.song = song;
//    }

//    public String getSong() {
//        return song;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }


    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrumentalist() {
    }

    public void perform() throws Exception {
//        System.out.print("Playing... " + song + ": ");
        instrument.play();
        System.out.println("instrument - " + instrument.toString());
    }
}