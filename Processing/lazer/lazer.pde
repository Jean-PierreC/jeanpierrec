import ddf.minim.*;
AudioSample sound;
int x=565;
int y=450;
int xx=260;
int yy=480;
int s =8;
void setup(){
   size(1000,1000);
 PImage catPic = loadImage("download.jpeg");
 catPic.resize(1000,1000);
background(catPic); 
Minim minim = new Minim(this);
sound = minim.loadSample("foo.mp3");
}
void draw(){
  noStroke();
 ellipse(x, y, 125,125);
 ellipse(xx,yy,125,125);
 fill(255,14,7);
 if (s ==1){
   sound.trigger();
 }
}
void keyPressed() {
  s--;
  x+=2*s;
  y+=2*s;
  xx+=2*s;
  yy+=2*s;
}
