//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";

// GLOBAL VARIABLES //
float x,y;
int h,w;
  
// Setup:  screen size, initialization. //
void setup() {

  size(700, 700);
  x=  width/2;
  y=  height/2;
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse
}

// Next frame. //
void draw() {
   textSize(18);
  text( title, 10, 10 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  //

 line(x,y+160,w+490,h+170);     ///arms
 
line(x,y+160,w,h+200);        ////arms

  
  ellipse(x,y+131,w+175,h+175);    ///belly
  ellipse(x, y-40, w+30, h+30);     ////head
  
  ellipse(x+25,y-55,w-90,h-90); ////eyes
  
  ellipse(x-25,y-55,w-90,h-90); ///eyes
  
   ellipse(x-0,y-11,w-122,h-92);
  
  fill(random(255), random(255), random(255)); //makes color effects
  text("metallica",x-30,y+135);    ////name
  x= x + 2; y= y + 1;
  
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
