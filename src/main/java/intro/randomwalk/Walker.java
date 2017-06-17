package intro.randomwalk;

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
        This walker only moves up or down.

    public void step(){
        int choice = (int) p.random(4);
        if(choice == 0){
            x++;
        }else if(choice ==1){
            x--;
        }else if(choice ==2){
            y++;
        }else{
            y--;
        }
    }
    */

    /*
        This walker can move to any pixel in its neighbourhood.
    */

    public void step() {
        int stepx = (int) p.random(3)-1;
        int stepy = (int) p.random(3)-1;
        x += stepx;
        y += stepy;
    }
}
