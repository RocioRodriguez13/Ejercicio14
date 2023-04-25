package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejemplo {

    public static void main(String[] args) {
        try {
           

            Connection micon = DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar", "root", "root");

            
            Statement stmt = micon.createStatement();

           
            String sql = "SELECT * FROM qatar.empleado;";
            ResultSet resultSet = stmt.executeQuery(sql);

          
            System.out.println("Id\t dni\t Nombre\t \tApellido\t Nacionalidad\t dpto\t");
            while (resultSet.next()) {

                System.out.println(resultSet.getInt(1) + "\t " + resultSet.getInt(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t " + resultSet.getString(5) + "\t" + resultSet.getString(6)+"\t" );
                
                
//	        String insertarDB = "insert into `qatar`.`empleado`  values ('6', '33224', 'Azul', 'Martinez', 'Argentina', 'Sistemas')";
//                stmt.executeUpdate(insertarDB);
//                System.out.println("Datos insertados correctamentes");
//
//                insertarDB = "update departamento set nomD = 'Sistemas' where idD = 2";
//
//
//                stmt.executeUpdate(insertarDB);
//                System.out.println("Datos insertados correctamentes");
//
//                insertarDB = "delete from empleado where idE = 1"; 
//                stmt.executeUpdate(insertarDB);
//                //stmt.ex
//                System.out.println("Datos insertados correctamentes");

                
               String insertarDB = "select * from qatar.departamento where dpto='Logística'; ";
                stmt.executeUpdate(insertarDB);
                System.out.println("Datos insertados correctamentes");
                
                
                
                
            }          }catch(Exception e){
		System.out.println("No se pudo realizar la coneccion");
		e.printStackTrace();
		}
        }
}

    
