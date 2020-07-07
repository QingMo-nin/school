package com.nin.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Account {
    @Id
    private Integer id;

    @Column(name = "deal_type")
    private Integer dealType;

    @Column(name = "pet_id")
    private Integer petId;

    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "buyer_id")
    private Integer buyerId;

    private Integer price;

    @Column(name = "deal_time")
    private Date dealTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return deal_type
     */
    public Integer getDealType() {
        return dealType;
    }

    /**
     * @param dealType
     */
    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }

    /**
     * @return pet_id
     */
    public Integer getPetId() {
        return petId;
    }

    /**
     * @param petId
     */
    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    /**
     * @return seller_id
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * @return buyer_id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return deal_time
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * @param dealTime
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", dealType=" + dealType +
                ", petId=" + petId +
                ", sellerId=" + sellerId +
                ", buyerId=" + buyerId +
                ", price=" + price +
                ", dealTime=" + dealTime +
                '}';
    }
}