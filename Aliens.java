//Antoine Sfeir
//CSC-1351, Brandt
//Final Project
package Space_Shooter;

import static Space_Shooter.Main.Alien1isDead;
import static Space_Shooter.Main.Alien2isDead;
import static Space_Shooter.Main.Alien3isDead;
import Space_Shooter.Attack.enemyMissile;
import basicgraphics.BasicFrame;
import basicgraphics.Clock;
import basicgraphics.Sprite;
import basicgraphics.SpriteCollisionEvent;
import basicgraphics.SpriteComponent;
import basicgraphics.Task;
import basicgraphics.images.Picture;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import basicgraphics.sounds.ReusableClip;

public class Aliens extends Sprite {

    public static Picture Alien1;
    public static Picture Alien2;
    public static Picture Alien3;
    public static Picture Alien5;
    Player p;
    public static Picture boom1;
    public static Picture boom2;
    public static Picture boom3;
    public static Picture boom4;
    public static Picture boom5;
    public static Picture black;

    public Aliens(SpriteComponent sc, Player p) {
        super(sc);
        this.p = p;
        boom1 = new Picture("EXPLOSION_1.png");
        boom2 = new Picture("EXPLOSION_2.png");
        boom3 = new Picture("EXPLOSION_3.png");
        boom4 = new Picture("EXPLOSION_4.png");
        boom5 = new Picture("EXPLOSION_5.png");
        
        BufferedImage bf = BasicFrame.createImage(50, 50);
        Graphics2D g = (Graphics2D) bf.getGraphics();
        g.setColor(Color.black);
        g.fillOval(0, 0, 50, 50);
        black = new Picture(bf);
        setPicture(black);
    }

    public static class AlienLVL1 extends Aliens {
        public static ReusableClip enemyShoot = new ReusableClip("EnemyShoot.wav");

        public AlienLVL1(SpriteComponent sc, Player p) {
            super(sc, p);
            BufferedImage bf = BasicFrame.createImage(20, 30);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            int H = bf.getHeight();
            int W = bf.getWidth();
            g.setColor(Color.white);
            int[] X = {W / 2, W, W, 0, 0};
            int[] Y = {0, H / 3, 2 * H / 3, 2 * H / 3, H / 3};
            g.fillPolygon(X, Y, 5);
            g.drawLine(0, 2 * H / 3, 0, H);
            g.drawLine(W - 1, 2 * H / 3, W - 1, H);
            Alien1 = new Picture(bf);
            setPicture(Alien1);
            setX(0);
            setY(H + 20);
            setVelX(1.5);
            setVelY(0);
                Task Shoot = new Task() {
                    @Override
                    public void run() {
                        if(Alien1isDead) { 
                            return;
                        }
                        double dx = p.getX() - getX();
                        if(dx < 200) {
                            if(iteration() % 100 == 0) {
                                shoot();
                            }
                        }
                    }
                };
                Clock.addTask(Shoot);            
        }    
        public void shoot() {
            Attack.bomb b = new Attack.bomb(getSpriteComponent());
            b.setCenterX(centerX());
            b.setCenterY(centerY());
            b.setVelX(0);
            b.setVelY(5);
        }
    }

    public static class AlienLVL2 extends Aliens {
        
        Random rand = new Random();

        public AlienLVL2(SpriteComponent sc, Player p) {
            super(sc,p);
            BufferedImage bf = BasicFrame.createImage(50, 50);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            int H = bf.getHeight();
            int W = bf.getWidth();
            g.setColor(Color.white);
            g.drawOval(0, H - 40, W - 10, H - 40);
            g.fillOval(0, H - 40, W - 10, H - 40);
            g.drawOval(10, 0, W - 30, 20);
            Alien2 = new Picture(bf);
            setPicture(Alien2);
            setX(300);
            setY(H + 20);
            setVelX(1);
                Task move = new Task() {
                    @Override
                    public void run() {
                        if(Alien2isDead) {
                            return;
                        }
                        if(rand.nextInt(100) == 0){
                            setVelX(-getVelX());
                        } 
                    }
                };
                Clock.addTask(move);
                Task Shoot = new Task() {
                    @Override
                    public void run() {
                        if(Alien2isDead) {
                            return;
                        }
                        if (iteration() % 750 != 0) {
                            return;
                        }
                        shoot();
                    }
                };
                Clock.addTask(Shoot);
            
        }
        public void shoot(){
            enemyMissile m = new enemyMissile(getSpriteComponent(), p);
            m.setCenterX(centerX());
            m.setCenterY(centerY());
        }
    }
    
    public static class AlienLVL3 extends Aliens {
        
        Random rand = new Random();
        
        public AlienLVL3(SpriteComponent sc, Player p) {
            super(sc, p);
            this.p = p;
            BufferedImage bf = BasicFrame.createImage(50, 50);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            int H = bf.getHeight();
            int W = bf.getWidth();
            g.drawOval(0, H - 40, W - 10, H - 40);
            g.fillOval(0, H - 40, W - 10, H - 40);
            g.drawOval(10, 0, W - 30, 20);
            Alien3 = new Picture(bf);
            BufferedImage bf2 = BasicFrame.createImage(50, 50);
            Graphics2D g2 = (Graphics2D) bf.getGraphics();
            setPicture(Alien3);
            setX(0);
            setY(0);
            setVelY(1);
            setVelX(1.25);

            Task move = new Task() {
               @Override
               public void run() {
                    if(Alien3isDead) {
                        return;
                    }
                    if(rand.nextInt(500) == 0){
                        setVelX(-getVelX());
                    }
                    if(getY() == 700) {
                        setY(0);
                    }
                }
            };
           Clock.addTask(move);
            Task Shoot = new Task() {
                @Override
                public void run() {
                    if(Alien3isDead) {
                        return;
                    }
                    if(getY() < 500) {
                        if(iteration() % 200 == 0) {
                            shoot();
                        }
                        if (getX() == p.getX()) {
                            shoot();
                        }
                        if(getX() == p.getX() - 100) {
                            shoot();
                        }
                        if(getX() == p.getX() + 100) {
                            shoot();
                        }
                    }
                }
            };
            Clock.addTask(Shoot);
        }
        
        public void shoot(){
            Attack.bomb b = new Attack.bomb(getSpriteComponent());
            b.setCenterX(centerX());
            b.setCenterY(centerY());
        }
    }
    public static class enemyLVL5 extends Aliens {

        public enemyLVL5(SpriteComponent sc, Player p) {
            super(sc, p);
            Alien5 = new Picture("weapon2.png");
            setPicture(Alien5);
            setY(0);
            setX(p.getX());
            Task Tracker = new Task() {
                @Override
                public void run() {
                    double dx = p.getX() - getX();
                    double dy = p.getY() - getY();
                    double r = Math.sqrt(dx * dx + dy * dy);
                    if (getY() > 575) {
                        setVelY(2);
                        setVelX(0);
                    }
                    else {
                        setVelX(dx / r);
                        setVelY(dy / r);
                    }
                }
            };
            Clock.addTask(Tracker);
        }
    }

    public void processEvent(SpriteCollisionEvent se) {
        SpriteComponent sc = getSpriteComponent();
        if(se.xlo) {
            setVelX(1.2);
        }
        if(se.xhi) {
            setVelX(-1.2);
        }
    }
}
