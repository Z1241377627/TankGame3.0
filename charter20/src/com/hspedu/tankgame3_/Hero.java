package com.hspedu.tankgame3_;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Vector;

public class Hero extends Tank {

    Shot shot = null;;
    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y, int direct) {
        super(x, y, direct);
    }

    public void shotEnemyTank(){
        if (shots.size() == 5){
            return;
        }
        switch (getDirect()){
            case 0:
                shot = new Shot(getX() + 20, getY(), getDirect());
                break;
            case 1:
                shot = new Shot(getX() + 60, getY() + 20, getDirect());
                break;
            case 2:
                shot = new Shot(getX() + 20, getY() + 60, getDirect());
                break;
            case 3:
                shot = new Shot(getX(), getY() + 20, getDirect());
                break;
        }
        shots.add(shot);
        Thread thread = new Thread(shot);
        thread.start();
    }
}
