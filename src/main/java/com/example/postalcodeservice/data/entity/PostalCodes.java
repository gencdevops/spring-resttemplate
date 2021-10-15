package com.example.postalcodeservice.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "postal_codes")

public class PostalCodes {
    @Id
    @Column(name = "postal_code")
    public int postalCode;

    @Column(name = "creation_date_time")
    public LocalDateTime creationDateTime;

    @OneToMany(mappedBy = "postalCode", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set<PostalCodeInfo> postalCodeInfos;

}
