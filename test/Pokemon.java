// package test;

public class Pokemon {
    public int number;
    public String name;
    public String category;
    public String type;
    public String description;



    

    public Pokemon(int number, String name, String category, String type, String description) {
        this.number = number;
        this.name = name;
        this.category = category;
        this.type = type;
        this.description = description;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }


}
