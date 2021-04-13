package question4;

import question3.ExceptionClass;
class CollisionException extends Exception{
    public CollisionException(String s){
        super(s);
    }
}
class Car{
//    this distance is from origin
    int dist;
    Car(int dist){
        this.dist = dist;
    }
}
public class CollisionDetection {

    static void detectCollision(Car A, Car B) throws CollisionException{
        int a= A.dist;
        int b = B.dist;

        while(a<b){
           a +=1 ;
           b -= 1;
            if(a>=b){
                throw new CollisionException("Collision Avoided Successfully");
            }
        }

    }
    public static void main(String[] args) {
//        let say we are going to take one car distance in positive
//        other one car distance from origin in negative
        Car A = new Car(40);
        Car B = new Car(140);
        try {
            CollisionDetection.detectCollision(A,B);
        }
        catch(CollisionException E)
        {
            System.out.println(E.getMessage());
            System.out.println(E);
        }

    }
}
