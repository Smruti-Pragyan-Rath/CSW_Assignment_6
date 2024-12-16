public class q9 {
    //Write a program that reads to convert int, f loat, double, and boolean as string
    //1
    //types and convert them to respective object types using the valueOf method.
    int i=89;
    float f=89;
    double d= 78;
    boolean b= false;

    String s1= String.valueOf(i);
    String s2= String.valueOf(f);
    String s3= String.valueOf(d);
    String s4= String.valueOf(b);

    Integer i1= Integer.valueOf(s1);
    Float i2= Float.valueOf(s2);
    Double i3= Double.valueOf(s3);
    Boolean i4= Boolean.valueOf(s4);

}
