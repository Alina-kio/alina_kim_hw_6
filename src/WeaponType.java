public enum WeaponType {
    COLD("Холодное"),
    FIREARMS("Огнестрельное"),
    PNEUMATIC("Холодное");

    private String weaponType;

    WeaponType(String weaponType){
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }
}
