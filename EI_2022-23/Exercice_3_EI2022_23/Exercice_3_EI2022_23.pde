void setup(){
  size(1000, 500);
  background(0, 255, 0);
}

float x = 500;
float y = 250;
float dx = 2;
float dy = 3;
float rayon = 25;

void draw(){
  
  background(0, 255, 0);
  
  ellipse(x, y, 50, 50);
  x += dx;
  y += dy;
  
  if(x < rayon || x > width - rayon) {
      dx = -dx;
    }
  if(y < rayon || y > height - rayon) {
      dy = -dy;
    }

}
