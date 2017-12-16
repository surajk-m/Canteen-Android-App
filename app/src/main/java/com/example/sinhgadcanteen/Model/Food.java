package com.example.sinhgadcanteen.Model;


/**
 * Created by S5K007 on 9/21/2017.
 */

public class Food {

    private String Name,Image,Price,MenuId;

    public Food() {
    }

    public Food(String name, String image, String price, String menuId) {
        Name = name;
        Image = image;
        Price = price;
        MenuId = menuId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
