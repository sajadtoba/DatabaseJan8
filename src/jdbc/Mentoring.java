package jdbc;

import com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mentoring {
    public static void main(String[] args) throws Exception {

        // We have 3: Connector, user, password
        String url = "jdbc:mysql://localhost:3306/ThursdayMentoring?Timezone=UTC";
        String user = "root";
        String password = "cAt@123";
        // Why do we have use public because we are using a public URL
        // jdbc: Java database connectivity
        //Connection connection = DriverManager.getConnection(url,user,password);
        // We need 3 steps  1:Connection 2: Statement 3: Execute Query
        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            // Create query and initialized with the new values we want to have in the create Table name Robin
            // We can go to our database and type the query to be not made mistake the way we like to enter the value

            // we can create a new object and give any name
             Robin robin = new Robin(8,"Sheikh","Dev","A");

             String query = "insert into Robin(id,name,title,grade)" +
                     "values("+robin.getId()+", '"+robin.getName()+"', '"+robin.getTitle()+"','"+robin.getGrade()+"');";

             //String query = "insert into Robin(id, name, title,grade) values(7,'Shakiir','QA', 'A');";
            statement.execute(query);
            System.out.println("private Variables used to get the values");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Something might have went not good with connection");
        } finally {
            // finally we need to close two methods Connection and Statement

            statement.close();
            connection.close();


        }


    }
}
