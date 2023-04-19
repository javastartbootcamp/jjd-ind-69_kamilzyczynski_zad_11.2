package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException("Nie wprowadzono imienia");
        } else if (firstName.length() <= 2) {
            throw new NameUndefinedException("Wprowadzone imię nie może mieć mniej niż 2 litery");
        }
    }

    private void checkLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException("Nie wprowadzono nazwiska");
        } else if (lastName.length() <= 2) {
            throw new NameUndefinedException("Wprowadzone nazwisko nie może mieć mniej niż 2 litery");
        }
    }

    private void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Wprowadzony wiek nie może być mniejszy niż 1");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
