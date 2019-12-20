package com.dukz.pojo;

public class Stage {
    private Stage(){

    }

    public static class stageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return stageSingletonHolder.instance;
    }

    public void createStage(){
        System.out.println("创造一个舞台");
    }
}
