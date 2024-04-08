/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class painting {

    private String url;
    private String name;
    private int cin;
    private double price;
    private int category;
    private String des;

    
    public painting(String fname,String url,double p,int cin,String des,int cat){ 
        this.name=fname;
        this.url=url;
        this.price=p;
        this.cin=cin;
        this.category=cat;
        this.des=des;
        
        
    }
    public int getcin(){
        return(this.cin);
    }

    public double getprice(){
        return(this.price);
    }
    public String getname(){
        return(this.name);
    }
    public String geturl(){
        return(this.url);
    }
        public String getdes(){
        return(this.des);
    }
    public int getcat(){
        return(this.category);
    }
   
    
    

    
    
}
