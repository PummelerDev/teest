public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.testString = "TEST";
        System.out.println(test);

        String s = """
                new branch
                """;
        String ss = """
                some changes
                """;
        String ss2 = """
                some changes2 + new branch
                """;

    }
}
