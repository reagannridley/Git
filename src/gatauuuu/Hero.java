// package gatauuuu;

// public class Hero {
//     private String name;
//     private int hp;
//     private static int baseAtk = 58;
//     private int attackPower;
//     private int defensePower;
//     private Weapon weapon;
//     private int level;
   


//     public Hero(String name, int hp, int attackPower, int defensePower, Weapon weapon, int level ) {
//         this.name = name;
//         this.hp = hp;
//         this.attackPower = attackPower;
//         this.defensePower = defensePower;
//         this.weapon = weapon;
//         this.level = level;
        
//     }

//     public String getName() {
//         return name;
//     }

//     public int getHp() {
//         return hp;
//     }

//     public void setHp(int hp) {
//         this.hp = hp;
//     }

//     public int getAttackPower() {
//         return attackPower;
//     }

//     public void setAttackPower(int attackPower) {
//         this.attackPower = attackPower;
//     }

//     public int getDefensePower() {
//         return defensePower;
//     }

//     public void setDefensePower(int defensePower) {
//         this.defensePower = defensePower;
//     }

//     public Weapon getWeapon() {
//         return weapon;
//     }

//     public void setWeapon(Weapon weapon) {
//         this.weapon = weapon;
//     }

//     // Method
    
//     public void attack(Enemy enemy) {
//         int damage = this.level() * Hero.baseAtk() + this.weapon.getDamage() - enemy.getDefensePower() + this.weapon.randomAtk(weapon);
//         enemy.setHealth(enemy.getHealth() - damage);
//         enemy.setDefensePower(0);
//     }

//     private static int baseAtk() {
//         return 0;
//     }

//     public void defense() {
//         int defense = this.baseAtk() * this.level() / 2;
//         this.setDefensePower(this.getDefensePower() + defense);
//     }

//     public void heal() {
//         this.setHealth(this.getHealth() + 100);
//     }

//     private int level() {
//         return this.attackPower / 10;
//     }

   
   
// }
