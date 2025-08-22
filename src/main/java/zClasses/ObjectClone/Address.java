package zClasses.ObjectClone;

public class Address implements Cloneable{
   private String flat;
    private String Area;

    private String pin;

    public Address(String flat, String area, String pin) {
        this.flat = flat;
        Area = area;
        this.pin = pin;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
