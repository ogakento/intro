class Person {
    String firstName; // firstname
    String lastName; // lastname
    int birthYear; // year of birthdate
    int birthMonth; // month of birthdate
    int birthDay; // day of birthdate
    String phoneNumber; // phone number
    Person[] friends; // friends list

    Person(String firstN, String lastN, int year, int month, int day, String phone) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDay = day;
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        int i;
        String str;
        str = "NAME: "
                + this.lastName
                + " "
                + this.firstName
                + "\n"
                + "  Date of Birth: "
                + this.birthYear
                + " "
                + this.birthMonth
                + " "
                + this.birthDay
                + "\n"
                + "  Number of friends = "
                + this.friends.length
                + "\n";

        for (i = 0; i < this.friends.length; i++) {
            str = str
                    + "    Name of friend "
                    + i
                    + ": "
                    + this.friends[i].lastName
                    + " " + this.friends[i].firstName
                    + "\n"
                    + "    Date of Birth: " + this.friends[i].birthYear
                    + " "
                    + this.friends[i].birthMonth
                    + " "
                    + this.friends[i].birthDay
                    + "\n";
        }
        return str;
    }

}
