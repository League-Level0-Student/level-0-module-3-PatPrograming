void setup(){
        size(1000,1000);
        background(0,255,0);
    }
int X=200;
int X2=500;
    void draw(){
      for (int i=1; i<=8; i++){
        if(i%2==0){
        noFill();
        ellipse(X, 200, 300-i*40, 300-i*40);
        }
        else{
        noFill();
        ellipse(X, 200, 300-i*40, 300-i*40);
        }
      }
            for (int i=1; i<=8; i++){
        if(i%2==0){
        noFill();
        ellipse(X2, 200, 300-i*40, 300-i*40);
        }
        else{
        noFill();
        ellipse(X2, 200, 300-i*40, 300-i*40);
        }
        X++;
        X2--;
      }
  }
           
