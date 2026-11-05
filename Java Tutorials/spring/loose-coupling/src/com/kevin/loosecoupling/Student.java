package com.kevin.loosecoupling;



public class Student {
    private int id;
    private CheatSheet cheat;
    public void setId(int id){
        this.id = id;
    }
    public void setCheat(CheatSheet cheatSheet){
        this.cheat = cheatSheet;
    }
    public void displayCheat(){
        cheat.cheat();
    }
}
