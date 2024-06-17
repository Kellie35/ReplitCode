public class Student
{
//step 2-5
  /*String name;
  int gradeLvl;
  double gpa;

  Student(String name, int gradeLvl, double gpa)
  {
    this.name = name;
    this.gradeLvl = gradeLvl;
    this.gpa = gpa;
  }

  public String toString()
  {
    return(name + ", " + gradeLvl + ", " + gpa);
  }*/

    private String name;
    private int gradeLvl;
    private int id;

    Student(String inputName, int grade, int num)
    {
        name = inputName;
        gradeLvl = grade;
        id = num;
    }

    public String toString()
    {
        return(name + ", " + gradeLvl + ", " + id);
    }

    public int getId()
    {
        return(id);
    }

    public boolean equals(Student b)
    {
        if(id == b.getId())
        {
            return(true);
        }
        else
            return(false);
    }

}