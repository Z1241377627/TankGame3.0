package com.hspedu.tankgame3_;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Vector;

public class Enemy extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();

    Vector<Enemy> enemies = new Vector<>();

    public Enemy(int x, int y, int direct) {
        super(x, y, direct);
    }

    public void setEnemies(Vector<Enemy> enemies) {
        this.enemies = enemies;
    }

    public boolean isTouchEnemy() {
        switch (getDirect()) {
            case 0:
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    if (enemy != this) {
                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 40 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemy.getX() &&
                                    this.getX() + 40 <= enemy.getX() + 40 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 60 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemy.getX() &&
                                    this.getX() + 40 <= enemy.getX() + 60 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    if (enemy != this) {
                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() + 60 >= enemy.getX() &&
                                    this.getX() + 60 <= enemy.getX() + 40 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemy.getX() &&
                                    this.getX() + 60 <= enemy.getX() + 40 &&
                                    this.getY() + 40 >= enemy.getY() &&
                                    this.getY() + 40 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() + 60 >= enemy.getX() &&
                                    this.getX() + 60 <= enemy.getX() + 60 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemy.getX() &&
                                    this.getX() + 60 <= enemy.getX() + 60 &&
                                    this.getY() + 40 >= enemy.getY() &&
                                    this.getY() + 40 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    if (enemy != this) {
                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 40 &&
                                    this.getY() + 60 >= enemy.getY() &&
                                    this.getY() + 60 <= enemy.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemy.getX() &&
                                    this.getX() + 40 <= enemy.getX() + 40 &&
                                    this.getY() + 60 >= enemy.getY() &&
                                    this.getY() + 60 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 60 &&
                                    this.getY() + 60 >= enemy.getY() &&
                                    this.getY() + 60 <= enemy.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemy.getX() &&
                                    this.getX() + 40 <= enemy.getX() + 60 &&
                                    this.getY() + 60 >= enemy.getY() &&
                                    this.getY() + 60 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    if (enemy != this) {
                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 40 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 40 &&
                                    this.getY() + 40 >= enemy.getY() &&
                                    this.getY() + 40 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //敌人x  x, x + 40,
                            //   y  y, y + 60
                            //我 x  x  x + 40
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 60 &&
                                    this.getY() >= enemy.getY() &&
                                    this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            if (this.getX() >= enemy.getX() &&
                                    this.getX() <= enemy.getX() + 60 &&
                                    this.getY() + 40 >= enemy.getY() &&
                                    this.getY() + 40 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }
    @Override
    public void run() {
        while (true) {

            if (loop && shots.size() < 5) {
                System.out.println("测试");
                Shot s = null;
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }

            switch (getDirect()) {
                case 0:
                    for (int i = 0; i <= 50; i++) {
                        if (getY() > 0 && ! isTouchEnemy()) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i <= 50; i++) {
                        if (getX() + 60 < 1000 && ! isTouchEnemy()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 50; i++) {
                        if (getY() + 60 < 750 && ! isTouchEnemy()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 50; i++) {
                        if (getX() > 0 && ! isTouchEnemy()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }
            setDirect((int) (Math.random() * 4));
            if (loop == false) {
                break;
            }
        }
    }
}
