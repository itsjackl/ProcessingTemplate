import processing.core.PApplet;

class Main {
  public static void main(String[] args) {
    //PApplet.main("Sketch", args);
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
}