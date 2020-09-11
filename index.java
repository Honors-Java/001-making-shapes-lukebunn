// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  rect(201, 200, 100, 50);
  ellipse(150, 225, 20, 20);
  ellipse(170, 225, 20, 20);
  ellipse(190, 225, 20, 20);
  ellipse(210, 225, 20, 20);
  ellipse(230, 225, 20, 20);
  ellipse(250, 225, 20, 20);
	rect(175, 163, 50, 25)
  rect(225, 155, 50, 10)
}