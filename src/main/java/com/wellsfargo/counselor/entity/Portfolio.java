package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = client_ID)
    private String Client client;

    @Column(nullable = false)
    private Integer creationDate;

    protected Portfolio() {

    }

    public Portfolio(Number creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public Number getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Number creationDate) {
        this.creationDate = creationDate;
    }

}