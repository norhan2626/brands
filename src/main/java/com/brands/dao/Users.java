package com.brands.dao;
// Generated Apr 15, 2020, 2:02:32 AM by Hibernate Tools 4.3.1


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,catalog="brands"
    , uniqueConstraints = @UniqueConstraint(columnNames="e_mail") 
)
public class Users  implements java.io.Serializable {


    private Integer userId;
    private Cart cart;
    private String userName;
    private String password;
    private Date birthDate;
    private String job;
    private String EMail;
    private Double creditLimit;
    private int role;
    private String address;
    private String status;
    private Set<Products> productses = new HashSet<Products>(0);

    public Users() {
    }


    public Users(Cart cart, String userName, String password, String EMail, int role) {
        this.cart = cart;
        this.userName = userName;
        this.password = password;
        this.EMail = EMail;
        this.role = role;
    }

    public Users(Cart cart, String userName, String password, Date birthDate, String job, String EMail, Double creditLimit, int role, String address, String status, Set<Products> productses) {
        this.cart = cart;
        this.userName = userName;
        this.password = password;
        this.birthDate = birthDate;
        this.job = job;
        this.EMail = EMail;
        this.creditLimit = creditLimit;
        this.role = role;
        this.address = address;
        this.status = status;
        this.productses = productses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)


    @Column(name = "user_id", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    public Cart getCart() {
        return this.cart;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    
    @Column(name="user_name", nullable=false, length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="birth_date", length=10)
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    
    @Column(name="job", length=45)
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }

    
    @Column(name="e_mail", unique=true, nullable=false, length=45)
    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    
    @Column(name="credit_limit", precision=22, scale=0)
    public Double getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    @Column(name = "role", nullable = false)
    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }


    @Column(name = "address", length = 45)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Column(name = "status", length = 45)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    public Set<Products> getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set<Products> productses) {
        this.productses = productses;
    }




}


