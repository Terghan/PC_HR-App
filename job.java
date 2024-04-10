public class job {
    private int JobID;
    private String title;
    private int experience;


  public job(String title, int experience) {
      this.title = title;
      this.experience = experience;
  }

  
  // Setter for job title
  public void setTitle(String title) {
      this.title = title;
  }

  // Setter for months of experience
  public void setExperience(int experience) {
      this.experience = experience;
  }

  // Getter for job title
  public String getTitle() {
      return title;
  }

  // Getter for months of experience
  public int getExperience() {
      return experience;
  }

  // Method to display job details
  public void displayDetails() {
      System.out.println("Title: " + title);
      System.out.println("Experience: " + experience);
  }
}

