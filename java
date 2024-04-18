function setup() {
  createCanvas(600, 600);
}

function draw() {
  colorMode(RGB, 255)
  background(47, 245, 225);
  
  fill(163, 63, 13)
  ellipse(400, 250, 100, 50)
  noStroke();
  
  
  quad(100, 240, 400, 250, 370, 400, 100, 400)

  
}
