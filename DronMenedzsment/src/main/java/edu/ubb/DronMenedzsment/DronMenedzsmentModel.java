package edu.ubb.DronMenedzsment;


public class DronMenedzsmentModel {
    private int id;
    private String name;
    private int quantity;
    private boolean isAvailable;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return "Id " + id + " Name " + name + "Quantity " + quantity + " IsAvailable: " + isAvailable;
    }

    public DronMenedzsmentModel() {
        super();
    }

    public DronMenedzsmentModel(int id, String name, int quantity, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
    }
}