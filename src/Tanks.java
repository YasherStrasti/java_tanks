class LevelTanks {
    int level;
}
public class Tanks {
    public static void main(String[] args){
        LevelTanks tank1 = new LevelTanks();
        LevelTanks tank2 = new LevelTanks();

        tank1.level = 2;
        tank2.level = 57;

        System.out.println("1. Уровень первого танка: " + tank1.level + "\n " + "  Уровень второго танка: " + tank2.level);

        tank1 = tank2;
        System.out.println("2. Уровень первого танка: " + tank1.level + "\n " + "  Уровень второго танка: " + tank2.level);

        tank1.level = 27;
        System.out.println("3. Уровень первого танка: " + tank1.level + "\n " + "  Уровень второго танка: " + tank2.level);
    }
}