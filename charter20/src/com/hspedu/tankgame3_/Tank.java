package com.hspedu.tankgame3_;

public class Tank {
    private int x;
    private int y;
    private int direct;
    boolean loop = true;

    public Tank(int x, int y, int direct, boolean loop) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.loop = loop;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void moveUp(){
        y -= 1;
    }
    public void moveRight(){
        x += 1;
    }
    public void moveDown(){
        y += 1;
    }
    public void moveLeft(){
        x -= 1;
    }

}
