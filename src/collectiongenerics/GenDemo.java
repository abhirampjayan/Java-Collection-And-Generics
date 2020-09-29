package collectiongenerics;

class Container<T extends  Number>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Container obj=new Container();
        obj.value=5;
        obj.show();
    }
}
