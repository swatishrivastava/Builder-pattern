public class Application {
    public static void main(String[] args) {

        LunchOrder.Builder builder=new LunchOrder.Builder();
        builder.lettuce("lettuce").wheat("Multigrain");
        LunchOrder lunch = builder.getMeLunch();

        System.out.println(lunch.getLettue());
        System.out.println(lunch.getMeat());
        System.out.println(lunch.getWheat());


    }
}
