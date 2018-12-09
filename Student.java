public class Student {
  private String studentName;
  private String phoneNumber;
  private String rollNumber;
  private String studentClass;

    Student(){
        
    }
    
    // Setter Methods 
  public void setStudentName( String studentName ) {
    this.studentName = studentName;
  }

  public void setPhoneNumber( String phoneNumber ) {
    this.phoneNumber = phoneNumber;
  }

  public void setRollNumber( String rollNumber ) {
    this.rollNumber = rollNumber;
  }

  public void setStudentClass( String studentClass ) {
    this.studentClass = studentClass;
  }
  
 // Getter Methods 
  public String getStudentName() {
    return studentName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getRollNumber() {
    return rollNumber;
  }

  public String getStudentClass() {
    return studentClass;
  }

 
  
  public static void main(String args[]){
      Student st = new Student();
      st.setStudentName("Garima Shrivastav");
      st.setPhoneNumber("9819501290");
      st.setRollNumber("123");
      st.setStudentClass("B");
      
      System.out.println("Student name ="+st.getStudentName());
      System.out.println("Student phone number ="+st.getPhoneNumber());
      System.out.println("Student roll number ="+st.getRollNumber());
      System.out.println("Student class ="+st.getStudentClass());
     
    
  }
}