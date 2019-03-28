public class User {
    private String name;
    private int age;
    private String phnNo;

    public User(String name, int age, String phnNo, double salary, boolean isIntrested) {
        this.name = name;
        this.age = age;
        this.phnNo = phnNo;
        this.salary = salary;
        this.isIntrested = isIntrested;
    }

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

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isIntrested() {
        return isIntrested;
    }

    public void setIntrested(boolean intrested) {
        isIntrested = intrested;
    }

    private double salary;
    private boolean isIntrested;
}
