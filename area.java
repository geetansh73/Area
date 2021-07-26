import java.util.*;
class area
{
double areaofCircle(int r)
{
double area;
area=3.14*r*r;
return area;
}
static int areaofRectangle(int l,int w)
{
int area;
area=l*w;
return area;
}
static double areaofTriangle(int b,int h)
{
double area=1/2d*b*h;
return area;
}
public static void main(String geetansh[])
{
Scanner obj=new Scanner(System.in);
int r;
int l,w,b,h;
r=obj.nextInt();
l=obj.nextInt();
w=obj.nextInt();
b=obj.nextInt();
h=obj.nextInt();
area ob=new area();
double a=ob.areaofCircle(r);
int  s=areaofRectangle(l,w);
double y=areaofTriangle(b,h);
System.out.print("area of circle is: "+a+"area of rectangle is"+s+"area of traiangle"+y);
}
}



