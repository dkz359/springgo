package com.dukz.pojo;

public class PoeticJuggler extends Juggler {
    //诗歌属性
    private Poem poem;
    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags,Poem poem) {
        //继承豆袋子属性
        super(beanBags);
        this.poem = poem;
    }
    public void perform(){
        //继承扔袋子技能
        super.perform();
        System.out.println("边朗诵...");
        //朗诵诗歌
        poem.recite();
    }
}
