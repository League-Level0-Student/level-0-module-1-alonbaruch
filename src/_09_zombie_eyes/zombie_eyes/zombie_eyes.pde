
void setup(){
  PImage face = loadImage("maxresdefault.jpg");
image(face, 0, 0);
  size(900,900);
face.resize(900,900);


}
void draw(){
 fill(#030303);
  ellipse(590,310,100,50);

fill(#B70707);
ellipse(750,350,100,50); 

fill(#000000);
ellipse(750,350,80,40);  
fill(#B70202);  
ellipse(750,350,60,30);  
 fill(#000000); 
  ellipse(750,350,40,20);
fill(#B90BAE);
ellipse(590,310,80,40);
fill(#030303);
ellipse(590,310,60,30);
fill(#A20B99);
ellipse(590,310,40,20);

}
