package com.radusecrieru.dns.manager.dao.impl;

import com.radusecrieru.dns.manager.dao.DomainNameDao;
import com.radusecrieru.dns.manager.domain.DomainDNS;
import com.radusecrieru.dns.manager.domain.DomainName;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DomainNameDaoImpl implements DomainNameDao {
    
    @Autowired
    private SessionFactory sessionFactory;

        
    @Override
    public DomainName findById(Long id) {
        return (DomainName) sessionFactory.getCurrentSession().get(DomainName.class, id);
    }

    @Override
    public List<DomainName> findAllOrderedByDomainName() {
        return sessionFactory.getCurrentSession().createQuery("select new DomainName(domainId, domainName) from DomainName order by domainName").list();
    }

    @Override
    public void addNew(DomainName domainName) {
        sessionFactory.getCurrentSession().save(domainName);
    }

    @Override
    public void addDomainDNSs(Long id, List<DomainDNS> domainDNSs) {
        DomainName domainName = findById(id);
        for (DomainDNS domainDNS : domainDNSs) {
            domainDNS.setDomainName(domainName);
            sessionFactory.getCurrentSession().save(domainDNS);
        }
    }
}
