package intro.walktomouse;

import processing.core.PApplet;

/**
 * Created by nitin.yadav on 17-06-2017.
 */
public class MouseWalker extends PApplet{
    Walker w;

    public void settings(){
        size(640,360);
    }

    public void setup(){
        frameRate(30);
        w = new Walker(width, height,this);
        background(255);
    }

    public void draw(){
        w.step();
        w.display();
    }

    public static void main(String[] args){
        PApplet.main("intro.walktomouse.MouseWalker");
    }
}
