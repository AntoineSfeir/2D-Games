//Antoine Sfeir
//CSC-1351, Brandt
//Final Project
package Space_Shooter;

import Space_Shooter.Aliens.AlienLVL3;
import Space_Shooter.Attack.playerBullet;
import Space_Shooter.Meteor.meteorFast;
import Space_Shooter.Meteor.meteorSlow;
import Space_Shooter.Player.home;
import Space_Shooter.Player.player1;
import Space_Shooter.Player.playerLives;
import basicgraphics.*;
import basicgraphics.sounds.ReusableClip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
public class Main  {
    public static int WIDTH = 600;
    public static int numDestroyedMeteors = 0;
    public static int Score = 0;
    public static int numShield = 0;
    public static int numLives = 3;
    public static int numHomes = 10;
    private static int numPowerUp = 0;
    private static int numLVL = 1;
    public static boolean Alien1isDead = false;
    public static boolean Alien2isDead = false;
    public static boolean Alien3isDead = false;
    public static boolean XtraShooterIsDead = false;

    public static boolean endlessLVLOn = false;
    
    public static void LVL1(SpriteComponent sc, Player p, Attack.invisibleCursor c) {
        Aliens.AlienLVL1 A1 = new Aliens.AlienLVL1(sc, p);
        Task Spawn1 = new Task() {
            @Override
            public void run() {
                if(Score > 250) {
                    return;
                }
                if(c.getX() == WIDTH - 500) {
                    meteorSlow ms_1 = new meteorSlow(sc);
                    ms_1.setX(50);
                    ms_1.setVelY(0.75);
                    meteorSlow ms_3 = new meteorSlow(sc);
                    ms_3.setX(100);
                    ms_3.setVelY(1);
                }
                if(c.getX() == WIDTH - 400) {
                    meteorSlow ms = new meteorSlow(sc);
                    ms.setX(300);
                    ms.setVelY(1);
                    meteorSlow ms_5 = new meteorSlow(sc);
                    ms_5.setX(400);
                    ms_5.setVelY(0.75);
                }
                if(c.getX() == WIDTH - 300) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(150);
                    ms_2.setVelY(0.75);
                    meteorSlow ms_8 = new meteorSlow(sc);
                    ms_8.setX(250);
                    ms_8.setVelY(1);
                } 
                if(c.getX() == WIDTH - 200) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(200);
                    ms_2.setVelY(0.75);
                    meteorSlow ms_4 = new meteorSlow(sc);
                    ms_4.setX(450);
                    ms_4.setVelY(1);                
                } 
                if(c.getX() == WIDTH - 100) {
                    meteorSlow ms_6 = new meteorSlow(sc);
                    ms_6.setX(350);
                    ms_6.setVelY(0.75);
                    meteorSlow ms_7 = new meteorSlow(sc);
                    ms_7.setX(500);
                    ms_7.setVelY(1);
                }
            }
        };
        Clock.addTask(Spawn1); 
    }
    
    public static void LVL2(SpriteComponent sc, Player p, Attack.invisibleCursor c){
        Aliens.AlienLVL2 A2 = new Aliens.AlienLVL2(sc, p);
        Task Spawn1 = new Task() {
            @Override
            public void run() {
                if(Score > 500) {
                    return;
                }
                if(c.getX() == WIDTH - 500) {
                    meteorFast mf_1 = new meteorFast(sc);
                    mf_1.setX(50);
                    mf_1.setVelY(1.2);
                    meteorSlow ms_3 = new meteorSlow(sc);
                    ms_3.setX(100);
                    ms_3.setVelY(0.75);
                }
                if(c.getX() == WIDTH - 400) {
                    meteorSlow ms = new meteorSlow(sc);
                    ms.setX(300);
                    ms.setVelY(0.75);
                    meteorFast mf_5 = new meteorFast(sc);
                    mf_5.setX(400);
                    mf_5.setVelY(1.2);
                }
                if(c.getX() == WIDTH - 300) {
                    meteorFast mf_2 = new meteorFast(sc);
                    mf_2.setX(150);
                    mf_2.setVelY(1.20);
                    meteorSlow ms_8 = new meteorSlow(sc);
                    ms_8.setX(250);
                    ms_8.setVelY(0.75);
                } 
                if(c.getX() == WIDTH - 200) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(200);
                    ms_2.setVelY(0.75);
                    meteorFast mf_4 = new meteorFast(sc);
                    mf_4.setX(450);
                    mf_4.setVelY(1);                
                } 
                if(c.getX() == WIDTH - 100) {
                    meteorFast mf_6 = new meteorFast(sc);
                    mf_6.setX(350);
                    mf_6.setVelY(1.20);
                    meteorSlow ms_7 = new meteorSlow(sc);
                    ms_7.setX(500);
                    ms_7.setVelY(0.75);
                }
            }
        };
        Clock.addTask(Spawn1);
    }
    
    public static void LVL3(SpriteComponent sc, Player p, Attack.invisibleCursor c){
        AlienLVL3 A3 = new AlienLVL3(sc, p);
        Task Spawn1 = new Task() {
            @Override
            public void run() {
                if(Score > 750) {
                    return;
                }
                if(c.getX() == WIDTH - 500) {
                    meteorFast mf_1 = new meteorFast(sc);
                    mf_1.setX(50);
                    mf_1.setVelY(1.2);
                    meteorSlow ms_3 = new meteorSlow(sc);
                    ms_3.setX(100);
                    ms_3.setVelY(1);
                }
                if(c.getX() == WIDTH - 400) {
                    meteorSlow ms = new meteorSlow(sc);
                    ms.setX(300);
                    ms.setVelY(1);
                    meteorFast mf_5 = new meteorFast(sc);
                    mf_5.setX(400);
                    mf_5.setVelY(1.2);
                }
                if(c.getX() == WIDTH - 300) {
                    meteorFast mf_2 = new meteorFast(sc);
                    mf_2.setX(150);
                    mf_2.setVelY(1.20);
                    meteorSlow ms_8 = new meteorSlow(sc);
                    ms_8.setX(250);
                    ms_8.setVelY(1);
                } 
                if(c.getX() == WIDTH - 200) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(200);
                    ms_2.setVelY(1);
                    meteorFast mf_4 = new meteorFast(sc);
                    mf_4.setX(450);
                    mf_4.setVelY(1.20);                
                } 
                if(c.getX() == WIDTH - 100) {
                    meteorFast mf_6 = new meteorFast(sc);
                    mf_6.setX(350);
                    mf_6.setVelY(1.20);
                    meteorSlow ms_7 = new meteorSlow(sc);
                    ms_7.setX(500);
                    ms_7.setVelY(1);
                    AlienLVL3 A3_1 = new AlienLVL3(sc, p);
                    A3_1.setVelX(-1.25);
                    A3_1.setX(600);
                }                
            }
        };
        Clock.addTask(Spawn1);
    }
    
    public static void LVL4(SpriteComponent sc, Attack.invisibleCursor c, Player.player1 p) {
        Task Spawn1 = new Task() {
            @Override
            public void run() {
                if(Score >= 1000) {
                    return;
                }
                if(c.getX() == WIDTH - 500) {
                    AlienLVL3 A3_1 = new AlienLVL3(sc, p);
                    Meteor.Asteroid MA_1 = new Meteor.Asteroid(sc);
                    MA_1.setX(50);
                    MA_1.setVelY(1.7);
                    meteorSlow ms_3 = new meteorSlow(sc);
                    ms_3.setX(100);
                    ms_3.setVelY(1);
                }
                if(c.getX() == WIDTH - 400) {
                    meteorSlow ms = new meteorSlow(sc);
                    ms.setX(300);
                    ms.setVelY(1);
                    Meteor.Asteroid MA_5 = new Meteor.Asteroid(sc);
                    MA_5.setX(400);
                    MA_5.setVelY(1.7);
                }
                if(c.getX() == WIDTH - 300) {
                    Meteor.Asteroid MA_9 = new Meteor.Asteroid(sc);
                    MA_9.setX(150);
                    MA_9.setVelY(1.7);
                    meteorSlow ms_8 = new meteorSlow(sc);
                    ms_8.setX(250);
                    ms_8.setVelY(1);
                } 
                if(c.getX() == WIDTH - 200) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(200);
                    ms_2.setVelY(1);
                    Meteor.Asteroid MA_4 = new Meteor.Asteroid(sc);
                    MA_4.setX(450);
                    MA_4.setVelY(1.7);          
                } 
                if(c.getX() == WIDTH - 100) {
                    Meteor.Asteroid MA_6 = new Meteor.Asteroid(sc);
                    MA_6.setX(350);
                    MA_6.setVelY(1.7);
                    meteorSlow ms_7 = new meteorSlow(sc);
                    ms_7.setX(500);
                    ms_7.setVelY(1);
                    AlienLVL3 A3_2 = new AlienLVL3(sc, p);
                    A3_2.setX(WIDTH);
                    A3_2.setVelX(-1.25);
                }
            }
        };
        Clock.addTask(Spawn1);
    }
    
    public static void endlessLVL5(SpriteComponent sc, Attack.invisibleCursor c,  Player.player1 p){
        Task Spawn1 = new Task() {
            @Override
            public void run() {
                if(!endlessLVLOn) {
                    return;
                }
                if(c.getX() == WIDTH - 500) {
                    Aliens.enemyLVL5 A5_1 = new Aliens.enemyLVL5(sc, p);
                    Meteor.Asteroid MA_1 = new Meteor.Asteroid(sc);
                    MA_1.setX(p.getX());
                    MA_1.setVelY(2);
                    meteorSlow ms_3 = new meteorSlow(sc);
                    ms_3.setX(100);
                    ms_3.setVelY(1.2);
                }
                if(c.getX() == WIDTH - 400) {
                    meteorSlow ms = new meteorSlow(sc);
                    ms.setX(300);
                    ms.setVelY(1.2);
                    Meteor.Asteroid MA_5 = new Meteor.Asteroid(sc);
                    MA_5.setX(p.getX());
                    MA_5.setVelY(2);
                }
                if(c.getX() == WIDTH - 300) {
                    Aliens.enemyLVL5 A5_3 = new Aliens.enemyLVL5(sc, p);
                    Meteor.Asteroid MA_9 = new Meteor.Asteroid(sc);
                    MA_9.setX(p.getX());
                    MA_9.setVelY(2);
                    meteorSlow ms_8 = new meteorSlow(sc);
                    ms_8.setX(250);
                    ms_8.setVelY(1.2);
                }
                if(c.getX() == WIDTH - 200) {
                    meteorSlow ms_2 = new meteorSlow(sc);
                    ms_2.setX(200);
                    ms_2.setVelY(1.2);
                    Meteor.Asteroid MA_4 = new Meteor.Asteroid(sc);
                    MA_4.setX(450);
                    MA_4.setVelY(2);
                }
                if(c.getX() == WIDTH - 100) {
                    Aliens.enemyLVL5 A5_5 = new Aliens.enemyLVL5(sc, p);
                    Meteor.Asteroid MA_6 = new Meteor.Asteroid(sc);
                    MA_6.setX(p.getX());
                    MA_6.setVelY(2);
                    meteorSlow ms_7 = new meteorSlow(sc);
                    ms_7.setX(500);
                    ms_7.setVelY(1.2);
                }
            }
        };
        Clock.addTask(Spawn1);
    }


    public static void main(String[] args) throws IOException {
        final ReusableClip shoot = new ReusableClip("BULLET_3.wav");
        final ReusableClip powerUp = new ReusableClip("PICKUP_1.wav");
        final ReusableClip powerUp1 = new ReusableClip("1up.wav");
        final ReusableClip powerOff = new ReusableClip("POWER_OFF.wav");
        final ReusableClip boom = new ReusableClip("DESTROY_3.wav");
        final ReusableClip start = new ReusableClip("START_1.wav");
        final ReusableClip dead = new ReusableClip("playerDies.wav");
        final ReusableClip dead2 = new ReusableClip("DESTROY_1.wav");
        final ReusableClip enemyDead = new ReusableClip("DESTROY_2.wav");
        final BasicFrame bf = new BasicFrame("Star Fighter");
        final Container content = bf.getContentPane();
        final CardLayout cards = new CardLayout();
        content.setLayout(cards);
        BasicContainer bc1 = new BasicContainer();
        content.add(bc1, "Splash");
        final BasicContainer bc2 = new BasicContainer();
        content.add(bc2, "Game");
        final SpriteComponent sc = new SpriteComponent() {
            int count = 0;
            @Override
            public void paintBackground(Graphics g) {
                Dimension d = getSize();
                g.setColor(Color.black);
                g.fillRect(0, 0, d.width, d.height);
                final int STARS = 50;
                Random rand = new Random(count++ / 20);
                g.setColor(Color.white);
                for (int i = 0; i < STARS; i++) {
                    int diameter = rand.nextInt(5);
                    int xpos = rand.nextInt(d.width);
                    int ypos = rand.nextInt(d.height);
                    g.fillOval(xpos, ypos, diameter, diameter);
                }
                Score(g);
            }
        };
        sc.setPreferredSize(new Dimension(600, 700));
        String[][] splashLayout = {
            {"Title"},
            {"Author"},
            {"Button"},
            {"Button1"}
        };
        bc1.setStringLayout(splashLayout);
        bc1.add("Title", new JLabel("Space Defender"));
        bc1.add("Author", new JLabel("By: Antoine Sfeir"));
        JButton jstart = new JButton("Start");
        JButton jquit = new JButton("Quit");
        jquit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cards.show(content, "Game");
                bc2.requestFocus();
                // Start the timer
                Clock.start(10);
            }
        });
        bc1.add("Button", jstart);
        bc1.add("Button1", jquit);
        String[][] layout = {{
            "Space Defender"
        }};
        bc2.setStringLayout(layout);
        bc2.add("Space Defender", sc);
        bf.show();
        //Player
        player1 p = new player1(sc);
        start.play();
        //PlayerLives
        playerLives pl1 = new playerLives(sc);
        pl1.setX(25);
        playerLives pl2 = new playerLives(sc);
        pl2.setX(50);
        playerLives pl3 = new playerLives(sc);
        pl3.setX(75);
        //Homes
        home h1 = new home(sc);
        h1.setX(50);
        home h2 = new home(sc);
        h2.setX(100);
        home h3 = new home(sc);
        h3.setX(150);
        home h4 = new home(sc);
        h4.setX(200);
        home h5 = new home(sc);
        h5.setX(250);
        home h6 = new home(sc);
        h6.setX(300);
        home h7 = new home(sc);
        h7.setX(350);
        home h8 = new home(sc);
        h8.setX(400);
        home h9 = new home(sc);
        h9.setX(450);
        home h10 = new home(sc);
        h10.setX(500);
        Attack.invisibleCursor c = new Attack.invisibleCursor(sc);
        LVL1(sc, p, c);
        bc2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    p.setVelX(1.75);
                } else 
                if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    p.setVelX(-1.75);
                } else 
                if (ke.getKeyChar() == ' ') {
                    playerBullet b = new playerBullet(sc);
                    b.setVelX(0);
                    b.setVelY(-5);
                    b.setCenterX(p.centerX());
                    b.setCenterY(p.centerY());
                    shoot.play();
                }
            }
            @Override
            public void keyReleased(KeyEvent K) {
                if(K.getKeyChar() == ' ') {
                    return;
                }
                p.setVelX(0);
            }
        });
        Clock.addTask(sc.moveSprites());
        //Collision detectors//MeteorxPlayerBullet
        sc.addSpriteSpriteCollisionListener(Meteor.class, playerBullet.class,
            (Meteor sp1, playerBullet sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Meteor.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Meteor.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Meteor.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Meteor.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Meteor.boom5);                            
                        }
                    }
                };
                Clock.addTask(explosion);                
                Task goAway = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            sp1.setActive(false);
                            Score += 10;
                            numDestroyedMeteors++;
                            if(Score == 250) {
                                LVL2(sc, p, c);
                                numLVL++;
                            }
                            if(Score == 500) {
                                LVL3(sc, p, c);
                                numLVL++;
                            }
                            if(Score == 750) {
                                LVL4(sc, c, p);
                                numLVL++;
                            }
                            if(Score >= 1000) {
                                endlessLVLOn = true;
                            }
                            if(Score == 1000) {
                                endlessLVL5(sc, c, p);
                                numLVL++;
                            }
                            if(numDestroyedMeteors % 15 == 0) {
                                Attack.ShieldDrop SD = new Attack.ShieldDrop(sc);
                                SD.setX(WIDTH / 3);
                                numShield++;
                                if(numShield % 2 == 0) {
                                    SD.setX(WIDTH - 200);
                                    SD.setY(0);
                                }
                                else 
                                if(numShield % 3 == 0) {
                                    SD.setX(WIDTH / 2);
                                    SD.setY(0);
                                }
                            }
                            if(numDestroyedMeteors % 25 == 0) {
                                Attack.xtraShooter SD = new Attack.xtraShooter(sc);
                                SD.setX(WIDTH / 3);
                                numPowerUp++;
                                if(numPowerUp % 2 == 0) {
                                    SD.setX(WIDTH - 200);
                                    SD.setY(0);
                                }
                                else 
                                if(numPowerUp % 3 == 0) {
                                    SD.setX(WIDTH / 2);
                                    SD.setY(0);
                                }
                            }
                            sp2.setActive(false);                            
                        }
                    }
                };
                Clock.addTask(goAway);
                sp2.setActive(false);
                boom.play();
            });
        //AlienLVL1xPlayerBullet
        sc.addSpriteSpriteCollisionListener(Aliens.AlienLVL1.class, Attack.playerBullet.class,
            (Aliens.AlienLVL1 sp1, Attack.playerBullet sp2) -> {
                Score += 20;
                Player.barrier b1 = new Player.barrier(sc);
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Aliens.boom1);   
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Aliens.boom2); 
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Aliens.boom3);   
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Aliens.boom4);  
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Aliens.boom5);
                        }
                        if(iteration() < 60) {
                            sp1.setPicture(Aliens.black);
                            Alien1isDead = true;
                        }
                        if(iteration() > 70) {
                        sp1.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);
                sp2.setActive(false);
                enemyDead.play();
        });
        //AlienLVL2xPlayerBullet
        sc.addSpriteSpriteCollisionListener(Aliens.AlienLVL2.class, Attack.playerBullet.class,
            (Aliens.AlienLVL2 sp1, Attack.playerBullet sp2) -> {
                Player.barrier b2 = new Player.barrier(sc);
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Aliens.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Aliens.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Aliens.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Aliens.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Aliens.boom5);
                        }
                        if(iteration() < 60) {
                            sp1.setPicture(Aliens.black);
                            Alien2isDead = true;
                        }
                        if(iteration() > 70) {
                            sp1.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);   
                sp2.setActive(false);
                enemyDead.play();
            });
        //AlienLVL3xPlayerBullet
        sc.addSpriteSpriteCollisionListener(Aliens.AlienLVL3.class, Attack.playerBullet.class,
            (Aliens.AlienLVL3 sp1, Attack.playerBullet sp2) -> {
                Score += 20;
                Player.barrier b3 = new Player.barrier(sc);
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Aliens.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Aliens.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Aliens.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Aliens.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Aliens.boom5);
                        }
                        if(iteration() < 60) {
                            Alien3isDead = true;
                        }
                        if(iteration() > 60) {
                            sp1.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);
                sp2.setActive(false);
                enemyDead.play();
        });
        //PlayerBulletxEnemyLVL5
        sc.addSpriteSpriteCollisionListener(Aliens.enemyLVL5.class, Attack.playerBullet.class,
                (Aliens.enemyLVL5 sp1, Attack.playerBullet sp2) -> {
                    Score += 20;
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp1.setPicture(Aliens.boom1);
                            }
                            if(iteration() < 20) {
                                sp1.setPicture(Aliens.boom2);
                            }
                            if(iteration() < 30) {
                                sp1.setPicture(Aliens.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Aliens.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Aliens.boom5);
                            }
                            if(iteration() < 60) {
                                sp1.setPicture(Aliens.black);
                            }
                            if(iteration() > 60) {
                                sp1.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    sp2.setActive(false);
                });
        //PlayerxEnemyMissile
        sc.addSpriteSpriteCollisionListener(player1.class, Attack.enemyMissile.class,
            (player1 sp1, Attack.enemyMissile sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() == 80) {
                            sp1.setPicture(Player.playerS);
                            sp1.setX(WIDTH / 2);
                            numLives--;
                        }
                        if(numLives == 2) {
                            pl1.setActive(false);
                        }
                        if(numLives == 1) {
                            pl2.setActive(false);
                        }
                        if(numLives == 0) {
                            pl3.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);   
                Task t = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            if(numLives == 0) {
                                sp1.setActive(false);
                                pl3.setActive(false);
                                JOptionPane.showMessageDialog(sc, "Mission Failed!. We will " +
                                        "get em next time \n SCORE: " + Score +
                                    "\n Press Ok to exist");
                                System.exit(0);
                                if(Score >= 1000) {
                                    JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                            " \n SCORE: " + Score +  "\n Press Ok to exist");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                };
                Clock.addTask(t);
                sp2.setActive(false);
                dead.play();
            });
        //PlayerxAlienLVL3
        sc.addSpriteSpriteCollisionListener(Player.player1.class, Aliens.AlienLVL3.class,
                (Player.player1 sp1, Aliens.AlienLVL3 sp2) -> {
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp1.setPicture(Player.boom1);
                            }
                            if(iteration() < 20) {
                                sp1.setPicture(Player.boom2);
                            }
                            if(iteration() < 30) {
                                sp1.setPicture(Player.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Player.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Player.boom5);
                            }
                            if(iteration() == 80) {
                                sp1.setPicture(Player.playerS);
                                sp1.setX(WIDTH / 2);
                                numLives--;
                            }
                            if(numLives == 2) {
                                pl1.setActive(false);
                            }
                            if(numLives == 1) {
                                pl2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    Task t = new Task(5) {
                        @Override
                        public void run() {
                            if (iteration() == maxIteration()) {
                                if(numLives == 0) {
                                    sp1.setActive(false);
                                    pl3.setActive(false);
                                    JOptionPane.showMessageDialog(sc, "Mission Failed!. We will "
                                            + " get em next time \n SCORE: " + Score +
                                            "\n Press Ok to exist");
                                    System.exit(0);
                                    if(Score >= 1000) {
                                        JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                                " \n SCORE: " + Score +  "\n Press Ok to exist");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    };
                    Clock.addTask(t);
                    sp2.setActive(false);
                    dead.play();
                });
        //PlayerxEnemyLVL5
        sc.addSpriteSpriteCollisionListener(Player.player1.class, Aliens.enemyLVL5.class,
            (Player.player1 sp1, Aliens.enemyLVL5 sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() == 80) {
                            sp1.setPicture(Player.playerS);
                            sp1.setX(WIDTH / 2);
                            numLives--;
                        }
                        if(numLives == 2) {
                            pl1.setActive(false);
                        }
                        if(numLives == 1) {
                            pl2.setActive(false);
                        }
                        if(numLives == 0) {
                            pl3.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);   
                Task t = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            if(numLives == 0) {
                                pl3.setActive(false);
                                sp1.setActive(false);
                                JOptionPane.showMessageDialog(sc, "Mission Failed!. We will "
                                        + " get em next time \n SCORE: " + Score +
                                           "\n Press Ok to exist");
                                System.exit(0);
                                if(Score >= 1000) {
                                    JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                            " \n SCORE: " + Score +  "\n Press Ok to exist");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                };
                Clock.addTask(t);
                sp2.setActive(false);
                dead.play();              
            });
        //Player1xBomb
        sc.addSpriteSpriteCollisionListener(Player.player1.class, Attack.bomb.class,
            (Player.player1 sp1, Attack.bomb sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() == 80) {
                            sp1.setPicture(Player.playerS);
                            sp1.setX(WIDTH / 2);
                            numLives--;
                        }
                        if(numLives == 2) {
                            pl1.setActive(false);
                        }
                        if(numLives == 1) {
                            pl2.setActive(false);
                        }
                        if(numLives == 0) {
                            pl3.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);   
                Task t = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            if(numLives == 0) {
                                sp1.setActive(false);
                                pl3.setActive(false);
                                JOptionPane.showMessageDialog(sc, "Mission Failed!. We will" +
                                        " get em next time \n SCORE: " + Score + "\n Press Ok to exist");
                                System.exit(0);
                                if(Score >= 1000) {
                                    JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                            " \n SCORE: " + Score +  "\n Press Ok to exist");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                };
                Clock.addTask(t);
                sp2.setActive(false);
                dead.play();              
            });
        //PlayerBulletxBomb
        sc.addSpriteSpriteCollisionListener(Attack.playerBullet.class, Attack.bomb.class,
            (Attack.playerBullet sp1, Attack.bomb sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp2.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp2.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp2.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() > 60) {
                            sp1.setActive(false);
                        }
                     }
                };
                Clock.addTask(explosion);   
                sp2.setActive(false);
                boom.play();              
            });
        //PlayerxMeteor
        sc.addSpriteSpriteCollisionListener(player1.class, Meteor.class,
            (player1 sp1, Meteor sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() == 80) {
                            sp1.setPicture(Player.playerS);
                            sp1.setX(WIDTH / 2);
                            numLives--;
                        }
                        if(numLives == 2) {
                            pl1.setActive(false);
                        }
                        if(numLives == 1) {
                            pl2.setActive(false);
                        }
                    }
                };
                Clock.addTask(explosion);   
                Task t = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            if(numLives == 0) {
                                sp1.setActive(false);
                                pl3.setActive(false);
                                JOptionPane.showMessageDialog(sc, "Mission Failed!. We will" +
                                        " get em next time \n SCORE: " + Score +
                                        "\n Press Ok to exist");
                                System.exit(0);
                                if(Score >= 1000) {
                                    JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                            " \n SCORE: " + Score +  "\n Press Ok to exist");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                };
                Clock.addTask(t);
                sp2.setActive(false);
                dead.play();   
            });
        //home & meteor
        sc.addSpriteSpriteCollisionListener(home.class, Meteor.class,
            (home sp1, Meteor sp2) -> {
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp1.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp1.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp1.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                    }
                };
                Clock.addTask(explosion);
                Task t = new Task(5) {
                    @Override
                    public void run() {
                        if (iteration() == maxIteration()) {
                            sp1.setActive(false);
                            numHomes--;
                            if(numHomes == 0) {
                                JOptionPane.showMessageDialog(sc, "Mission Failed!. We will" +
                                        " get em next time \n \nSCORE: " + Score +
                                        "\n \nPress Ok to exist");
                                if(Score >= 1000) {
                                    JOptionPane.showMessageDialog(sc, "Thanks for playing!" +
                                            " \n SCORE: " + Score +  "\n Press Ok to exist");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                };
                Clock.addTask(t);
                sp2.setActive(true);               
            }); 
        //XtraShooterxPlayer
        sc.addSpriteSpriteCollisionListener(Attack.xtraShooter.class, Player.player1.class,
            (Attack.xtraShooter sp1, Player.player1 sp2) -> {
                sp1.setActive(false);
                powerUp1.play();
                Player.player2 p2 = new Player.player2(sc);
                p2.setX(p.getX() - 10);
                Task Tracker = new Task() {
                    @Override
                    public void run() {
                        if(p2.getX() == 550) {
                            p2.setVelX(-p2.getVelX());
                        }
                        else 
                        if(p2.getX() == 0) {
                            p2.setVelX(1.25);
                        }
                    }
                };
                Clock.addTask(Tracker);
            });
        //Player2xMeteors
        sc.addSpriteSpriteCollisionListener(Meteor.class, Player.player2.class,
            (Meteor sp1, Player.player2 sp2) -> {
                XtraShooterIsDead = true;
                sp1.setActive(false);
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp2.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp2.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp2.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() > 60) {
                            sp2.setActive(false);
                        }
                     }
                };
                Clock.addTask(explosion);   
                dead2.play();
            });
        //BarrierxMeteor
        sc.addSpriteSpriteCollisionListener(Meteor.class, Player.barrier.class,
                (Meteor sp1, Player.barrier sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Player.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Player.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Player.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Player.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Player.boom5);
                            }
                            if(iteration() > 60) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    powerOff.play();
                });
        //Player2BulletxMeteroids
        sc.addSpriteSpriteCollisionListener(Attack.player2Bullet.class, Meteor.class,
                (Attack.player2Bullet sp1, Meteor sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Meteor.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Meteor.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Meteor.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Meteor.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Meteor.boom5);
                            }
                            if(iteration() > 50) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    boom.play();
                });
        //Player2BulletxAliens
        sc.addSpriteSpriteCollisionListener(Attack.player2Bullet.class, Aliens.class,
                (Attack.player2Bullet sp1, Aliens sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Aliens.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Aliens.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Aliens.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Aliens.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Aliens.boom5);
                            }
                            if(iteration() > 50) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    boom.play();
                });
        //Player2BulletxAsteroids
        sc.addSpriteSpriteCollisionListener(Attack.player2Bullet.class, Meteor.Asteroid.class,
                (Attack.player2Bullet sp1, Meteor.Asteroid sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Meteor.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Meteor.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Meteor.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Meteor.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Meteor.boom5);
                            }
                            if(iteration() > 50) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    boom.play();
                });
        //BarrierxEnemyMissile
        sc.addSpriteSpriteCollisionListener(Attack.enemyMissile.class, Player.barrier.class,
                (Attack.enemyMissile sp1, Player.barrier sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Player.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Player.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Player.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Player.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Player.boom5);
                            }
                            if(iteration() > 60) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    powerOff.play();
                });
        //PlayerxenemyMissile
        sc.addSpriteSpriteCollisionListener(Attack.enemyMissile.class, Player.player2.class,
            (Attack.enemyMissile sp1, Player.player2 sp2) -> {
                XtraShooterIsDead = true;
                sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Player.boom1);                            
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Player.boom2);                            
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Player.boom3);                            
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Player.boom4);                            
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Player.boom5);
                            }
                            if(iteration() > 60) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);   
                dead2.play();
            });
        //Player2xbomb
        sc.addSpriteSpriteCollisionListener(Attack.bomb.class, Player.player2.class,
            (Attack.bomb sp1, Player.player2 sp2) -> {
                XtraShooterIsDead = true;
                sp1.setActive(false);
                Task explosion = new Task() {
                    @Override
                    public void run() {
                        if(iteration() < 10) {
                            sp2.setPicture(Player.boom1);                            
                        }
                        if(iteration() < 20) {
                            sp2.setPicture(Player.boom2);                            
                        }
                        if(iteration() < 30) {
                            sp2.setPicture(Player.boom3);                            
                        }
                        if(iteration() < 40) {
                            sp1.setPicture(Player.boom4);                            
                        }
                        if(iteration() < 50) {
                            sp1.setPicture(Player.boom5);
                        }
                        if(iteration() > 60) {
                            sp2.setActive(false);
                        }
                     }
                };
                Clock.addTask(explosion);   
                dead2.play();
            });
        //SheildxMeteor
        sc.addSpriteSpriteCollisionListener(Attack.Shield.class, Meteor.class,
            (Attack.Shield sp1, Meteor sp2) -> {
                sp1.setActive(false);
                sp2.setActive(false);  
                powerOff.play();
            });
        //SheildxEnemyBullet
        sc.addSpriteSpriteCollisionListener(Attack.Shield.class, Attack.bomb.class,
            (Attack.Shield sp1, Attack.bomb sp2) -> {
                sp1.setActive(false);
                sp2.setActive(false);  
                powerOff.play();
            });
        //SheildxEnemyMissile
        sc.addSpriteSpriteCollisionListener(Attack.Shield.class, Attack.enemyMissile.class,
            (Attack.Shield sp1, Attack.enemyMissile sp2) -> {
                sp1.setActive(false);
                sp2.setActive(false);
                powerOff.play();
            });
        //SheildDropxPlayer
        sc.addSpriteSpriteCollisionListener(Attack.ShieldDrop.class, Player.player1.class,
            (Attack.ShieldDrop sp1, Player.player1 sp2) -> {
                Attack.Shield S = new Attack.Shield(sc, p);     
                powerUp.play();
            });
        //SheildxenemyLVL5
        sc.addSpriteSpriteCollisionListener(Attack.Shield.class, Aliens.enemyLVL5.class,
                (Attack.Shield sp1, Aliens.enemyLVL5 sp2) -> {
                    sp1.setActive(false);
                    sp2.setActive(false);
                    powerOff.play();
                });
        //SheildxAlienLVL3
        sc.addSpriteSpriteCollisionListener(Attack.Shield.class, Aliens.AlienLVL3.class,
                (Attack.Shield sp1, Aliens.AlienLVL3 sp2) -> {
                    sp1.setActive(false);
                    sp2.setActive(false);
                    powerOff.play();
                });
        //BombxBarrier
        sc.addSpriteSpriteCollisionListener(Attack.bomb.class, Player.barrier.class,
                (Attack.bomb sp1, Player.barrier sp2) -> {
                    sp1.setActive(false);
                    Task explosion = new Task() {
                        @Override
                        public void run() {
                            if(iteration() < 10) {
                                sp2.setPicture(Player.boom1);
                            }
                            if(iteration() < 20) {
                                sp2.setPicture(Player.boom2);
                            }
                            if(iteration() < 30) {
                                sp2.setPicture(Player.boom3);
                            }
                            if(iteration() < 40) {
                                sp1.setPicture(Player.boom4);
                            }
                            if(iteration() < 50) {
                                sp1.setPicture(Player.boom5);
                            }
                            if(iteration() > 50) {
                                sp2.setActive(false);
                            }
                        }
                    };
                    Clock.addTask(explosion);
                    dead2.play();
                });
    }
        
    public static void Score(Graphics g){
        //score//
        g.setColor(Color.white);
        Font f = new Font("Ink Free", Font.BOLD, 20);
        g.setFont(f);
        FontMetrics metrics1 = g.getFontMetrics(g.getFont());
        g.drawString("Score: " + Score, (WIDTH - metrics1.stringWidth("Score : " + Score))
                         / 4, g.getFont().getSize());
        //difficulty LVL text//
        g.setColor(Color.white);
        Font f2 = new Font("Ink Free", Font.BOLD, 20);
        g.setFont(f2);
        FontMetrics metrics2 = g.getFontMetrics(g.getFont());
        g.drawString("LVL: " + numLVL, (WIDTH - metrics2.stringWidth("LVL : " + numLVL))
                         / 4, g.getFont().getSize() + 25);
        }
}
            