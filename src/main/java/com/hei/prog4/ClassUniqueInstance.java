package com.hei.prog4;

public enum ClassUniqueInstance {

    INSTANCE(1);

    private int click;

    private ClassUniqueInstance(int info) {
        this.click = info;
    }

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
