//Student name : Gershom Raymundo     CST112 Wednesday Evening
//Project One: Villain (Soccee) tries to catch the hero (laBois) who chases the gold

float goldX, goldY;              //GOLD  
float socceeX, socceeY;          //VILLAIN
float laBoisX, laBoisY;          //HERO

float horizon;

void setup(){
  size(1000, 800);
  smooth();
  frameRate(30);
  horizon = height / 4;
}

void draw(){
  scene();                         //create the scene
  //laBois();                      //create the hero labois
  //animateLaBois();               //animate labois
  //soccee();                      //create enemy named soccee
  //animateSoccee();               //animate Soccee
  //gold();                        //create gold
  //animateGold();                 //animate gold
  //reset();                       //reset to the beginning
  //buttonScore();                 //buttons that keep track of score
  //messages();                    // messages
}

void scene(){
  background( 16, 162, 232);
  
  
  //GRASS
  stroke(0);                                   
  fill( 10, 170, 9);
  rect( 0, horizon, width, height*3/4);
  
  //TREE BARK (BIG ONE N FRONT ON THE LEFT)
  stroke(0);      
  fill( 224, 118, 5);
  rect( 100, 400, 50, 300);
     
     //TREE LEAVES
     stroke(0);
     fill( 40, 247, 124);
     triangle(125, 300, 75, 450, 175, 450);
     
     //TREE HOLE
     stroke(0);
     fill(0);
     ellipseMode(CENTER);
     ellipse( 125, 550, 20, 40);
     
         //TREES IN DISTANCE ON HORIZON
         stroke(0);
         fill( 224, 118, 5);
         rect(246, horizon - 40, 10, 40);
         rect(378, horizon - 70, 18, 70);
         
         //LEAVES FOR THE TREES IN HORIZON
         stroke(0);
         fill( 40, 247, 124);
         triangle( 251, 120, 240, 160, 259, 160);
         triangle( 387, 80, 370, 130, 403, 130 );
         
//HOUSE
stroke(0);
fill( 255, 0, 0);
rect(600, horizon - 100, 250, 200);

    //HOUSE ROOF
         
     
  
}

//void laBois(){ 
  
//}

//void animateZoog(){
  
//}

//void keyPressed(){
  
//  println("im AWESOME!!");
//}
