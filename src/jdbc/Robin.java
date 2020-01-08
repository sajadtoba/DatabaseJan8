package jdbc;

public class Robin {

//    -------+-------------+------+-----+---------+-------+
//| Field | Type        | Null | Key | Default | Extra |
//+-------+-------------+------+-----+---------+-------+
//| id    | int(4)      | YES  |     | NULL    |       |
//| name  | varchar(40) | YES  |     | NULL    |       |
//| title | varchar(30) | YES  |     | NULL    |       |
//| grade | varchar(8)  | YES  |     | NULL    |       |
//+-------+-------------+------+-----+---------+-------+

     private int id;
     private String name;
     private String title;
     private String grade;

    public Robin(int id, String name, String title, String grade) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
