package com.radusecrieru.dns.manager.test;

import java.util.List;

import junit.framework.Assert;

import com.radusecrieru.dns.manager.domain.DomainName;
import com.radusecrieru.dns.manager.dao.DomainNameDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


public class MemberDaoTest
{
    @Autowired
    private DomainNameDao memberDao;

//    @Test
//    public void testFindById()
//    {
//        DomainName member = memberDao.findById(0l);
//
//        Assert.assertEquals("John Smith", member.getName());
//        Assert.assertEquals("john.smith@mailinator.com", member.getEmail());
//        Assert.assertEquals("2125551212", member.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testFindByEmail()
//    {
//        DomainName member = memberDao.findByEmail("john.smith@mailinator.com");
//
//        Assert.assertEquals("John Smith", member.getName());
//        Assert.assertEquals("john.smith@mailinator.com", member.getEmail());
//        Assert.assertEquals("2125551212", member.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testRegister()
//    {
//        DomainName member = new DomainName();
//        member.setEmail("jane.doe@mailinator.com");
//        member.setName("Jane Doe");
//        member.setPhoneNumber("2125552121");
//
//        memberDao.register(member);
//        Long id = member.getId();
//        Assert.assertNotNull(id);
//        
//        Assert.assertEquals(2, memberDao.findAllOrderedByName().size());
//        DomainName newMember = memberDao.findById(id);
//
//        Assert.assertEquals("Jane Doe", newMember.getName());
//        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
//        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testFindAllOrderedByName()
//    {
//        DomainName member = new DomainName();
//        member.setEmail("jane.doe@mailinator.com");
//        member.setName("Jane Doe");
//        member.setPhoneNumber("2125552121");
//        memberDao.register(member);
//
//        List<DomainName> members = memberDao.findAllOrderedByName();
//        Assert.assertEquals(2, members.size());
//        DomainName newMember = members.get(0);
//
//        Assert.assertEquals("Jane Doe", newMember.getName());
//        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
//        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
}
