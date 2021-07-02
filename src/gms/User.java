/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms;

/**
 *
 * @author User
 */
class User {
    private int id;
    private String name,category,brand,costprice,sellprice;
    
    public User(int id,String name,String category,String brand,String costprice,String sellprice)
    {
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.category=category;
        this.costprice=costprice;
        this.sellprice=sellprice;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getbrand(){
        return brand;
    }
    public String getcategory(){
        return category;
    }
    public String getcostprice(){
        return costprice;
    }
    public String getsellprice(){
        return sellprice;
    }
}
