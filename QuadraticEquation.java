public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    public double  getDeltas() {
        return b * b - 4 * a * c ;
    }
    public double getRoof1() {
        if (getDeltas()<0) {
            return 0;
        }else{
            return (-b + Math.sqrt(getDeltas())) / (2 * a);
        }
    }
    public double getRoof2() {
        if (getDeltas()<0) {
            return 0;
        }else{
            return (-b - Math.sqrt(getDeltas())) / (2 * a);
        }
    }
}
