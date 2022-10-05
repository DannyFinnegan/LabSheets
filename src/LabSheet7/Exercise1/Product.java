package LabSheet7.Exercise1;

public class Product {

    private int ID;
    private String Name;
    public String Description;

    public Product() {
        Name = "Null";
        Description = "N/A";
    }

    public Product(String Name, String Description) {
        setName(Name);
        setDescription(Description);
    }


    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }


    public void setName(String name) {
        Name = name;
    }


    public String toString() {
        return "\nName: " + Name + "\nDescription: " + Description;
    }
}
