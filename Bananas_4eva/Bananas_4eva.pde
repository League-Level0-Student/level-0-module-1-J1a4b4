void setup(){
size(1000, 1000);
}

void draw(){
for (int i = 0; i < 1000; i++) {
fill(255 - i, 255 - i, 0);
text("Banana!", 500, 10 * i);
}
}