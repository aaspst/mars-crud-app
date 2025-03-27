package gr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * Represents a product in the space station resource stock
 */
@Entity
public class Product {

    /**
     * Product's unique identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Product's name
     */
    private String name;

    /**
     * Product's description
     */
    private String description;

    /**
     * Product's price
     */
    private double price;

    /**
     * Default constructor declaration
     */
    public Product() {
    }

    /**
     * Core constructor
     *
     * @param name        the product's name
     * @param description a product's short descritpion
     * @param price       the product's price
     */
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets the unique ID of the prodct
     *
     * @return the product's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the product
     *
     * @param id the products ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the product
     *
     * @return the product's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product
     *
     * @param name the product's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the product's description
     *
     * @return the product's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the porduct
     *
     * @param description the product's descritpion
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Gets the price of the product
     *
     * @return the product's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the description of the porduct
     *
     * @param price the product's price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
