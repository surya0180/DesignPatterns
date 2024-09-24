package Practice;

class Profile {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final int age;
    private final boolean isMarried;
    private final boolean isEmployed;

    private Profile(String firstName, String middleName, String lastName, int age, boolean isMarried, boolean isEmployed) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    void view() {
        System.out.println(String.format("Firstname: %s\nMiddlename: %s\nLastname: %s\nAge: %d\nMarriageStatus: %s\nEmploymentStatus: %s\n",
                this.firstName, this.middleName, this.lastName, this.age, this.isMarried, this.isEmployed));
    }

    // Static inner Builder class
    public static class ProfileBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private boolean isMarried;
        private boolean isEmployed;

        public ProfileBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public ProfileBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfileBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public ProfileBuilder setMarried(boolean married) {
            this.isMarried = married;
            return this;
        }

        public ProfileBuilder setEmployed(boolean employed) {
            this.isEmployed = employed;
            return this;
        }

        public Profile build() {
            return new Profile(firstName, middleName, lastName, age, isMarried, isEmployed);
        }
    }
}
public class Builder {
    public static void main(String[] args) {
        Profile myProfile = new Profile.ProfileBuilder().setFirstName("Surya").setLastName("Teja").setAge(25).build();
        myProfile.view();
    }
}

