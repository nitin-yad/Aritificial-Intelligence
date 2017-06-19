package intro.noise;

import processing.core.PApplet;

/**
 * Created by nitin.yadav on 19-06-2017.
 */
public class Noise2D extends PApplet {

    float inc = 0.01f;

    public void settings(){
        size(640,360);
    }

    public void setup(){
        noLoop();
    }

    public void draw(){
        background(0);
        loadPixels();
        float xOff = 0.0f;
        for(int x=0 ; x < width; x++){
            xOff  += inc;
            float yOff = 0.0f;
            for(int y =0; y < height; y++){
                yOff += inc;
                float bright = noise(xOff,yOff)*255;
                pixels[x+y*width] = color(bright);
            }
        }
        updatePixels();
    }

    public static void main(String[] args){
        PApplet.main("intro.noise.Noise2D");
    }
}
