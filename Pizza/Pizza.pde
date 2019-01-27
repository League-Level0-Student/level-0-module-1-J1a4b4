import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup(){
size(1000, 1000);
minim = new Minim(this);
sound = minim.loadFile("crunching.wav");
}
void draw(){
fill(200, 100, 0);
ellipse(500, 500, 500, 500);
fill(255, 0, 0);
ellipse(500, 500, 450, 450);
fill(255, 255, 0);
ellipse(500, 500, 440, 440);
PImage beetle = loadImage("beetle.ppm.gif");
beetle.resize(25, 25);
if(mousePressed){
image(beetle, mouseX, mouseY);
sound.play();
sound.rewind();
}
}