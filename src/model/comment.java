/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class comment {
    private String contenu;
    private int cin;
    private int painting_id;

    
    public comment(String contenu,int id,int cin){ 
        this.contenu=contenu;
        this.painting_id=id;
        this.cin=cin;
        
        
    }
    public int getcin(){
        return(this.cin);
    }
    public int getid(){
        return(this.painting_id);
    }


    public String getcontenu(){
        return(this.contenu);
    }

   
    
    
}
