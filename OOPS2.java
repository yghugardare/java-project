class Person{
  private String name;
  private int age;
  private String email;
  //Create a constructor to initialize these fields.
  Person(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
  }
  //Implement getter methods for name, age, and email to allow access to these fields.
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getEmail(){
    return email;
  }
//Implement setter methods for age and email with the following rules:
  //The age must be between 0 and 120.
  public void setAge(int age){
    if(age>=0 && age<=120){
      this.age = age;
    }
  }
  //The email should contain the "@" symbol.  
  public void setEmail(String email){
    if(email.contains("@")){
      this.email = email;
    }
  }
}
public class Main {
  public static void main(String[] args) {
    // create a "Person" object, set values for the fields, and demonstrate the use of getter and setter methods.
    Person p = new Person("John", 25, "tzirw@example.com");
    String pName = p.getName();
    p.setAge(40);
    int pAge = p.getAge();
    p.setEmail("tugrpexample.com");
    String pEmail = p.getEmail();
    System.out.println(pName+" "+pAge+" "+pEmail);
    
  }
}
