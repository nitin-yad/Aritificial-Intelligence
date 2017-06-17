package intro.biasedwalk;

import processing.core.PApplet;

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
    * Walker  with 40% chance to move right
    * */

    void step() {

        float r = p.random(1);
        if (r < 0.4) {
            x++;
        } else if (r < 0.6) {
            x--;
        } else if (r < 0.8) {
            y++;
        } else {
            y--;
        }
    }
}
