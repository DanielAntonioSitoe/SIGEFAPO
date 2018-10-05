
package ModeloConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
    public String db="sigefapo";
    public String url="jdbc:mysql://127.0.0.1/"+db;
    public String user="root";
    public String pass="";
    

public conexao() {


}
public Connection conectar() {

Connection link=null;
try{
Class.forName("org.gjt.mm.mysql.Driver");
link=DriverManager.getConnection(this.url,this.user,this.pass);

}
catch (ClassNotFoundException | SQLException e){
JOptionPane.showMessageDialog(null,e);
}
return link;
}
}