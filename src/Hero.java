public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String heroesAttackType;
    public Hero(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }
    public String getHeroesAttackType() {
        return heroesAttackType;
    }
}
