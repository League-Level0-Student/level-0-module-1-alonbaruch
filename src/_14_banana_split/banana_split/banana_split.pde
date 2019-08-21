
  void setup(){
        size(400,600);
        background(0,255,0);
    

    void draw(){
        if(mousePressed){               //if the mouse is pressed 
            fill(255,0,0);                  //fill red 
        }
        else{                           //else
            fill(0,0,255);                  //fill green
        }
        ellipse(mouseX, mouseY, 100, 100);  //using these variables makes this shape follow the mouse
    
                            
text("banana ", 25, 36);
text("banana ", 25, 47);
  }
                            
