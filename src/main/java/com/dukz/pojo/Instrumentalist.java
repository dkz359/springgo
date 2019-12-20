package com.dukz.pojo;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist(){

    }

    @Override
    public void perform() {
        System.out.println("唱："+song);
        instrument.play();
    }

    public String screamSong(){
        return song;
    }

    public String getSong(){
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument(){
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
