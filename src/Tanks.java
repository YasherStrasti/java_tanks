import levels.LevelTanks;

public class Tanks {
    public static void main(String[] args){
        LevelTanks tank1 = new LevelTanks(10, "abc", true);
        LevelTanks tank2 = new LevelTanks(15, "edf", false);

        System.out.println("1. Уровень первого танка: " + tank1.getLevel() + "\n " + "  Уровень второго танка: " + tank2.getLevel());

        tank1 = tank2;
        System.out.println("2. Уровень первого танка: " + tank1.getLevel() + "\n " + "  Уровень второго танка: " + tank2.getLevel());

        tank1.setLevel(27);
        System.out.println("3. Уровень первого танка: " + tank1.getLevel() + "\n " + "  Уровень второго танка: " + tank2.getLevel());

    }

}