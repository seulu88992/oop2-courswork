/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {

    
    public static void main(String[] args) {
        int n=1;
        String x;
        Scanner sis=new Scanner(System.in);
        ArrayList<String> seu=new ArrayList();
        while(true){
            System.out.println("enter name"+n+";");
            x=sis.next();
        
        
     if(x.toLowerCase().equals("exit")){
        break;
        }else
        {
        int cour1=0, cour2=0, cour3=0, cour4=0, cour5=0, cour6=0;
         String obj1=null,obj2=null,obj3=null,obj4=null,obj5=null, obj6=null;
         while( cour1<=0||cour1>=100){
             if(cour1==0){
                 System.out.println("course 1");
                 obj1=sis.next();
                 
             }
             
             System.out.println("course mark");
            cour1=sis.nextInt();
                  
             
         }
         while(cour2<=0||cour2>=100){
             if(cour2==0){
                 System.out.println("course2");
                 obj2=sis.next();
                 
             }
            System.out.println("course marks");
            cour2=sis.nextInt();
           
             
         }
         while(cour3<=0||cour3>=100){
             if(cour3==0){
                 System.out.println("course3" );
                 obj3=sis.next();
                 
             }
             System.out.println("course mark");
             cour3=sis.nextInt();
            
         }
         while(cour4<=0||cour3>=100){
         if(cour4==0){
             System.out.println("course4");
             obj4=sis.next();
             
         }
         System.out.println("course mark");
         cour4=sis.nextInt();
         
        }
         while(cour5<=0||cour5>=100){
             if(cour5==0){
             System.out.println("course5");
             obj5=sis.next();
            
             }
             System.out.println("course mark");
             cour5=sis.nextInt();
             
         }
         while(cour6<=0||cour6>=100){
             if(cour6==0){
             System.out.println("course6");
             obj6=sis.next();
             }
             System.out.println("course mark");
             cour6=sis.nextInt();
             
         }
         System.out.println(x);
         System.out.println("course"+" "+obj1+" "+cour1);
         System.out.println("course"+" "+obj2+" "+cour2);
         System.out.println("course"+" "+obj3+" "+cour3);
         System.out.println("course"+" "+obj4+" "+cour4);
         System.out.println("course"+" "+obj5+" "+cour5);
         System.out.println("course"+" "+obj6+" "+cour6);
              
          float ava=(cour1+cour2+cour3+cour4+cour5+cour6)*100/600;
        System.out.println("average IS: "+ ava);
 }
            
            n++;
        
        
    
        }
            
    } 
        
    }
    

