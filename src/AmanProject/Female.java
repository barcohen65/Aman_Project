package AmanProject;

public class Female extends Person{

    private String hairColor;

    public Female(String fullName, String gender, String age, String profession, String dominatedCharacter, String preferredGender, String preferredMaxAge, String preferredProfession, String preferredCharacter, String hairColor) {
        super(fullName, gender, age, profession, dominatedCharacter, preferredGender, preferredMaxAge, preferredProfession, preferredCharacter);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
