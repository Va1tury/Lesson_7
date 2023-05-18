public class Medic extends Hero {
    public Medic(String heroesAttackType) {
        super(heroesAttackType);
    }

    @Override
    public String superAbilityType() {
        return "Medic применил суперспособность TREATMENT";
    }
}
