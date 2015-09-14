package com.radusecrieru.dns.manager.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DomainName", uniqueConstraints = @UniqueConstraint(columnNames = "DomainName"))
@JsonInclude(Include.NON_EMPTY)
public class DomainName implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long domainId;
    private String domainName;   
    private Set<DomainDNS> domainDNSs;

    public DomainName() {
    }

    public DomainName(Long domainId, String domainName) {
        this.domainId = domainId;
        this.domainName = domainName;
    }    
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "DomainID", unique = true, nullable = false)
    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    @Column(name = "DomainName", unique = true, nullable = false)
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "domainName")
    public Set<DomainDNS> getDomainDNSs() {
        return domainDNSs;
    }

    public void setDomainDNSs(Set<DomainDNS> domainDNSs) {
        this.domainDNSs = domainDNSs;
    }

}
