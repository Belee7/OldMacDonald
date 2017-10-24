class Chick implements Animal {     
     private String myType;     
     private String mySound; 
     private String mySound2;
     public Chick(String type, String sound, String sound2)     {         
         myType = type; 
         if (Math.random() < 0.5)
         mySound = sound;
         else
         mySound = sound2;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";
         mySound2 = "unknown";
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}