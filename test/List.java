// package test;

public class List {
    static public void main(String[] args) {

        Pokemon pikachu = new Pokemon(025, 
                                        "ピカチュウ", 
                                        "でんきポケモン", 
                                        "でんき", 
                                        "せつめい");

         Pokemon purin = new Pokemon(666, 
                                        "プリン", 
                                        "ふうせんポケモン", 
                                        "ノーマル", 
                                        "あほ　ばか　まぬけ最弱");

        Pokemon zenigame = new Pokemon(001, 
                                        "ゼニガメ", 
                                        "おかねポケモン", 
                                        "みず", 
                                        "金の亡者");

 

        System.out.print("No." + pikachu.number);
        System.out.println(" " + pikachu.name);
        System.out.print(pikachu.category);
        System.out.println(" " + pikachu.type + "タイプ");
        System.out.println(pikachu.description);
        
        Pokemon charactars[] = {pikachu, purin, zenigame};
        for (Pokemon chara: charactars) {
            System.out.print("No." + chara.number);
            System.out.println(" " + chara.name);
            System.out.print(chara.category);
            System.out.println(" " + chara.type + "タイプ");
            System.out.println(chara.description);
        }
    }
}
