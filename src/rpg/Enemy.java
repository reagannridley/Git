package rpg;

class Enemy {
    private String name;
    private int hp;
    private int def;
    private static int baseAtk = 46;
    private Weapon weapon;
    private int level = 1;
    private int attackPower;

    public Enemy(String name, int hp, int def, Weapon weapon, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.weapon = weapon;
        this.attackPower = attackPower;
    }
    public String getName(){
        return name;
    }
    
    public int getAp(){
        return attackPower;
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
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void attack(Hero hero) {
        int damage = level * baseAtk + weapon.use() - hero.getDef() + weapon.randomAtk();
        hero.takeDamage(damage);
        hero.defense();
    }
    
    public void defense() {
        def += baseAtk * level / 2;
    }
    
    public void remedy() {
        hp += 100;
        if (hp > 1000) {
            hp = 1000;
        }
    }
    
    public boolean isDefeated() {
        return hp <= 0;
    }
    
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
    
    public void printStatus() {
        System.out.println("Enemy Status:");
        System.out.println("HP: " + hp);
        System.out.println("DEF: " + def);
        System.out.println("Level: " + level);
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Weapon ATK: " + weapon.getAtk());
        System.out.println("Weapon Condition: " + weapon.getCondition());
        System.out.println("---------------------");
    }

    public void setDef(int i) {
    }
    
}
