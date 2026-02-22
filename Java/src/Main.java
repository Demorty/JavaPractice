//class App {
//    public static void main(String[] args) {
//        var greeting = "Father!";
//        System.out.println(greeting);
//        System.out.println(greeting);
//        greeting = "Mother!";
//        System.out.println(greeting);
//        System.out.println(greeting);
//    }
//}

class App {
    public static void main(String[] args) {
        var rublesPerDollar = 75;
        var dollarCount = 50 * 1.25;
        var rublesCount = dollarCount * rublesPerDollar;
        System.out.println("The price is " + rublesCount + " rubles");
    }
}