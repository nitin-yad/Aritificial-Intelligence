package intro.noise;

import processing.core.PApplet;

/**
 * Created by nitin.yadav on 19-06-2017.
 */
public class Noise1D extends PApplet {

    float inc = 0.01f;
    float xOff = 0.0f;

    public void settings(){
        size(640,360);
    }

    public void setup(){
        background(0);
        noStroke();
    }

    public void draw(){
        fill(0,10);
        rect(0,0,width,height);
//        float n = random(0, width);
        float n = noise(xOff)*width;
        xOff += inc;
        fill(200);
        ellipse(n, height/2, 16, 16);
    }

    public static void main(String[] args){PApplet.main("intro.noise.Noise1D");}
}
