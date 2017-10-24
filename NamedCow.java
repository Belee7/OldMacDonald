class namedCow extends Cow
{     
     protected String myName;     
    
     public namedCow(String type, String name, String sound)     {         
         myType = type;         
         mySound = sound;
         myName = name;
     }     
     public namedCow()     {         
         myName = "unknown";         
          
     }      
     public String getName()
   {
   return myName;
 }     
 
}