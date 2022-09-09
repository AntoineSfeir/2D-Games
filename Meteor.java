//Antoine Sfeir
//CSC-1351, Brandt
//Final Project
package Space_Shooter;

import basicgraphics.BasicFrame;
import basicgraphics.Clock;
import basicgraphics.Sprite;
import basicgraphics.SpriteComponent;
import basicgraphics.Task;
import basicgraphics.images.Picture;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Meteor extends Sprite {

    public static Picture boom1;
    public static Picture boom2;
    public static Picture boom3;
    public static Picture boom4;
    public static Picture boom5;
    final static double INCR = (Math.PI * 2 / 200.0);

    public Meteor(SpriteComponent sc) {
        super(sc);
        boom1 = new Picture("EXPLOSION_1.png");
        boom2 = new Picture("EXPLOSION_2.png");
        boom3 = new Picture("EXPLOSION_3.png");
        boom4 = new Picture("EXPLOSION_4.png");
        boom5 = new Picture("EXPLOSION_5.png");
    }

    public static class meteorFast extends Meteor {

        public Picture meteorFast;

        public meteorFast(SpriteComponent sc) {
            super(sc);
            meteorFast = new Picture("ROCK.png");
            setPicture(meteorFast);
            //           rand.setSeed(10);
            setX(0);
            setY(0);
            setVelX(0);
            setVelY(1.25);
            Task t = new Task(){
                @Override
                public void run() {
                    turn(INCR);
                }
                
            };
            Clock.addTask(t);
        }
        
        double heading = 0;
        
        public void turn(double incr) {
            heading += incr;
            setPicture(meteorFast.rotate(heading));
        }
    }
    
    public static class meteorSlow extends Meteor {

        public Picture meteorSlow;

        public meteorSlow(SpriteComponent sc) {
            super(sc);
            meteorSlow = new Picture("ROCKBIG.png");
            setPicture(meteorSlow);
            setVelX(0);
            setVelY(1);
            Task t = new Task(){
                @Override
                public void run() {
                    turn(-INCR);
                }
                
            };
            Clock.addTask(t);
        }
        
        double heading = 0;
        
        public void turn(double incr) {
            heading += incr;
            setPicture(meteorSlow.rotate(heading));
        }
    }

    public static class Asteroid extends Meteor {
        
        public Picture asteriod;
        
        public Asteroid(SpriteComponent sc) {
            super(sc);
            BufferedImage bf = BasicFrame.createImage(50, 100);
            Graphics2D g = (Graphics2D) bf.getGraphics();
            g.setColor(Color.white);
            g.fillOval(0, 0, 25, 100);
            asteriod = new Picture(bf);
            setPicture(asteriod);
            setY(0);
        }
    }
}