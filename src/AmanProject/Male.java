package AmanProject;

public class Male extends Person {

    private String height;

    public Male(String fullName, String gender, String age, String profession, String dominatedCharacter, String preferredGender, String preferredMaxAge, String preferredProfession, String preferredCharacter, String height) {
        super(fullName, gender, age, profession, dominatedCharacter, preferredGender, preferredMaxAge, preferredProfession, preferredCharacter);
        this.height = height;
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
