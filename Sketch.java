import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(52, 224, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

   // Declare variables for handling multiple keys
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   float circleX = 300;
   float circleY = 300;

  public void draw() {

    // Mouse pressed variable
    if (mousePressed) {
      fill(248, 200, 220);
      ellipse(mouseX, mouseY, 25, 25);
    }

    // Key pressed variable with keyCode
    if(keyPressed) {
      if(keyCode == SHIFT){
        fill(57, 255, 20);
        ellipse(random(50, 500), random(50, 500),  20, 20);
      }
      if(keyPressed){
      if(key == 'p'){
        fill(24, 89, 254);
        ellipse(mouseX, mouseY, 20, 20);
      }
    }
    
    // Code that tells the multiple handling key what to do
    if(upPressed){
      circleY--;
    }
    if(downPressed){
      circleY++;
    }
    if(leftPressed){
      circleX--;
    }
    if(rightPressed){
      circleX++;
    }
    ellipse(circleX, circleY, 100, 100);
  }
    }

    // Mousewheel function 
    public void mouseWheel() {
      fill(250, 72, 72);
      ellipse(random(1, 600), random(1, 600), 30, 30);
    }
  

    // Mouse clicked function
    public void mouseClicked() {

      // Declare variables for drawing watermelons with mouseX and mouseY variables
      float X = mouseX;
      float Y = mouseY;
      float W = random(100, 100);
      float H = random(25, 100);
    
      // Draw watermelons
      strokeWeight( 1);
      fill(78, 245, 66);
      ellipse(X, Y, W, H);
      ellipse(X, Y, (float) (W *.75), H);
      ellipse(X, Y, (float) (W *.5), H);
      ellipse(X, Y, (float) (W *.25), H);
    }
      // Mouse released function
      public void mouseReleased() {
        fill(239, 59, 245);
        rect(random(1, 600), random(1, 600), 50, 50);
      }
        
      // Keypressed function
       public void keyPressed() {
        ellipse(random(1, 600), random(1, 600), 80, 80);

        // Code for handling mutiple keys that detects key presses
        if(keyCode == UP){
          upPressed = true;
        }
        else if(keyCode == DOWN){
          downPressed = true;
        }
        else if(keyCode == LEFT){
          leftPressed = true;
        }
        else if(keyCode == RIGHT){
          rightPressed = true;
        }
}

    // Code for handling multiple keys that detects key releases
    public void keyReleased(){

      if(keyCode == UP){
          upPressed = false;
        }
        else if(keyCode == DOWN){
          downPressed = false;
        }
        else if(keyCode == LEFT){
          leftPressed = false;
        }
        else if(keyCode == RIGHT){
          rightPressed = false;
        }
}
    }
  