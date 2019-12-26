package com.dukz.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kenny")
public class Instrumentalist implements Performer {
    @Value("method of Autowired")
    private String song;
    @Autowired
    @Qualifier("guiter")
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
