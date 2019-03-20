
package oopcorsework3;


public class student {
private String name,regno;
private int yob;
private String subjA="oop1";
private String subjB="AI";
private String subjC="E-commerce";
private String subjD="Ethics";
private String subjE="business";
private String subjF="maintnace";
private int markA,markB,markC,markD,markE,markF;

public student(){
}

public student(String name,String regno,int yob,int markA,int markB,int markC,int markD,int markE,int markF){
    this.name=name;
    this.regno=regno;
    this.yob=yob;
    this.markA=markA;
    this.markB=markB; 
    this.markC=markC;
    this.markD=markD;
    this.markE=markE;
    this.markF=markF;
}
  public String getName(){
  return this.name;
  }  
  public String getSubjA(){
  return this.subjA;
  }
   public String getSubjB(){
   return this.subjB;
   } 
   public String getsubjC(){
   return this.subjC;
   }
   public String getsubjD(){
   return this.subjD;
   }
   public String getsubjE(){
   return this.subjE;
           }
   public String getsubjF(){
   return this.subjF;
   }
   public String getRegno(){
   return this.regno;
   }
   public int getYob(){
   return this.yob;
   }
   public int getmarkA(){
   return this.markA;
   }
   public int getmarkB(){
   return this.markB;
   }
public int getmarkC(){
return this.markC;
}
public int getmarkD(){
return this.markD;
}
public int getmarkE(){
return this.markE;
}
public int getmarkF(){
return this.markF;
}
}
