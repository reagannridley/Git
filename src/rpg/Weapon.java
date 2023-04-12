package rpg;

class Weapon {
    private int atk;
    private String name;
    private boolean isBroken;
    private int condition = 100;
    
    public Weapon(String name, int atk) {
        this.name = name;
        this.atk = atk;
        this.isBroken = false;
    }

    public int getAtk() {
        return atk;
    }

    public String getName() {
        return name;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public int getCondition() {
        return condition;
    }

    public void repair() {
        this.condition = 100;
        this.isBroken = false;
    }

    public int use() {
        if (condition <= 0) {
            isBroken = true;
            return 0;
        }
        int attack = (int) (0.1 + Math.random() * 0.2) * atk;
        condition -= 10;
        if (condition <= 0) {
            isBroken = true;
        }
        return attack;
    }

    public static int randomAtk(Weapon w) {
        int attack = (int) (0.1 + Math.random() * 0.2) * w.getAtk();
        return attack;
    }

    public int randomAtk() {
        return 0;
    }
}

