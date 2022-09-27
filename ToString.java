public class ToString {
    public static void main(String args[]) {
        ToString thisObj = new ToString();
        thisObj.toStringMethod(thisObj);
        System.out.print("\n");
        thisObj.toStringMethod2();
    }
    public void toStringMethod(ToString obj){
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
    public void toStringMethod2(){
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus " + this);
    }
    public String toString() {
        return "ToString class";
    }
}
