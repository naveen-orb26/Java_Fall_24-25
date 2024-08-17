public class Multipara{
    int modelYear;
    String modelName;
    public Multipara(int year, String name){
        modelYear=year;
        modelName= name;
    }
    public void print(){
        System.out.println(modelYear +" " +modelName);
    }
    public static void main(String[] args){
        int n = 2005;
        String name = "Porsche";
        Multipara o1 = new Multipara(n,name);
        o1.print();
    }
}