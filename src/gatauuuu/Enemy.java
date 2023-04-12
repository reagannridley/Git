// package gatauuuu;

// public class Enemy{
// private String name;
// private int health;
// private int attackPower;
// private int defensePower;
// private Weapon weapon; 
// private int level;
// private static int baseAtk;

// public Enemy(String name, int health, int attackPower, int defensePower, Weapon weapon) {
//     this.name = name;
//     this.health = health;
//     this.attackPower = attackPower;
//     this.defensePower = defensePower;
//     this.weapon = weapon;
// }

// public String getName() {
//     return name;
// }

// public void setName(String name) {
//     this.name = name;
// }

// public int getHealth() {
//     return health;
// }

// public void setHealth(int health) {
//     this.health = health;
// }

// public int getAttackPower() {
//     return attackPower;
// }

// public void setAttackPower(int attackPower) {
//     this.attackPower = attackPower;
// }

// public int getDefensePower() {
//     return defensePower;
// }

// public void setDefensePower(int defensePower) {
//     this.defensePower = defensePower;
// }

// public Weapon getWeapon() {
//     return weapon;
// }

// public void setWeapon(Weapon weapon) {
//     this.weapon = weapon;
// }

// public void attack(Hero hero) {
//     int damage = this.attackPower * this.weapon.getDamage() + this.weapon.randomAtk(this.weapon) - hero.getDefensePower();
//     if (damage > 0) {
//         hero.setHealth(hero.getHealth() - damage);
//     }
// }

// public void defense() {
//     this.defensePower += this.attackPower * this.getHealth() / 2;
// }

// public void remedy() {
//     this.health += 100;
// }
// }