package com.radusecrieru.dns.manager.mvc;

import com.radusecrieru.dns.manager.dao.DomainDNSDao;
import java.util.List;

import com.radusecrieru.dns.manager.domain.DomainName;
import com.radusecrieru.dns.manager.dao.DomainNameDao;
import com.radusecrieru.dns.manager.domain.DomainDNS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/domainNames")
public class DomainNameRestController {

    @Autowired
    private DomainNameDao domainNameDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<DomainName> listAllDomainNames() {
        return domainNameDao.findAllOrderedByDomainName();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public @ResponseBody
    DomainName lookupDomainNameById(@PathVariable("id") Long id) {
        return domainNameDao.findById(id);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE,  produces = APPLICATION_JSON_VALUE)
    public @ResponseBody void addDNSEntriesToDomainName(@PathVariable("id") Long id, @RequestBody List<DomainDNS> domainDNSs) {
        domainNameDao.addDomainDNSs(id, domainDNSs);
    }
}
