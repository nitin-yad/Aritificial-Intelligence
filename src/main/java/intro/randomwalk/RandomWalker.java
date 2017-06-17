package intro.randomwalk;

import processing.core.*;

/**
 * Created by nitin.yadav on 16-06-2017.
 */
public class RandomWalker extends PApplet{

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
        PApplet.main("intro.randomwalk.RandomWalker");
    }
}
