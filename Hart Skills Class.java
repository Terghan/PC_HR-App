public class HardSkill {

    private String title;
    private String level;

    //constructor
    public HardSkill(String title, String level) {
        this.title = title;
        this.level = level;
    }

    //sttter Title
    public void setTitle(String title) {
        this.title = title;
    }
//getter Title
    public String getTitle() {
        return this.title;
    }

    //setter Level
    public void setLevel(String level) {
        this.level = level;
    }
// getter Level
    public String getLevel() {
        return this.level;
    }
// displays data
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Skill Level: " + this.level);
    }
}


//end of HardSkill class
