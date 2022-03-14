package com.nickuli.test;

public class My {

    private Wolf wolfVar = null;

    public My(Wolf wolfVar) {
    }

    public void printWow() {
        wolfVar.wow();
    }

    public Wolf getWolfVar() {
        return wolfVar;
    }

    public void setWolfVar(Wolf wolfVar) {
        this.wolfVar = wolfVar;
    }
}
