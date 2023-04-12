// package gatauuuu;

// public class Weapon {
//     private String name;
//     private int atk;
//     private boolean isBroken;
//     private int condition;

    
//     public Weapon(String name, int atk) {
//         this.name = name;
//         this.atk = atk;
//         this.isBroken = false;
//         this.condition = 100;
//     }
    
//     public int getAtk() {
//         return atk;
//     }
    
//     public void setAtk(int atk) {
//         this.atk = atk;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     public void setName(String name) {
//         this.name = name;
//     }
    
//     public boolean isBroken() {
//         return isBroken;
//     }
    
//     public int getCondition() {
//         return condition;
//     }
    
//     public void setCondition(int condition) {
//         this.condition = condition;
//     }
    
//     public void repair() {
//         this.condition = 100;
//         this.isBroken = false;
//     }
    
//     public int use() {
//         if (this.condition > 10) {
//             this.condition -= 10;
//             return this.atk;
//         } else {
//             this.isBroken = true;
//             return 0;
//         }
//     }
    
//     public static int randomAtk(Weapon w) {
//         double randomPercentage = Math.random() * 0.2 + 0.1;
//         int randomAtk = (int) Math.round(w.getAtk() * randomPercentage);
//         return randomAtk;
//     }

//     public int getDamage() {
//         return 0;
//     }
    
// }
