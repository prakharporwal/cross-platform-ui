package org.ui.cross.platform.widgets;

public class Widget {
    private String name;
    Widget(String name){
        this.name= name;
    }
    public void render(){
        System.out.println(this.name);
    }
}
