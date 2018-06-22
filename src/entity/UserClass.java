package entity;


public class UserClass {
    /**
     * ID
     */
    private String id;

    /**
     *学生姓名
     */
    private String username;

    /**
     * 课程名称
     */
    private String classname;

    /**
     * 任课教师
     */
    private String classteacher;

    /**
     * 教室编号
     */
    private String classnumber;

    /**
     *学生成绩
     */
    private String sum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(String classteacher) {
        this.classteacher = classteacher;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", classname='" + classname + '\'' +
                ", classteacher='" + classteacher + '\'' +
                ", classnumber='" + classnumber + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }
}
