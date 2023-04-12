package rpg;

    public class Main {
        public static void main(String[] args) {
            Hero hero = new Hero("Mantissa", 1000, 700, new Weapon("Excalibur", 100), 1000);
            Enemy enemy = new Enemy("Shadow Weaver", 1000, 500, new Weapon("Darkness", 80), 1000);
           //Scanner scanner = new Scanner(System.in);
            
            System.out.println("THE BATTLE OF ETHERIA");
            System.out.println(hero.getName() + " vs " + enemy.getName());
            System.out.println("----------------------------------------");
            
            while (hero.getHp() > 0 && enemy.getHp() > 0) {
                int action = (int)(Math.random()*10) % 3;
                switch (action) {
                    case 0: // Hero attacks enemy
                        hero.attack(enemy);
                        System.out.println("Mantisa attacks Shadow Weaver. Her eyes saddened because they were once lovers. But Shadow Weaver has turned evil and for the sake of Etheria, Mantissa has to get rid of her.");
                        hero.printStatus();
                        break;
                    case 1: // Hero defends
                        hero.defense();
                        System.out.println("Mantisa is defending herself");
                        hero.printStatus();
                        break;
                    case 2: // Hero heals
                        hero.heal();
                        System.out.println("Mantisa is drinking the mermaid tears");
                        hero.printStatus();
                        break;
                }
                if (enemy.getHp() <= 0) {
                    System.out.printf("%s won the battle! %s has been defeated!\n", hero.getName(), enemy.getName());
                    break;
                }
                action = (int)(Math.random()*10) % 2;
                switch (action) {
                    case 0: // Enemy attacks hero
                        enemy.attack(hero);
                        System.out.println("Enemy attacks hero brutally");
                        enemy.printStatus();
                        break;
                    case 1: // Enemy defends
                        enemy.defense();
                        System.out.println("Enemy defends");
                        enemy.printStatus();
                        break;
                }
                
                if (hero.getHp() <= 0) {
                    System.out.printf("%s has been defeated! %s won!\n", hero.getName(), enemy.getName());
                    break;
                }
            }
            System.out.println("FINAL STATUS: ");
                hero.printStatus();
                enemy.printStatus();

        }
    }