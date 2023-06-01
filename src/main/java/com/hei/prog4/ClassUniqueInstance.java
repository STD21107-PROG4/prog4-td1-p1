package com.hei.prog4;

public enum ClassUniqueInstance {

    INSTANCE("Initial class info");

    private String info;

    private ClassUniqueInstance(String info) {
        this.info = info;
    }

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }

}
