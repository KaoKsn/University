// 2 - Method overloading.
import java.lang.Math;
class Point
{
    int x, y;
    public Point()
    {
        this.x = this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int[] getXY()
    {
        int points[] = {this.x, this.y};
        return points;
    }
    public String toString()
    {
        String msg = "Point: (x, y) = (%d, %d)";
        return String.format(msg, this.x, this.y);
    }
    public double distance()
    {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double distance(int x, int y)
    {
        int netX = this.x - x, netY = this.y - y;
        return Math.sqrt(netX * netX + netY * netY);
    }
    public double distance(Point point)
    {
        int netX = this.x - point.x, netY = this.y - point.y;
        return Math.sqrt(netX * netX + netY * netY);
    }
}

class Plane
{
    public static void main(String args[])
    {
        Point p = new Point();
        Point q = new Point(3,4);
        p.setXY(3,4);

        System.out.println("Point p: " + p);
        int qXY[] = q.getXY();
        System.out.printf("Point q: (x, y) = (%d, %d)\n", qXY[0], qXY[1]);

        System.out.println("Distance b/w p and q: " + p.distance(q));
        System.out.println("Distance b/w p and origin: " + p.distance());
        System.out.println("Distance b/w p and (1,2): " + p.distance(1, 2));
    }
}
