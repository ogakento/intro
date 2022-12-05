class Ex7_22 {
    public static void main(String args[]) {
        // create objects
        Person person1 = new Person("Taro", "Tokyo", 1985, 9, 20, "080-1234-5678");
        Person person2 = new Person("Jiro", "Osaka", 1981, 6, 18, "090-8765-4321");
        Person person3 = new Person("Saburo", "Aichi", 1981, 12, 23, "090-3333-5555");
        Person person4 = new Person("Shiro", "Gifu", 1974, 2, 3, "090-2222-1111");

        // register friends of each person
        // Taro's friends
        Person[] person1Friends = new Person[2];
        person1Friends[0] = person2; // Jiro
        person1Friends[1] = person3; // Saburo

        // Jiro's friends
        Person[] person2Friends = new Person[3];
        person2Friends[0] = person1; // Taro
        person2Friends[1] = person3; // Saburo
        person2Friends[2] = person4; // Shiro

        // Saburo's friends
        Person[] person3Friends = new Person[1];
        person3Friends[0] = person4; // Shiro

        // Shiro's friends
        Person[] person4Friends = new Person[2];
        person4Friends[0] = person2; // Jiro
        person4Friends[1] = person3; // Saburo

        // set values to each objects
        person1.friends = person1Friends;
        person2.friends = person2Friends;
        person3.friends = person3Friends;
        person4.friends = person4Friends;

        // print each person's data
        System.out.print(person1);
        System.out.print(person2);
        System.out.print(person3);
        System.out.print(person4);
    }
}
