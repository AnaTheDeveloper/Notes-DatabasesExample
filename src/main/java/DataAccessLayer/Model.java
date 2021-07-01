package DataAccessLayer;

public class Model {


  private String name = "";
  private int age = 0;
  private String birthPlace = "";


  //Represents the features of the template.

  public Model(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //The constructor represents the specific features that are required.

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  //The getters and setters represent a way for people to change their features. But also allows the programmer to get information.


  @Override
  public String toString() {
    return "DataAccessLayer.Model{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", birthPlace='" + birthPlace + '\'' +
        '}';
  }
  //Allows the programmer to be able to see the output. Otherwise it just prints out the location of the profiles saved on the computer.
}
