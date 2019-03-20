/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcorsework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Oopcorsework3{

    
    public static void main(String[] args) {
        String name ,regno;
        int markA,markB,markC,markD,markE,markF,yob;
        
     student s=new student();    
     ArrayList <student>std=new ArrayList();
     
     for(int i=0;i<4;i++){
         Scanner in=new Scanner(System.in);
     System.out.println("enter student ;"+(i+1));
     
     System.out.println("Enter name;");
     name=in.next();
     
     System.out.println("Enter regestration number ;");
     regno=in.next();
     
     System.out.println("Enter date of birht");
     yob=in.nextInt();
     
     System.out.println("Enter markA;"+s.getSubjA());
     markA=in.nextInt();
     
     System.out.println("Enter markB ;"+s.getSubjB());
     markB=in.nextInt();
     System.out.println("Enter markC ;"+s.getsubjC());
     markC=in.nextInt();
     System.out.println("Enter markD ;"+s.getsubjD());
     markD=in.nextInt();
     System.out.println("Enter markD ;"+s.getsubjE());
     markE=in.nextInt();
     System.out.println("Enter markF"+s.getsubjF());
     markF=in.nextInt();
    
      student c=new student(name,regno,yob,markA,markB,markC,markD,markE,markF);
      std.add(c);
     
      
     }
     
     for(int i=0;i<4;i++){
     student d=std.get(i);

     System.out.println("Student name"+"\t"+d.getName());
     System.out.println("reges number"+"\t"+d.getRegno());
     System.out.println("date of birth"+"\t"+d.getYob());
     System.out.println(s.getSubjA()+"\t"+"\t"+d.getmarkA());
     System.out.println(s.getSubjB()+"\t"+"\t"+d.getmarkB());
     System.out.println(s.getsubjC()+"\t"+d.getmarkC());
     System.out.println(s.getsubjD()+"\t"+"\t"+d.getmarkD());
     System.out.println(s.getsubjE()+"\t"+d.getmarkE());
     System.out.println(s.getsubjF()+ "\t"+d.getmarkF());
     float ava=(d.getmarkA()+d.getmarkB()+d.getmarkC()+d.getmarkD()+d.getmarkE()+d.getmarkF())*100/600;
        System.out.println("average IS: "+"\t"+ ava);
        
     }
    
     
     
    // }
    }
    
}
    
