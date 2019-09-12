package calculator;

public interface calculatot{

// define obstract methods
    double add(double num1,double num2);
    double subtract (double num1,double num2 );
     double  divide( double num1,double num2 );
     double multiplay  (double num1,double num2 ) ;

    default double calculate( ) {
        return 0;
    }

}
