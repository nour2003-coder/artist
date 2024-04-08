/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.painting;

/**
 *
 * @author user
 */
public class readDao {
    public static void save(painting r){
     String query = "INSERT INTO painting (name, url, description, price, artist_cin, id_cat) VALUES ('" + r.getname() + "', '" + r.geturl() + "', '"+ r.getdes() +"', '" + r.getprice() + "', '" + r.getcin() + "', '"+ r.getcat() +"');";


     DbOperations.setDataOrDelete(query,"upload successfully!");
        
    }
    
}
