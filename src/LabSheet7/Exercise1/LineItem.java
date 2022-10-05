package LabSheet7.Exercise1;


public class LineItem {
    private int ID, Quantity;

    public LineItem() {
        ID = 1;
        Quantity = 0;
    }

    public LineItem(int Quantity) {
        setQuantity(Quantity);
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        //this.ID = ID;
        if (this.ID==ID) {
            ID++;
        }
    }

    public String toString() {
        return "\nID: " + ID + "\nQuantity: " + Quantity;
    }
}