function setup() {
  createCanvas(600, 600);
}

function draw() {
  colorMode(RGB, 255);
  background(47, 245, 225);
  
  //head of cat
  fill(163, 63, 13);
  ellipse(400, 250, 125, 62.5);
  noStroke();
  
  //body of cat
  quad(100, 240, 400, 250, 370, 400, 100, 400);

  //tail of cat
  stroke('brown');
  curve(300, 50, 110, 250, 50, 50, 50, 50); 
  
  //left whiskers
  stroke('black')
  line(380,250,370,270)
  
  stroke('black')
  line(380,250,360,265)
  
  stroke('black')
  line(380,250,356,260)
  
  //right whiskers
  stroke('black')
  line(420,250,430,270)
  
  stroke('black')
  line(420,250,440,265)
  
  stroke('black')
  line(420,250,446,260)
  
  noFill()
  stroke('black')
  arc(400, 250, 20, 20, 250, HALF_PI);
  
}
