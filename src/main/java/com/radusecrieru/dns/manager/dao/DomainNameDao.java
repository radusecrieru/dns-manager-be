package com.radusecrieru.dns.manager.dao;

import com.radusecrieru.dns.manager.domain.DomainDNS;
import java.util.List;

import com.radusecrieru.dns.manager.domain.DomainName;

public interface DomainNameDao {
    public DomainName findById(Long id);
    public List<DomainName> findAllOrderedByDomainName();
    public void addNew(DomainName domainName);
    public void addDomainDNSs(Long id, List<DomainDNS> domainDNSs);
}
