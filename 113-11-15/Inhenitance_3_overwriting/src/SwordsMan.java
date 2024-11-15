public  class SwordsMan extends Role {
    @Override
    public void fight() {
        super.fight();
        System.out.println("揮劍攻擊");
    }

    public void cure() {
        System.out.println("魔法治療");
    }
}