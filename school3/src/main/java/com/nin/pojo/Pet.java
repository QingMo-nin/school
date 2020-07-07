package com.nin.pojo;

import java.util.Date;
import javax.persistence.*;

public class Pet {
    @Id
    private Integer id;

    private String name;

    @Column(name = "typeName")
    private String typename;

    private Integer health;

    private Integer love;

    private Date birthday;

    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "store_id")
    private Integer storeId;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return typeName
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * @return health
     */
    public Integer getHealth() {
        return health;
    }

    /**
     * @param health
     */
    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     * @return love
     */
    public Integer getLove() {
        return love;
    }

    /**
     * @param love
     */
    public void setLove(Integer love) {
        this.love = love;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return owner_id
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return store_id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * @param storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}