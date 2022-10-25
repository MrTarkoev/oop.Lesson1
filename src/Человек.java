public class Человек {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Человек(String name, String town, int yearOfBirth, String jobTitle) {

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.town = town;
        this.name = name;
        this.jobTitle = jobTitle;

        if  (name == null || name.isEmpty()) {
            this.name = "Информация не указана!";
        }else {
            this.name = name;
        }
        if  (town == null || town.isEmpty()) {
            this.town = "Информация не указана!";
        }else {
            this.town = town;
        }
        if  (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана!";
        }else {
            this.jobTitle = jobTitle;
        }
    }
}
