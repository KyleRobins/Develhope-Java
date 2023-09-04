package Exercises;

interface LearningPerson {
    void studyAtHome();
}

interface TeachingPerson {
    void teachToOtherPeople();
}

class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("College ID: " + collegeId);
    }
}

class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Student " + name + " is studying at home.");
    }
}

class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor " + name + " is teaching " + teachingSubject + ".");
    }
}

class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Assistant " + name + " is studying at home.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant " + name + " is teaching other people.");
    }
}

public class CollegePersonTester {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 12345, 2);
        Professor professor = new Professor("Jane", "Smith", 54321, "Mathematics");
        Assistant assistant = new Assistant("Alice", "Johnson", 98765, true);

        student.goToCollege();
        student.studyAtHome();

        professor.goToCollege();
        professor.teachToOtherPeople();

        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
