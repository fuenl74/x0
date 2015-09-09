//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";

// GLOBAL VARIABLES //
float x,y;
int h,w;
  
// Setup:  screen size, initialization. //
void setup() {

  size(500, 500);
  x=  width/2;
  y=  height/2;
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse
}

// Next frame. //
void draw() {
  text( title, 10, 10 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  //

 

  ellipse(x, y, w, h);
  fill(random(255), random(255), random(255)); //makes color effects
text("matica",x,y);
}

//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( random(255), random(255), random(255) );
  fill( random(255), random(255), random(255) );
  w=  int( random(50,150) );
  h=  int( random(50,150) );
}
