/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading2;

import java.util.Scanner;
public class Grading2 {

    String name;
String sub1;
String sub2;
String sub3;
String sub4;
String sub5;
String sub6;

String gpaA;
String gpaB;
String gpaC;
String gpaD;
String gpaE;
String gpaF;


int markA;
int markB;
int markC;
int markD;
int markE;
int markF;
int markG;
String gradeA;
String gradeB;
String gradeC;
String gradeD;
String gradeE;
String gradeF;

int ava = 0;
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        Grading2 obj=new Grading2();
        System.out.println("Enter  student");
        obj.name=s.next();
        System.out.println("Enter course unit 1");
        obj.sub1=s.next();
        System.out.println("Enter mark");
        obj.markA=s.nextInt();
         System.out.println("Enter course unit 2");
        obj.sub2=s.next();
        System.out.println("Enter mark");
        obj.markB=s.nextInt();
        System.out.println("Enter course unit 3");
        obj.sub3=s.next();
        System.out.println("Enter mark");
        obj.markC=s.nextInt();
        System.out.println("Enter course unit 4");
        obj.sub4=s.next();
        System.out.println("Enter mark");
        obj.markD=s.nextInt();
        System.out.println("Enter course unit 5");
        obj.sub5=s.next();
        System.out.println("Enter mark");
        obj.markE=s.nextInt();
        System.out.println("Enter course unit 6");
        obj.sub6=s.next();
        System.out.println("Enter mark");
        obj.markF=s.nextInt();
        
        if(obj.markA>=80&&obj.markA<=100){
           obj.gradeA ="A";
           obj.gpaA="5.0";
        }else
            if(obj.markA>=70&&obj.markA<80){
        obj.gradeA="B";
         obj.gpaA="4.5";
            }else
                if(obj.markA>=60&&obj.markA<70){
                    
                    obj.gradeA="C";
                     obj.gpaA="4.0";
                }else
                    if(obj.markA>=50&&obj.markA<60){
                        obj.gradeA="D";
                        obj.gpaA="3.5";
                        
                    }else if(obj.markA<50&&obj.markA>0){
                        obj.gradeA="F";
                        obj.gpaA="2.5";
                    }else
                        obj.gradeA="invalid";
                        
        
         if(obj.markB>=80&&obj.markB<=100){
           obj.gradeB ="A";
           obj.gpaB="5.0";
        }else
            if(obj.markB>=70&&obj.markB<80){
        obj.gradeB="B";
        obj.gpaB="4.5";
            }else
                if(obj.markB>=60&&obj.markB<70){
                    obj.gradeB="C";
                    obj.gpaB="4.0";
                }else
                    if(obj.markB>=50&&obj.markB<60){
                        obj.gradeB="D";
                        obj.gpaB="3.5";
                        
                    }else if(obj.markB<50&&obj.markB>0){
                        obj.gradeB="F";
                        obj.gpaB="3.0";
                    }else
                        obj.gradeB="invalid";
                         
          if(obj.markC>=80&&obj.markC<=100){
           obj.gradeC ="A";
           obj.gpaC="5.0";
        }else
            if(obj.markC>=70&&obj.markC<80){
        obj.gradeC="B";
        obj.gpaC="4.5";
            }else
                if(obj.markC>=60&&obj.markC<70){
                    obj.gradeC="C";
                    obj.gpaC="4.0";
                }else
                    if(obj.markC>=50&&obj.markC<60){
                        obj.gradeC="D";
                        obj.gpaC="3.5";
                        
                    }else if(obj.markC<50&&obj.markC>0){
                        obj.gradeC="F";
                        obj.gpaC="3.0";
                    }else
                        obj.gradeC="invalid";
                       
                         
           if(obj.markD>=80&&obj.markD<=100){
           obj.gradeD ="A";
           obj.gpaD="5.0";
        }else
            if(obj.markD>=70&&obj.markD<80){
        obj.gradeD="B";
        obj.gpaD="4.5";
            }else
                if(obj.markD>=60&&obj.markD<70){
                    obj.gradeD="C";
                    obj.gpaD="4.0";
                }else
                    if(obj.markD>=50&&obj.markD<60){
                        obj.gradeD="D";
                        obj.gpaD="3.5";
                        
                    }else if(obj.markD<50&&obj.markD>0){
                        obj.gradeD="F";
                        obj.gpaD="3.0";
                    }else
                        obj.gradeD="invalid";
                        
                         
           if(obj.markE>=80&&obj.markE<=100){
           obj.gradeE ="A";
           obj.gpaE="5.0";
        }else
            if(obj.markE>=70&&obj.markE<80){
        obj.gradeE="B";
        obj.gpaE="4.5";
            }else
                if(obj.markE>=60&&obj.markE<70){
                    obj.gradeE="C";
                    obj.gpaE="4.0";
                }else
                    if(obj.markE>=50&&obj.markE<60){
                        obj.gradeE="D";
                        obj.gpaE="3.5";
                        
                    }else if(obj.markE<50&&obj.markE>0){
                        obj.gradeE="F";
                        obj.gpaE="3.0";
                    }else
                        obj.gradeE="invalid";
                        
           
           if(obj.markF>=80&&obj.markF<=100){
           obj.gradeF ="A";
           obj.gpaF="5.0";
        }else
            if(obj.markF>=70&&obj.markF<80){
        obj.gradeF="B";
        obj.gpaF="4.5";
            }else
                if(obj.markF>=60&&obj.markF<70){
                    obj.gradeF="C";
                    obj.gpaF="4.0";
                }else
                    if(obj.markF>=50&&obj.markF<60){
                        obj.gradeF="D";
                        obj.gpaF="3.5";
                        
                    }else if(obj.markF<50&&obj.markF>0){
                        obj.gradeF="F";
                        obj.gpaF="3.0";
                    }else
                        obj.gradeF="invalid";
                      
        
        System.out.println("Name: "+obj.name);
        System.out.println("courses ");
        System.out.println(obj.sub1+" "+obj.markA+" "+obj.gradeA+" "+obj.gpaA);
        System.out.println(obj.sub2+" "+obj.markB+" "+obj.gradeB+" "+obj.gpaB);
        System.out.println(obj.sub3+" "+obj.markC+" "+obj.gradeC+" "+obj.gpaC);
        System.out.println(obj.sub4+" "+obj.markD+" "+obj.gradeD+" "+obj.gpaD);
        System.out.println(obj.sub5+" "+obj.markE+" "+obj.gradeE+" "+obj.gpaE);
        System.out.println(obj.sub6+" "+obj.markF+" "+obj.gradeF+" "+obj.gpaF);
          float ava=(obj.markA+obj.markB+obj.markC+obj.markD+obj.markE+obj.markF)*100/600;
        System.out.println("average IS: "+ ava); 
     
        
    }
                }
    
    

