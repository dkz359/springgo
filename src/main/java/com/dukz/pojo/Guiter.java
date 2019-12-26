package com.dukz.pojo;

import org.springframework.stereotype.Component;

@Component
public class Guiter implements Instrument {
    @Override
    public void play() {
        System.out.println("弹奏吉他。。。");
    }
}
