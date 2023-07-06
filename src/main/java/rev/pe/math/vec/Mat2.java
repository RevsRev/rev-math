package rev.pe.math.vec;

public class Mat2
{
    /*
        a b
        c d
     */
    public double a;
    public double b;
    public double c;
    public double d;

    public Mat2(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Mat2 mult(Mat2 r) {
        return new Mat2(a*r.a + b* r.c, a*r.b + b*r.d, c*r.a + d*r.c, c*r.b + d*r.d);
    }

    public Vec2 mult(Vec2 v) {
        return new Vec2(a*v.x + b*v.y, c*v.x + d*v.y);
    }

    public Mat2 inverse() {
        double det = det();
        return new Mat2(d/det, -b/det, -c/det, a/det);
    }
    public double det() {
        return a*d - c*b;
    }
}
