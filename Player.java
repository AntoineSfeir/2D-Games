//Antoine Sfeir
//CSC-1351, Brandt
//Final Project
package Space_Shooter;

import static Space_Shooter.Main.XtraShooterIsDead;

import basicgraphics.*;
import basicgraphics.images.Picture;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player extends Sprite {
    
    public static Picture playerS;
    public static Picture playerS2;
    public static Picture boom1;
    public static Picture boom2;
    public static Picture boom3;
    public static Picture boom4;
    public static Picture boom5;



    public Player(SpriteComponent sc) {
        super(sc);
        boom1 = new Picture("EXPLOSION_1.png");
        boom2 = new Picture("EXPLOSION_2.png");
        boom3 = new Picture("EXPLOSION_3.png");
        boom4 = new Picture("EXPLOSION_4.png");
        boom5 = new Picture("EXPLOSION_5.png");
    }
    
    public static class home extends Player {
        
        public Picture home;
    
        public home(SpriteComponent sc) {
            super(sc);
            home = new Picture("HOUSE.png");
            setPicture(home);
            setY(650);
        }
    }
    
    public static class player1 extends Player {
        
        public player1(SpriteComponent sc) {
            super(sc);
            playerS = new Picture("Player.png");
            setPicture(playerS);
            Dimension d = sc.getSize();
            setX(d.width / 2);
            setY(d.height - 100);
            setVelX(0);
            setVelY(0);
            
        }
    }
    
    public static class player2 extends Player {
        
        Random rand = new Random();
        
        public player2(SpriteComponent sc) {
            super(sc);
            playerS2 = new Picture("mfalcon.png");
            setPicture(playerS2);
            Dimension d = sc.getSize();
            setX((d.width / 2) - 100);
            setY(d.height - 100);
            setVelX(1.2);
            Task move = new Task() {
                @Override
                public void run() {
                    if(rand.nextInt(100) == 0){
                       setVelX(-getVelX());
                    }
                }
            };
            Clock.addTask(move);
            Task t = new Task() {
                public void run() {
                    if(XtraShooterIsDead) {
                        return;
                    }
                    if(iteration() % 200 == 0) {
                        shoot();
                    }
                }
            };
            Clock.addTask(t);
         }
        
         public void shoot() {
             Attack.player2Bullet b = new Attack.player2Bullet(getSpriteComponent());
             b.setVelX(0);
             b.setVelY(-5);
             b.setCenterX(centerX());
             b.setCenterY(centerY());
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
    
    public static class playerLives extends Player {
        
        public Picture playerLives;

        public playerLives(SpriteComponent sc) {
            super(sc);
            playerLives = new Picture("EXTRA_LIFE.png");
            setPicture(playerLives);
            setY(5);
        }
    }

    public static class barrier extends Player {

        public static Picture barrier;
        Random rand = new Random();
        public barrier(SpriteComponent sc) {
            super(sc);
            BufferedImage bf = BasicFrame.createImage(50, 10);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            g.setColor(Color.white);
            g.drawRect(0, 0, 50, 10);
            g.fillRect(0, 0, 50, 10);
            barrier = new Picture(bf);
            setPicture(barrier);
            setY(570);
            setX(300);
            setVelX(1.2);
            setVelY(0);
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
    
    @Override
    public void processEvent(SpriteCollisionEvent se) {
        SpriteComponent sc = getSpriteComponent();
        if (se.xlo) {
            setX(sc.getSize().width-getWidth());
        }
        if (se.xhi) {
            setX(0);
        }
    }
}
