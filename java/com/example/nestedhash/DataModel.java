package com.example.nestedhash;
import java.util.List;

public class DataModel {
    private List<String> nestedList;
  //third adapter


    private String itemText;
    private int img;
    private boolean isExpandable;

    public DataModel(List<String> itemList ,String itemText,int img) {
        this.nestedList = itemList;

        this.itemText = itemText;
        this.img =img;
        isExpandable = false;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public List<String> getNestedList() {
        return nestedList;
    }


    public String getItemText() {
        return itemText;
    }

    public boolean isExpandable() {
        return isExpandable;
    }
}
