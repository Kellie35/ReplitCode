class Main {
    public static void main(String[] args) {
        Student a1 = new Student("Bob", 10, 349583728);
        Student b = new Student("Bill", 11, 583958304);
        Student a2 = new Student("Bob", 10, 349583728);

        System.out.println(b.toString());
        System.out.println(a1.equals(a2));
    }
}