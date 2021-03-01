package day6;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLesson() {
        return lesson;
    }
    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    
    public void evaluate(Student student) {
        int a = 2;
        int b = 4;
        int random_number = a + (int) (Math.random() * b);

        String evaluation = "";
        switch (random_number) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println(this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.lesson + " на оценку " + evaluation);


    }
}
