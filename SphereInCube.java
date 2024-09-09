/*
@Author: Surina Arora 
@Date: Oct. 13th, 2023
@Description:
This program calculates the left over volume of a cube that holds a sphere with a
diameter of the length of the cube. 
*/ 

import java.util.Scanner; 

class SphereInCube<SurinaArora> {
   public static void main (String [] args) {
   
   Scanner uI = new Scanner (System.in);
   
   //line 18 declares the first variable. 
   
   double length = 0;  
   
   //lines 22-24 allow the user to input the length of one side of a cube, using the declaration of the variable above. 
   
   System.out.printf("Please enter the length of one side of the cube: "); 
   Scanner lengthNum = new Scanner (System.in); 
      length = uI.nextDouble();
      
   //lines 28 and 29 declare set variables, which represent the equation to calculate the radius, along with the equation to calculate the volume of a sphere. 
      
   double radius = (length/2);
   double volumeOfSphere = (4.0/3 * Math.PI * Math.pow(radius,3)); // 4/3 would not work as it rounds down after divison, which is why the solution is to use 4.0/3
   
   //line 33 incorporates the assigned variables above, to tell the use what the volume of the sphere is with the inputted diameter. 
   
   System.out.printf("The volume of a sphere with a diameter of %.0f is %.2f^3\n", length,volumeOfSphere);
   
   //line 37 declares a variable which represents the equation to calculate the volume of a cube. 
      
   double volumeOfCube = (Math.pow(length,3));
   
   //line 39 incorporates the use of the assigned variable above, to output to the user what the volume of a cube with the inputted side length is.
   
   System.out.printf("The volume of a cube with a side length of %.0f is %.2f^3\n",length,volumeOfCube); // the use of %.0f is to ensure that the length is outputted with no decimal places. 
   
   //line 45 finally displays to the user what the left over volume of the cube that holds the sphere is, by subtracting the volume of the cube with the volume of the sphere. 
   
   System.out.printf("The volume of a cube minus the displaced volume of the sphere is %.2f^3",(volumeOfCube - volumeOfSphere));

   } // ends main() method
} // ends the whole program 