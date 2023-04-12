package rpg;

//import java.util.Random;

class Hero {
    private String name;
    private int hp;
    private int def;
    private static int baseAtk = 58;
    private Weapon weapon;
    private int level = 1;
    private int attackPower;
    
    public Hero(String name, int hp, int def, Weapon weapon, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.weapon = weapon;
        this.attackPower = attackPower;
    }

    public String getName(){
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public static int getBaseAtk() {
        return baseAtk;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getLevel() {
        return level;
    }
    
    public int getAttackPower() {
        return attackPower;
    }

    public int attack(Enemy en) {
        int damage = level * baseAtk + weapon.use() + attackPower - en.getDef() + Weapon.randomAtk(weapon);
        en.takeDamage(damage);
        en.setDef(0);
        return damage;
    }

    // public void doubleAtk(){
    //     attack(en);
    //     attack(en);
    // }

    //tambahin method ultimate
    
    public void defense() {
        def += baseAtk * level / 2;
    }

    public void heal() {
        hp += 100;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void printStatus() {
        System.out.println("Hero Status:");
        System.out.println("HP: " + hp);
        System.out.println("DEF: " + def);
        System.out.println("Level: " + level);
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Weapon ATK: " + weapon.getAtk());
        System.out.println("Weapon Condition: " + weapon.getCondition());
        System.out.println("---------------------");
    }
    // public void setAttackPower(int attackPower) {
    //     this.attackPower = attackPower;
    // }

    public void takeDamage(int damage) {
    }
}

