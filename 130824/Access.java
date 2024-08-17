
public class Access {
    public static void main(String[] args){
        Outeraccess oa = new Outeraccess();
        Outeraccess.Innerclass ia = oa.new Innerclass();
        System.out.println(ia.myInnerMethod());
    }
}
