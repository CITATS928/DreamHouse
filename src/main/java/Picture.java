
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ,
 * converted for use with Replit
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
  private Square wall;
  private Square window;
  private Triangle roof;
  private Circle sun;
  private Square tree11;
  private Square tree12;
  private Square tree21;
  private Square tree22;
  private Square tree31;
  private Square tree32;
  private Square tree41;
  private Square tree42;
  private Square tree51;
  private Square tree52;
  private Square tree61;
  private Square tree62;
  private Square tree71;
  private Square tree72;
  private Square tree81;
  private Square tree82;
  private Square tree91;
  private Square tree92;
  private Square tree101;
  private Square tree102;
  private Square tree111;
  private Square tree112;
  private Square tree121;
  private Square tree122;
  private Square tree131;
  private Square tree132;
  private Square tree141;
  private Square tree142;
  private Triangle leaves1;
  private Triangle leaves2;
  private Square door1;
  private Circle door2;
  private Square door3;
  /**
   * Constructor for objects of class Picture
   */
  public Picture() {
    // nothing to do... instance variables are automatically set to null
  }

  /**
   * Draw this picture.
   */
  public void draw() {

    tree11= new Square();
    tree11.changeSize(12);
    tree11.moveHorizontal(190);
    tree11.moveVertical(190);
    tree11.makeVisible();
    tree11.changeColor("black");


    tree12= new Square();
    tree12.changeSize(12);
    tree12.moveHorizontal(200);
    tree12.moveVertical(190);
    tree12.makeVisible();
    tree12.changeColor("black"); 

    tree21= new Square();
    tree21.changeSize(12);
    tree21.moveHorizontal(190);
    tree21.moveVertical(180);
    tree21.makeVisible();
    tree21.changeColor("black");

    tree22= new Square();
    tree22.changeSize(12);
    tree22.moveHorizontal(200);
    tree22.moveVertical(180);
    tree22.makeVisible();
    tree22.changeColor("black");

    tree31= new Square();
    tree31.changeSize(12);
    tree31.moveHorizontal(190);
    tree31.moveVertical(170);
    tree31.makeVisible();
    tree31.changeColor("black");

    tree32= new Square();
    tree32.changeSize(12);
    tree32.moveHorizontal(200);
    tree32.moveVertical(170);
    tree32.makeVisible();
    tree32.changeColor("black");

    tree41= new Square();
    tree41.changeSize(12);
    tree41.moveHorizontal(190);
    tree41.moveVertical(160);
    tree41.makeVisible();
    tree41.changeColor("black");

    tree42= new Square();
    tree42.changeSize(12);
    tree42.moveHorizontal(200);
    tree42.moveVertical(160);
    tree42.makeVisible();
    tree42.changeColor("black");

    tree51= new Square();
    tree51.changeSize(12);
    tree51.moveHorizontal(190);
    tree51.moveVertical(150);
    tree51.makeVisible();
    tree51.changeColor("black");

    tree52= new Square();
    tree52.changeSize(12);
    tree52.moveHorizontal(200);
    tree52.moveVertical(150);
    tree52.makeVisible();
    tree52.changeColor("black");

    tree61= new Square();
    tree61.changeSize(12);
    tree61.moveHorizontal(190);
    tree61.moveVertical(140);
    tree61.makeVisible();
    tree61.changeColor("black");

    tree62= new Square();
    tree62.changeSize(12);
    tree62.moveHorizontal(200);
    tree62.moveVertical(140);
    tree62.makeVisible();
    tree62.changeColor("black");

    tree71= new Square();
    tree71.changeSize(12);
    tree71.moveHorizontal(190);
    tree71.moveVertical(130);
    tree71.makeVisible();
    tree71.changeColor("black");

    tree72= new Square();
    tree72.changeSize(12);
    tree72.moveHorizontal(200);
    tree72.moveVertical(130);
    tree72.makeVisible();
    tree72.changeColor("black");

    tree81= new Square();
    tree81.changeSize(12);
    tree81.moveHorizontal(190);
    tree81.moveVertical(120);
    tree81.makeVisible();
    tree81.changeColor("black");

    tree82= new Square();
    tree82.changeSize(12);
    tree82.moveHorizontal(200);
    tree82.moveVertical(120);
    tree82.makeVisible();
    tree82.changeColor("black");

    tree91= new Square();
    tree91.changeSize(12);
    tree91.moveHorizontal(190);
    tree91.moveVertical(110);
    tree91.makeVisible();
    tree91.changeColor("black");

    tree92= new Square();
    tree92.changeSize(12);
    tree92.moveHorizontal(200);
    tree92.moveVertical(110);
    tree92.makeVisible();
    tree92.changeColor("black");

    tree101= new Square();
    tree101.changeSize(12);
    tree101.moveHorizontal(190);
    tree101.moveVertical(100);
    tree101.makeVisible();
    tree101.changeColor("black");

    tree102= new Square();
    tree102.changeSize(12);
    tree102.moveHorizontal(200);
    tree102.moveVertical(100);
    tree102.makeVisible();
    tree102.changeColor("black");

    tree111= new Square();
      tree111.changeSize(12);
      tree111.moveHorizontal(190);
      tree111.moveVertical(90);
      tree111.makeVisible();
      tree111.changeColor("black");

    tree112= new Square();
      tree112.changeSize(12);
      tree112.moveHorizontal(200);
      tree112.moveVertical(90);
      tree112.makeVisible();
      tree112.changeColor("black");

    tree121= new Square();
      tree121.changeSize(12);
      tree121.moveHorizontal(190);
      tree121.moveVertical(80);
      tree121.makeVisible();
      tree121.changeColor("black");

    tree122= new Square();
      tree122.changeSize(12);
      tree122.moveHorizontal(200);
      tree122.moveVertical(80);
      tree122.makeVisible();
      tree122.changeColor("black");

    tree131= new Square();
      tree131.changeSize(12);
      tree131.moveHorizontal(190);
      tree131.moveVertical(70);
      tree131.makeVisible();
      tree131.changeColor("black");

    tree132= new Square();
      tree132.changeSize(12);
      tree132.moveHorizontal(200);
      tree132.moveVertical(70);
      tree132.makeVisible();
      tree132.changeColor("black");

    tree141= new Square();
      tree141.changeSize(12);
      tree141.moveHorizontal(190);
      tree141.moveVertical(60);
      tree141.makeVisible();
      tree141.changeColor("black");

    tree142= new Square();
      tree142.changeSize(12);
      tree142.moveHorizontal(200);
      tree142.moveVertical(60);
      tree142.makeVisible();
      tree142.changeColor("black");


    leaves1= new Triangle();
    leaves1.changeSize(40,120);
    leaves1.moveHorizontal(210);
    leaves1.moveVertical(130);
    leaves1.makeVisible();
    leaves1.changeColor("green");

    leaves2= new Triangle();
    leaves2.changeSize(40,120);
    leaves2.moveHorizontal(210);
    leaves2.moveVertical(70);
    leaves2.makeVisible();
    leaves2.changeColor("green");

    wall = new Square();
    wall.changeColor("blue");
    wall.moveVertical(80);
    wall.changeSize(100);
    wall.makeVisible();

    
    door1=new Square();
    door1.changeSize(20);
    door1.moveHorizontal(70);
    door1.moveVertical(160);
    door1.makeVisible();
    door1.changeColor("black");

    door3= new Square();
    door3.changeSize(20);
    door3.moveHorizontal(70);
    door3.moveVertical(150);
    door3.makeVisible();
    door3.changeColor("black");
    
    
    
    door2=new Circle();
    door2.changeSize(20);
    door2.moveHorizontal(110);
    door2.moveVertical(130);
    door2.makeVisible();
    door2.changeColor("black");
    

/*     
    wall = new Square();
    wall.changeColor("blue");
    wall.moveVertical(80);
    wall.changeSize(100);
    wall.makeVisible(); */

    window = new Square();
    window.changeColor("light_grey");
    window.moveHorizontal(20);
    window.moveVertical(100);
    window.makeVisible();

    roof = new Triangle();
    roof.changeColor("black");
    roof.changeSize(50, 140);
    roof.moveHorizontal(60);
    roof.moveVertical(70);
    roof.makeVisible();

    sun = new Circle();
    sun.changeColor("yellow");
    sun.moveHorizontal(180);
    sun.moveVertical(-80);
    sun.changeSize(60);
    sun.makeVisible();
  }

  /**
   * Change this picture to black/white display
   */
  public void setBlackAndWhite() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("black");
      window.changeColor("white");
      roof.changeColor("black");
      sun.changeColor("black");
    }
  }

  /**
   * Change this picture to use color display
   */
  public void setColor() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("red");
      window.changeColor("black");
      roof.changeColor("green");
      sun.changeColor("yellow");
    }
  }

}