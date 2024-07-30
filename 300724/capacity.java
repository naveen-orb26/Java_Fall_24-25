public class capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Short note");
        System.out.println(sb.capacity());
        sb.append("Trying medium length");
        System.out.println(sb.capacity());
        // sb.append("On adding a larger note the capacity is set high");
        // System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
