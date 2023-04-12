// package gatauuuu;

// public class Main {
//     public static void main(String[] args) {

//         System.out.println("THE BATTLE OF ETHERIA");
//         System.out.println("");

//         Weapon weapon1 = new Weapon("GREEN APRIL SWORD",  60);
//         Weapon weapon2 = new Weapon("BLACK MARCH KNIFE", 40);

//         Hero hero1 = new Hero("Mantisa", 100, 20, 10, weapon1);
//         Hero hero2 = new Hero("Makise", 150, 30, 15, weapon2);

//         Enemy enemy1 = new Enemy("Shadow Weaver", 100, 20, 10, weapon1);
//         Enemy enemy2 = new Enemy("Horde", 100, 20, 30, weapon2);

    
//         while(true){
//             int angka = (int) (Math.random() * 10)%3;
//             if(angka == 0){
//                 hero1.attack(enemy1);
//             } else if(angka == 1){
//                 hero1.defense();
//             } else if(angka == 2){
//                 hero1.heal();
//             } 

//             int angka2 = (int) (Math.random() * 10)%3;
//             if(angka == 0){
//                 enemy1.attack(hero1);
//             } else if(angka == 1){
//                 enemy1.defense();
//             } else if(angka == 2){
//                 enemy1.remedy();
//             } 
//         } 





//         // Hero 1 attack Enemy 1
//         System.out.println(hero1.getName() + " attacks " + enemy1.getName() + " with " + weapon1.getName());
//         enemy1.defense();
//         hero1.attack(enemy1);
//         System.out.println(enemy1.getName() + " health: " + enemy1.getHealth());

//         System.out.println("");

//         // Enemy 1 attack Hero 1
//         System.out.println(enemy1.getName() + " attacks " + hero1.getName() + " with " + weapon2.getName());
//         hero1.defense();
//         enemy1.attack(hero1);
//         System.out.println(hero1.getName() + " health: " + hero1.getHealth());

//         System.out.println("");

//         // Hero 2 attack Enemy 2
//         System.out.println(hero2.getName() + " attacks " + enemy2.getName() + " with " + weapon1.getName());
//         enemy2.defense();
//         hero2.attack(enemy2);
//         System.out.println(enemy2.getName() + " health: " + enemy2.getHealth());

//         System.out.println("");
        
//         // Enemy 2 attack Hero 2
//         System.out.println(enemy2.getName() + " attacks " + hero2.getName() + " with " + weapon1.getName());
//         hero2.defense();
//         enemy2.attack(hero2);
//         System.out.println(hero2.getName() + " health: " + hero2.getHealth());

      
//         }
//     }

