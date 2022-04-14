package com.company;

public class house {
    private int stories;
    private int windows;
    private String color;

    public house(){
        stories=1;
        windows=4;
        color="red";
    }

    public int getStories(){
        return stories;
    }

    public void setStories(int stories){
        this.stories=stories;
    }

    public int getWindows(){
        return windows;
    }

    public void setWindows(int windows){
        this.windows=windows;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}
