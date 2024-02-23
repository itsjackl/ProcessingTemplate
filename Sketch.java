import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Main part of the house
  fill(196, 164, 132);
  rect(100, 200, 200, 200);

  // Roof of the house
  fill(90, 90, 90);
  triangle(100, 200, 300, 200, 200, 150);

  // Windows of the houe
  fill(53, 126, 199);
  ellipse(150, 275, 50, 50);
  ellipse(250, 275, 50, 50);
  fill(0,0,0);
  line(125, 275, 175, 275);
  line(150, 250, 150, 300);
  line(225, 275, 275, 275);
  line(250, 250, 250, 300);

  // Door of the house
  fill(92, 64, 51);
  rect(175, 300, 50, 100);
  }
  
  
}