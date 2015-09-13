package com.radusecrieru.dns.manager.dao;

import com.radusecrieru.dns.manager.domain.DomainDNS;
import java.util.List;

public interface DomainDNSDao {
    public DomainDNS findById(Long id);
    public List<DomainDNS> findAllOrderedByName();
    public void addNew(DomainDNS domainDNS);
}
