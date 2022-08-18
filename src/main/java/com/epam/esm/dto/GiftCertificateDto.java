package com.epam.esm.dto;

import javax.sql.DataSource;
import java.sql.Date;

public class GiftCertificateDto {
    private long id;
    private String name;
    private String description;
    private double price;
    private int duration;
    private Date create_date;
    private Date last_update_date;
    private long TagId;


    public GiftCertificateDto(String name, String description, double price, int duration, Date create_date, Date last_update_date, long tagId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.create_date = create_date;
        this.last_update_date = last_update_date;
        TagId = tagId;
    }

    public GiftCertificateDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public long getTagId() {
        return TagId;
    }

    public void setTagId(long tagId) {
        TagId = tagId;
    }
}
