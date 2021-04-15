package question6;

public class wrapper2 {

        public static void main(String[] args) {

            //float
            float f = 5.6f ;
            //float to Float
            Float f1 = new Float(f) ;
            //Float to String
            String s = f1.toString(f1) ;
            //String to float
            f = Float.parseFloat(s) ;

            System.out.println(f);
            //float to String
            String str = String.valueOf(f) ;
            //String to Float
            System.out.println(str);
            Float i = new Float(str) ;
            //Float to float
            f = i.floatValue() ;

            System.out.println(f);
        }

    }

