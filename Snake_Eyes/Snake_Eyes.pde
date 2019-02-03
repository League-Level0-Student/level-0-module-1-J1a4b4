void setup(){
size(1000, 1000);
}

void draw(){
PImage face = loadImage("snake.jpg");
face.resize(1000, 1000);
image(face, 0, 0);
fill(mouseX, mouseY, mouseX + mouseY / 2);
stroke(1000);
ellipse(560, 700, 150, 250);
fill(0, 0, 0);
ellipse(560, 700, 100, 200);
}