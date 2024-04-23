//Drawing of a cat

function setup() {
  createCanvas(600, 600);
}

function draw() {
  colorMode(RGB, 255);
  background(47, 245, 225);
  
  //head of cat
  noStroke();
  fill(163, 63, 13);
  ellipse(400, 250, 125, 62.5);
  
  
  //body of cat
  quad(100, 240, 400, 250, 370, 400, 100, 400);
  

  //tail of cat
  stroke(163, 63, 13);
  curve(300, 50, 110, 250, 50, 50, 50, 50); 
  
  
  //left whiskers
  strokeWeight(1)
  stroke('black');
  line(380,250,370,270);
  
  stroke('black');
  line(380,250,360,265);
  
  stroke('black');
  line(380,250,356,260);
  
  
  //right whiskers
  stroke('black');
  line(420,250,430,270);
  
  stroke('black');
  line(420,250,440,265);
  
  stroke('black');
  line(420,250,446,260);
  
  
  //cat mouth
  strokeWeight(3);
  noFill();
  stroke('black');
  arc(395, 265, 10, 10, 335, QUARTER_PI);
  arc(405, 265, 10, 10, 335, QUARTER_PI);
  
  
  //nose of cat
  fill('pink');
  noStroke();
  triangle(400,250,394,258,407,258);
  
  
  //ears of cat
  strokeWeight(1);
  stroke('black');
  fill(128, 66, 4);
  triangle(390,224,380,200,370,225);
  triangle(410,225,420,200,430,225);
  
  
  //eyes of cat
  fill('black');
  stroke('white');
  ellipse(412,240,10,10);
  ellipse(388,240,10,10);
  
  
  //cat legs
  noStroke()
  fill(163, 63, 13)
  rect(100,400,50,100)
  rect(320,400,50,100)
  
  
  //cat pattern
  strokeWeight(10)
  stroke('black')
  point(300,350)
  point(200,340)
  point(180,300)
  point(160,290)
  point(340,270)
  point(280,285)
  point(250,300)
  
}
