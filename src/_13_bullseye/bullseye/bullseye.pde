void setup(){
        size(400,600);
        background(0,255,0);
    }

    void draw(){
      for (int i=1; i<=8; i++){
        if(i%2==0){
        fill(255,0,0);
        ellipse(200, 200, 300-i*40, 300-i*40);
        }
        else{
        fill(#000000);
        ellipse(200, 200, 300-i*40, 300-i*40);
        }
      }

  }
