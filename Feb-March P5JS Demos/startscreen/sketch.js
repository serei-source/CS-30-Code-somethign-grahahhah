// Startscreen
// Jian De Leon
// March 13th 2024
//
// Extra for Experts:
// - start screen thing idk


function setup() {
  createCanvas(windowWidth, windowHeight);
  button = createButton("click to show other shapes");
  button.position(100,200);
  button.mousePressed(() => {
    peterevent();
  });
}

function draw() {
  background(200);
  circle(300,300,100);
}





function peterevent(){
  circle(10,10,100);

}