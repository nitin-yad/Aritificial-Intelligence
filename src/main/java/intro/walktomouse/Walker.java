package intro.walktomouse;

import processing.core.PApplet;
import java.lang.Math;

/**
 * Created by nitin.yadav on 17-06-2017.
 */
public class Walker {
    int x;
    int y;
    PApplet p;

    Walker(int width, int height, PApplet p){
        x = width/2; y = height/2;  this.p =p;
    }

    public void display(){
        p.stroke(0);    p.point(x,y);
    }

    /*
    * Walker  with 50% chance to move towards mouse
    * */

    void step() {
        int stepX = 0;
        int stepY = 0;
        float r = p.random(1);
        if (r < 0.5) {
            int xDir = p.mouseX - x;
            int yDir = p.mouseY - y;
            if (xDir != 0) {
                stepX = xDir/Math.abs(xDir);
            }
            if(yDir != 0){
                stepY = yDir/Math.abs(yDir);
            }
        } else {
            stepX = (int) p.random(3)-1;
            stepY = (int) p.random(3)-1;
        }
        x = p.constrain(x + stepX, 0, p.width-1);
        y = p.constrain(y + stepY, 0, p.height-1);
    }
}
