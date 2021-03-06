package com.spring.Boot.ECommerceBoot.entities;
// Generated Jan 27, 2021 1:34:35 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Shipperaddress generated by hbm2java
 */
@Entity
@Table(name="shipperaddress"
    ,catalog="ecommerce"
)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
        property = "shipperId",
 scope = Shipperaddress.class)
public class Shipperaddress  implements java.io.Serializable {


     private Integer shipperId;
     private String country;
     private String state;
     private String city;
     private String street;
     private String zipCode;
     private Set<Orders> orderses = new HashSet<Orders>(0);

    public Shipperaddress() {
    }

    public Shipperaddress(String country, String state, String city, String street, String zipCode, Set<Orders> orderses) {
       this.country = country;
       this.state = state;
       this.city = city;
       this.street = street;
       this.zipCode = zipCode;
       this.orderses = orderses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="shipperID", unique=true, nullable=false)
    public Integer getShipperId() {
        return this.shipperId;
    }
    
    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    
    @Column(name="country", length=45)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="state", length=45)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="city", length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="street", length=45)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="zip_code", length=45)
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="shipperaddress", cascade = CascadeType.ALL)
    public Set<Orders> getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set<Orders> orderses) {
        this.orderses = orderses;
    }




}


