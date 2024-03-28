public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Marta",5,"woman","mother Cow");
        Cow cow1 = new Cow("Burenka",3,"woman","Burenka");
        Cow cow2 = new Cow("Ferdinand",7,"man","Byk");
        Cow cow3 = new Cow("Milka",1,"woman","maika");
        Cow cow4 = new Cow("Sneshka",6,"woman","Sneshka");
        Sheep sheep1 = new Sheep("Bambuk",2,"man","Bambuk");
        Sheep sheep2 = new Sheep("Laska",5,"woman","laska");
        Sheep sheep = new Sheep("Barash",3,"man","Barash");
        Horse horse = new Horse("Spirit",4,"man","Mustang");
        Horse horse1 = new Horse("Sahara",7,"man","Tulpar");
        Cow [] cows = {cow,cow2,cow3,cow4,cow1};
        Cow [] cows1 = {cow};
        Sheep [] sheep3 = {sheep,sheep1,sheep2};
        Sheep [] sheep4 = {sheep};
        Horse [] horse2 ={horse1,horse};
        Horse [] horses = {horse};
        Farm farm = new Farm("Aibek","Osh",cows,sheep3,horse2);
        Farm farm1 = new Farm("Elmir","Bishkek",cows1,sheep4,horses);
        System.out.println("           Cow          "+"\n"+
                "======================================"+"\n"+
                cow.toString()+"\n"+
        "                             Sheep         "+"\n"+
                "======================================"+"\n"+
                sheep.toString()+"\n"+
                "                     Horse           "+"\n"+
                "======================================"+"\n"+
                horse.toString()+"\n"+
                "                                         "+"\n"+
                "                    Farm Number 1          "+"\n"+
                "========================================"+"\n"+
                farm.toString()+"\n"+
                "                                         "+"\n"+
                "                    Farm Number 2         "+"\n"+
                "========================================"+"\n"+
                farm1.toString());


    }
}