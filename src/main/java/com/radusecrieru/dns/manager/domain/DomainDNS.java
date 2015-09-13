package com.radusecrieru.dns.manager.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DomainDNS", uniqueConstraints = @UniqueConstraint(columnNames = "Value"))
public class DomainDNS implements Serializable {

    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;

    private Long id;
    @JsonIgnore
    private DomainName domainName;
    private String name;
    private String type;
    private String value;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DomainID", nullable = false)
    public DomainName getDomainName() {
        return domainName;
    }

    public void setDomainName(DomainName domainName) {
        this.domainName = domainName;
    }

    @Column(name = "Name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Type", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "Value", unique = true, nullable = false)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
