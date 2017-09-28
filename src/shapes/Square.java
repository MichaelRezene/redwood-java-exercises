package shapes;

   public class Square extends Rectanlge {

       int side = 5;

    public Square(double side){
        super(side, side);
    }
       public  double getArea(){
          return this.side * this.side; // or (this.length * this.length)

       }
       public double getPerimeter(){
          return  this.side * 4;

       }

}
