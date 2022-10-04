package LabSheet7.Exercise1;

public class Product {

    private int ID;
    private String Name, Description;

    public Product()
    {
        ID=0;
        Name="Null";
        Description="Null";
    }
   /* public Product(int ID,String Name , String Description)
    {
        setID(ID);
        setName(Name);
        setDescription(Description);
    } */
    public int getID()
        {
            return ID;
        }

    public String getDescription() {
        return Description;
    }
}
