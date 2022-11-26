public class Human {
    public String name;
    public int age;
    public int height;
    public int shoesNumber;


    public Human(String name, int age, int height, int shoesNumber) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.shoesNumber = shoesNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setShoesNumber(int shoesNumber) {
        this.shoesNumber = shoesNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getShoesNumber() {
        return this.shoesNumber;
    }

}


