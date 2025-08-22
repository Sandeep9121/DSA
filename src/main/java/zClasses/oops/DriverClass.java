package zClasses.oops;

public class DriverClass {

    public static void main(String[] args) {

        PojoClass pojo=new PojoClass();
        pojo.setX(10);
        pojo.setY(22);

        System.out.println("x :"+pojo.getX() +" y:"+pojo.getY());

    }
}
