import java.util.Scanner;

public class Lab05 {
    public static class Heroes{
        public String name;
        static double atk = 100;
        static double def = 100;
        static double speed = 100;
        public Heroes(String name) {
            this.name = name;
        }
        static Cape equippedCape;
        static Mask equippedMask;
        static Boots equippedBoots;
        static Weapon equippedWeapon;
    }
    public static class Villains{
        public String name;
        static double atk = 100;
        static double def = 100;
        static double speed = 100;
        public Villains(String name) {
            this.name = name;
        }
        static Cape equippedCape;
        static Mask equippedMask;
        static Boots equippedBoots;
        static Weapon equippedWeapon;
    }
    public static String roleSelect(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Select Role ((1)Hero / (2)Villain): ");
            int roleNum = s.nextInt();
            if(roleNum == 1) return "Hero";
            else if (roleNum == 2) return "Villain";
        }
    }
    public static void heroEquipMask(Mask mask){
        Heroes.equippedMask = mask;
        Heroes.atk += mask.atkUp;
        Heroes.def += mask.defUp;
        Heroes.speed += mask.speedUp;
    }
    public static void heroEquipCape(Cape cape){
        Heroes.equippedCape = cape;
        Heroes.atk += cape.atkUp;
        Heroes.def += cape.defUp;
        Heroes.speed += cape.speedUp;
    }
    public static void heroEquipBoots(Boots boots){
        Heroes.equippedBoots = boots;
        Heroes.atk += boots.atkUp;
        Heroes.def += boots.defUp;
        Heroes.speed += boots.speedUp;
    }
    public static void heroEquipWeapon(Weapon weapon){
        Heroes.equippedWeapon = weapon;
        Heroes.atk += weapon.atkUp;
        Heroes.def += weapon.defUp;
        Heroes.speed += weapon.speedUp;
    }
    public static void villainEquipMask(Mask mask){
        Villains.equippedMask = mask;
        Villains.atk += mask.atkUp;
        Villains.def += mask.defUp;
        Villains.speed += mask.speedUp;
    }
    public static void villainEquipCape(Cape cape){
        Villains.equippedCape = cape;
        Villains.atk += cape.atkUp;
        Villains.def += cape.defUp;
        Villains.speed += cape.speedUp;
    }
    public static void villainEquipBoots(Boots boots){
        Villains.equippedBoots = boots;
        Villains.atk += boots.atkUp;
        Villains.def += boots.defUp;
        Villains.speed += boots.speedUp;
    }
    public static void villainEquipWeapon(Weapon weapon){
        Villains.equippedWeapon = weapon;
        Villains.atk += weapon.atkUp;
        Villains.def += weapon.defUp;
        Villains.speed += weapon.speedUp;
    }
    public static class Mask{  /* Mask -> FireMask, WaterMask, PlantMask, SunMask, MoonMask*/
        double atkUp;
        double defUp;
        double speedUp;
        String maskName;
        public Mask(double atkUp, double defUp, int speedUp, String maskName){
            this.atkUp = atkUp;
            this.defUp = defUp;
            this.speedUp = speedUp;
            this.maskName = maskName;
        }

    }
    public static class Cape{
        double atkUp;
        double defUp;
        double speedUp;
        String capeName;
        public Cape(double atkUp, double defUp, int speedUp, String capeName){
            this.atkUp = atkUp;
            this.defUp = defUp;
            this.speedUp = speedUp;
            this.capeName = capeName;
        }
    }
    public static class Boots {
        double atkUp;
        double defUp;
        double speedUp;
        String bootsName;

        public Boots(double atkUp, double defUp, int speedUp, String bootsName) {
            this.atkUp = atkUp;
            this.defUp = defUp;
            this.speedUp = speedUp;
            this.bootsName = bootsName;
        }
    }
    public static class Weapon {
        double atkUp;
        double defUp;
        double speedUp;
        String weaponName;

        public Weapon(double atkUp, double defUp, int speedUp, String weaponName) {
            this.atkUp = atkUp;
            this.defUp = defUp;
            this.speedUp = speedUp;
            this.weaponName = weaponName;
        }
    }
    public static void MaskSelect(String role) {
        Scanner s = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Pick a mask\n1. Mask Of The Dragon\n2. Mask Of The Ocean\n3. Mask Of The Yggdrasil\n4. Mask Of The Solar\n5. Mask Of The Luna");
        int maskNum;
        while(true){
            System.out.print("Enter number: ");
            int ans = s.nextInt();
            if(ans >= 1 && ans <= 5){
                maskNum = ans;
                break;
            }
        }
        Mask dragonMask = new Mask(55.7,20,20,"Mask Of The Dragon");
        Mask oceanMask = new Mask(45.5,30,35,"Mask Of The Ocean");
        Mask yggdrasilMask = new Mask(30.1,50,15,"Mask Of The Yggdrasil");
        Mask solarMask = new Mask(100,0,50,"Mask Of The Solar");
        Mask lunaMask = new Mask(100,0,50,"Mask Of The Luna");
        if(role.equals("Hero")){
            if(maskNum == 1) heroEquipMask(dragonMask);
            else if(maskNum == 2) heroEquipMask(oceanMask);
            else if(maskNum == 3) heroEquipMask(yggdrasilMask);
            else if(maskNum == 4) heroEquipMask(solarMask);
            else heroEquipMask(lunaMask);
        }else{
            if(maskNum == 1) villainEquipMask(dragonMask);
            else if(maskNum == 2) villainEquipMask(oceanMask);
            else if(maskNum == 3) villainEquipMask(yggdrasilMask);
            else if(maskNum == 4) villainEquipMask(solarMask);
            else villainEquipMask(lunaMask);
        }
    }
    public static void CapeSelect(String role) {
        Scanner s = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Pick a cape\n1. Cape Of The Hell Fire\n2. Cape Of The Poseidon\n3. Cape Of The Gaia\n4. Cape Of The Flare\n5. Cape Of The Eclipse");
        int capeNum;
        while(true){
            System.out.print("Enter number: ");
            int ans = s.nextInt();
            if(ans >= 1 && ans <= 5){
                capeNum = ans;
                break;
            }
        }
        Cape hellCape = new Cape(55.7,20,20,"Cape Of The Hell Fire");
        Cape poseidonCape = new Cape(45.5,30,35,"Cape Of The Poseidon");
        Cape gaiaCape = new Cape(30.1,50,15,"Cape Of The Gaia");
        Cape flareCape = new Cape(100,0,50,"Cape Of The Flare");
        Cape eclipseCape = new Cape(100,0,50,"Cape Of The Eclipse");
        if(role.equals("Hero")){
            if(capeNum == 1) heroEquipCape(hellCape);
            else if(capeNum == 2) heroEquipCape(poseidonCape);
            else if(capeNum == 3) heroEquipCape(gaiaCape);
            else if(capeNum == 4) heroEquipCape(flareCape);
            else heroEquipCape(eclipseCape);
        }else{
            if(capeNum == 1) villainEquipCape(hellCape);
            else if(capeNum == 2) villainEquipCape(poseidonCape);
            else if(capeNum == 3) villainEquipCape(gaiaCape);
            else if(capeNum == 4) villainEquipCape(flareCape);
            else villainEquipCape(eclipseCape);
        }
    }
    public static void BootsSelect(String role) {
        Scanner s = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Pick a boots\n1. Lava Walker\n2. Sea Walker\n3. Tough Walker\n4. Light Walker\n5. Dark Walker");
        int bootsNum;
        while(true){
            System.out.print("Enter number: ");
            int ans = s.nextInt();
            if(ans >= 1 && ans <= 5){
                bootsNum = ans;
                break;
            }
        }
        Boots lavaWalker = new Boots(55.7,20,20,"Lava Walker");
        Boots seaWalker = new Boots(45.5,30,35,"Sea Walker");
        Boots toughWalker = new Boots(30.1,50,15,"Tough Walker");
        Boots lightWalker = new Boots(50,0,100,"Light Walker");
        Boots darkWalker = new Boots(50,0,100,"Dark Walker");
        if(role.equals("Hero")){
            if(bootsNum == 1) heroEquipBoots(lavaWalker);
            else if(bootsNum == 2) heroEquipBoots(seaWalker);
            else if(bootsNum == 3) heroEquipBoots(toughWalker);
            else if(bootsNum == 4) heroEquipBoots(lightWalker);
            else heroEquipBoots(darkWalker);
        }else{
            if(bootsNum == 1) villainEquipBoots(lavaWalker);
            else if(bootsNum == 2) villainEquipBoots(seaWalker);
            else if(bootsNum == 3) villainEquipBoots(toughWalker);
            else if(bootsNum == 4) villainEquipBoots(lightWalker);
            else villainEquipBoots(darkWalker);
        }
    }
    public static void WeaponSelect(String role) {
        Scanner s = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Pick a weapon\n1. a Pistol\n2. a Stun Gun\n3. a Baseball Bat\n4. a Butterfly Knife\n5. Martial Arts");
        int weaponNum;
        while(true){
            System.out.print("Enter number: ");
            int ans = s.nextInt();
            if(ans >= 1 && ans <= 5){
                weaponNum = ans;
                break;
            }
        }
        Weapon pistol = new Weapon(100,10,10,"Pistol");
        Weapon stunGun = new Weapon(70,10,25,"Stun Gun");
        Weapon baseballBat = new Weapon(40,30,40,"Baseball Bat");
        Weapon butterflyKnife = new Weapon(50,15,50,"Butterfly Knife");
        Weapon mma = new Weapon(20,0,100,"Martial Arts");
        if(role.equals("Hero")){
            if(weaponNum == 1) heroEquipWeapon(pistol);
            else if(weaponNum == 2) heroEquipWeapon(stunGun);
            else if(weaponNum == 3) heroEquipWeapon(baseballBat);
            else if(weaponNum== 4) heroEquipWeapon(butterflyKnife);
            else heroEquipWeapon(mma);
        }else{
            if(weaponNum == 1) villainEquipWeapon(pistol);
            else if(weaponNum == 2) villainEquipWeapon(stunGun);
            else if(weaponNum == 3) villainEquipWeapon(baseballBat);
            else if(weaponNum== 4) villainEquipWeapon(butterflyKnife);
            else villainEquipWeapon(mma);
        }
    }
    public static void roleDisplay(String role, String name){
        if(role.equals("Hero")){
            System.out.println("Hero Name = " + name);
            System.out.println("Atk = " + Heroes.atk);
            System.out.println("Def = " + Heroes.def);
            System.out.println("Speed = " + Heroes.speed);
            if(Heroes.equippedMask != null) System.out.println("Mask = " + Heroes.equippedMask.maskName);
            else System.out.println("Mask = No mask equipped");
            if(Heroes.equippedCape != null) System.out.println("Cape = " + Heroes.equippedCape.capeName);
            else System.out.println("Cape = No cape equipped");
            if(Heroes.equippedBoots != null) System.out.println("Boots = " + Heroes.equippedBoots.bootsName);
            else System.out.println("Boots = No boots equipped");
            if(Heroes.equippedBoots != null) System.out.println("Weapon = " + Heroes.equippedWeapon.weaponName);
            else System.out.println("Weapon = No weapon equipped");
        }
        else{
            System.out.println("Villain Name = " + name);
            System.out.println("Atk = " + Villains.atk);
            System.out.println("Def = " + Villains.def);
            System.out.println("Speed = " + Villains.speed);
            if(Villains.equippedMask != null) System.out.println("Mask = " + Villains.equippedMask.maskName);
            else System.out.println("Mask = No mask equipped");
            if(Villains.equippedCape != null) System.out.println("Cape = " + Villains.equippedCape.capeName);
            else System.out.println("Cape = No cape equipped");
            if(Villains.equippedBoots != null) System.out.println("Boots = " + Villains.equippedBoots.bootsName);
            else System.out.println("Boots = No boots equipped");
            if(Villains.equippedBoots != null) System.out.println("Weapon = " + Villains.equippedWeapon.weaponName);
            else System.out.println("Weapon = No weapon equipped");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String role = roleSelect();
        System.out.print("Enter your name: ");
        String name = s.next();
        if(role.equals("Hero")) new Heroes(name);
        else new Villains(name);
        MaskSelect(role);
        CapeSelect(role);
        BootsSelect(role);
        WeaponSelect(role);
        System.out.println("***************************************************************");
        roleDisplay(role, name);
        System.out.println("***************************************************************");
    }
}
