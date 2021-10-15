package com.example.postalcodeservice.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "postal_codes")

public class PostalCode {
    @Id
    @Column(name = "postal_code")
    public int postalCode;

    @Column(name = "creation_date_time")
    public LocalDateTime creationDateTime;

}
