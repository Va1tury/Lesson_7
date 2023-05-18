public class Main {
    public static void main(String[] args) {
        createHeroes();
        for (Hero heroes: createHeroes()){
            System.out.println("суперспособность героя:"+heroes.getHeroesAttackType() );
        }
        Magic magic = new Magic("MAGICAL STRIKES");
        System.out.println(magic.superAbilityType());
        Medic medic = new Medic("TREATMENT");
        System.out.println(medic.superAbilityType());
        Warrior warrior = new Warrior("CRITICAL DAMAGE");
        System.out.println(warrior.superAbilityType());
    }
    public static Hero[] createHeroes() {
        Hero warrior = new Warrior("MAGICAL STRIKES");
        Hero medic = new Medic("TREATMENT");
        Hero magic = new Magic("MAGICAL STRIKES");
        return new Hero[]{warrior,medic,magic};
    }
}
