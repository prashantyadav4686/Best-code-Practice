import java.util.Scanner;

class Area {
    public static void main(String args[]) {
        int Select;
        Scanner sc = new Scanner(System.in);
        System.out.println("Area Calculator");
        System.out.println("Select your Choice");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
          Select = sc.nextInt();
          Area Choice = new Area();
          
          switch(Select) {
              case 1:
                  Choice.Circle();
                  break;
              case 2:
                  Choice.Rectangle();
                  break;
              case 3:
                 Choice.Square();
                  break;
              case 4:
                  Choice.Triangle();
                  break;
              default :
                System.out.println("Enter a proper Shape");  
              
               
          }
    } 
    // Program to calculate the Area of Circle
    public void Circle() {
        float radius;
        double area;
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        area = 3.14*radius*radius;
        System.out.println("Area of circle = "+area);
    }
    // Program to calcvulate the Area of Rectangle
    public void Rectangle() {
        float area, length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of side");
        breadth = sc.nextFloat();
        area = length * breadth;
        System.out.println("Area of Rectangle = " +area);
        
    }
    // Program to calculate the Area of Square
    public void Square() {
        float area, side;
        System.out.println("Enter the length of side");
        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
        area = side * side;
        System.out.println("Area of Square = " +area);
    }
    // Program to calculate the Area of Triangle
    public void Triangle() {
        float altitude, base;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of altitude");
        altitude = sc.nextFloat();
        System.out.println("Enter the length of base");
        base = sc.nextFloat();
        area = 0.5 * base * altitude;
        System.out.println("Area of Triangle = " +area);
        
    }
}

    
