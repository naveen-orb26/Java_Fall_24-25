public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" there ");
        System.out.println(sb);
        sb.insert(13,"!");
        System.out.println(sb);
        sb.replace(0,7,"Hello");
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
