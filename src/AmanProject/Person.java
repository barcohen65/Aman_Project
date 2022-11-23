package AmanProject;



public class Person {

    private String fullName;
    private String gender;
    private String age;
    private String profession;
    private String dominatedCharacter;
    private String preferredGender;
    private String preferredMaxAge;
    private String preferredProfession;
    private String preferredCharacter;

    public Person(String fullName, String gender, String age, String profession, String dominatedCharacter, String preferredGender, String preferredMaxAge, String preferredProfession, String preferredCharacter) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
        this.dominatedCharacter = dominatedCharacter;
        this.preferredGender = preferredGender;
        this.preferredMaxAge = preferredMaxAge;
        this.preferredProfession = preferredProfession;
        this.preferredCharacter = preferredCharacter;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDominatedCharacter() {
        return dominatedCharacter;
    }

    public void setDominatedCharacter(String dominatedCharacter) {
        this.dominatedCharacter = dominatedCharacter;
    }

    public String getPreferredGender() {
        return preferredGender;
    }

    public void setPreferredGender(String preferredGender) {
        this.preferredGender = preferredGender;
    }

    public String getPreferredMaxAge() {
        return preferredMaxAge;
    }

    public void setPreferredMaxAge(String preferredMaxAge) {
        this.preferredMaxAge = preferredMaxAge;
    }

    public String getPreferredProfession() {
        return preferredProfession;
    }

    public void setPreferredProfession(String preferredProfession) {
        this.preferredProfession = preferredProfession;
    }

    public String getPreferredCharacter() {
        return preferredCharacter;
    }

    public void setPreferredCharacter(String preferredCharacter) {
        this.preferredCharacter = preferredCharacter;
    }
}
