package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = portfolio_ID)
    private String Advisor portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Number purchasePrice;

    @Column(nullable = false)
    private Number purchaseDate;

    @Column(nullable = false)
    private Number quantity;

    protected Security() {

    }

    public Security(String firstName, String lastName, String address, String phone, String email) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Number purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Number getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchasePrice = purchasePrice;
    }

    public Number getQuantity() {
        return quantity;
    }

}