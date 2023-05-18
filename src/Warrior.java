public class Warrior extends Hero{
    public Warrior(String heroesAttackType) {
        super(heroesAttackType);
    }

    @Override
    public String superAbilityType() {
        return "Warrior применил суперспособность CRITICAL DAMAGE";

    }
}
