// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let x,y;
let timeW = 60;
let timeX = 0;
let timeY = 0;


function setup() {
  createCanvas(windowWidth, windowHeight);
  //width and height are defiend by canvas, puts x,y in the center
  x = width/2;
  y = height/2;
}

function draw() {
  background(220);

  x = noise(timeX) * width;
  y = noise(timeY) * height; 
  fill(noise(timeX)*255,noise(timeY)*255,noise(timeW)*255)
  circle(x,y,50)

  fill("black");
  circle(x,y,45)

  timeX +=0.04;
  timeY -=0.02;
  
}
