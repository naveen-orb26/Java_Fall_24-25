class Animal {
    String color="white";

}

class dog extends Animal{
    String color = "Black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Animals{
    public static void main(String[] args){
        dog d = new dog();
        d.printcolor();
    }
}