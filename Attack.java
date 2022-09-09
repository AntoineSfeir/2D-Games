//Antoine Sfeir
//CSC-1351, Brandt
//Final Project
package Space_Shooter;

import basicgraphics.*;
import basicgraphics.images.Picture;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Attack extends Sprite {
    
    Player p;
    public static Picture boom1;
    public static Picture boom2;
    public static Picture boom3;
    public static Picture boom4;
    public static Picture boom5;

    public Attack(SpriteComponent sc) {
        super(sc);
        boom1 = new Picture("EXPLOSION_1.png");
        boom2 = new Picture("EXPLOSION_2.png");
        boom3 = new Picture("EXPLOSION_3.png");
        boom4 = new Picture("EXPLOSION_4.png");
        boom5 = new Picture("EXPLOSION_5.png");
    }
    
    public static class invisibleCursor extends Attack {
        
        public Picture cursor;
        
        public invisibleCursor(SpriteComponent sc) {
            super(sc);
            BufferedImage bf = BasicFrame.createImage(10, 10);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            g.setColor(Color.black);
            g.drawOval(0, 0, 10, 10);
            cursor = new Picture(bf);
            setPicture(cursor);
            setY(0);
            setX(0);
            setVelX(0.5);
            Task t = new Task() {
                @Override 
                public void run() {
                    if(getX() == 600) {
                        setVelX(-getVelX());
                    }
                    else if(getX() == 0) {
                        setVelX(0.5);
                    }
                }
            };
            Clock.addTask(t);
        }
        
    }

    public static class playerBullet extends Attack {

        public Picture bullet;

        public playerBullet(SpriteComponent sc) {
            super(sc);
            bullet = new Picture("BULLET.png");
            setPicture(bullet);
        }
    }

    public static class player2Bullet extends Attack {

        public Picture Beam;

        public player2Bullet(SpriteComponent sc) {
            super(sc);
            BufferedImage bf = BasicFrame.createImage(10, 10);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            g.setColor(Color.white);
            g.fillOval(0, 0, 10, 10);
            Beam = new Picture(bf);
            setPicture(Beam);
        }
    }

    public static class enemyMissile extends Attack {

        public Picture Missile;

        public enemyMissile(SpriteComponent sc, Player p) {
            super(sc);
            this.p = p;
            BufferedImage bf2 = BasicFrame.createImage(10, 10);
            Graphics2D g2 = (Graphics2D) bf2.getGraphics();
            int H2 = bf2.getHeight();
            int W2 = bf2.getWidth();
            g2.setColor(Color.white);
            int[] X2 = {W2 / 2, W2, W2, 0, 0};
            int[] Y2 = {0, H2 / 3, 2 * H2 / 3, 2 * H2 / 3, H2 / 3};
            g2.fillPolygon(X2, Y2, 5);
            g2.drawLine(0, -2 * H2 / 3, 0, H2/2);
            g2.drawLine(W2 - 1, -2 * H2 / 3, W2 - 1, H2/2);
            g2.setColor(Color.white);
            int[] A = {W2 / 4, W2 / 2, 3 * W2 / 4};
            int[] B = {2 * H2 / 3, H2, 2 * H2 / 3};
            g2.fillPolygon(A, B, 3);
            Missile = new Picture(bf2);
            setPicture(Missile);
            setVelY(1);
             //Tracks Player
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
    
    public static class Shield extends Attack {
        
        public Picture shieldActive;        
        
        public Shield(SpriteComponent sc, Player p) {
            super(sc);
            this.p = p;
            BufferedImage bf = BasicFrame.createImage(40, 40);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            g.setColor(Color.white);
            g.drawOval(0, 0, 40, 40);
            shieldActive = new Picture(bf);
            setPicture(shieldActive);
            setCenterX(p.centerX());
            setCenterY(p.centerY());
            Task t = new Task() {
                @Override
                public void run() {
                    setVelX(p.getVelX());
                }                
            };
            Clock.addTask(t);
        }
    }
    
    public static class bomb extends Attack {
        
        public static Picture bomb;
        
        public bomb(SpriteComponent sc) {
            super(sc);
            BufferedImage bf = BasicFrame.createImage(50, 50);
            Graphics2D g = (Graphics2D) bf.getGraphics();                
            g.setColor(Color.white);                
            g.fillOval(0, 0, 10, 20);
            g.fillRect(-4, -5, 15, 10);
            setVelY(1);
            bomb = new Picture(bf);
            setPicture(bomb);
        }
    }
    
    public static class ShieldDrop extends Attack {
        
        public Picture shieldDrop;
        
        public ShieldDrop(SpriteComponent sc) {
            super(sc);
            shieldDrop = new Picture("SHIELD.png");
            setPicture(shieldDrop);
            setY(0);
            setVelY(1);
        }
    }
    
    public static class xtraShooter extends Attack {
        
        public static Picture powerUP;
        
        public xtraShooter(SpriteComponent sc) {
            super(sc);
            powerUP = new Picture("EXTRA_LIFE.png");
            setPicture(powerUP);
            setY(0);
            setVelY(1);
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
