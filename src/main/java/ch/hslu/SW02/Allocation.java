package ch.hslu.SW02;

import java.util.Objects;

public class Allocation {
    private String resourceName;
    private int amount;

    // Konstruktor
    public Allocation(String resourceName, int amount) {
        this.resourceName = resourceName;
        this.amount = amount;
    }

    // Getter und Setter
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // toString-Methode zur Ausgabe
    @Override
    public String toString() {
        return "Allocation [Resource: " + resourceName + ", Amount: " + amount + "]";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        return (o instanceof Allocation that)
                && getAmount() == that.getAmount()
                && Objects.equals(getResourceName(), that.getResourceName())
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResourceName(), getAmount());
    }
}

